package net.kdt.pojavlaunch.singlepack;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import androidx.annotation.NonNull;

import net.kdt.pojavlaunch.BuildConfig;
import net.kdt.pojavlaunch.Tools;
import net.kdt.pojavlaunch.prefs.LauncherPreferences;
import net.kdt.pojavlaunch.utils.ZipUtils;
import net.kdt.pojavlaunch.value.launcherprofiles.LauncherProfiles;
import net.kdt.pojavlaunch.value.launcherprofiles.MinecraftLauncherProfiles;
import net.kdt.pojavlaunch.value.launcherprofiles.MinecraftProfile;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

public final class SinglePackBootstrap {
    private static final String TAG = "SinglePackBootstrap";
    private static final int CONNECT_MS = 30_000;
    private static final int READ_MS = 600_000;

    private SinglePackBootstrap() {}

    public static boolean isEnabled() {
        return BuildConfig.SINGLE_PACK_MODE;
    }

    public static void enforceProfileIfEnabled() {
        if (!BuildConfig.SINGLE_PACK_MODE) return;

        if (LauncherProfiles.mainProfileJson == null) {
            LauncherProfiles.mainProfileJson = new MinecraftLauncherProfiles();
        }
        if (LauncherProfiles.mainProfileJson.profiles == null) {
            LauncherProfiles.mainProfileJson.profiles = new HashMap<>();
        }

        MinecraftProfile profile = new MinecraftProfile();
        profile.name = BuildConfig.SINGLE_PACK_DISPLAY_NAME;
        profile.lastVersionId = BuildConfig.SINGLE_PACK_VERSION_ID;
        profile.gameDir = SinglePackConstants.RELATIVE_GAME_DIR;

        MinecraftProfile existing = LauncherProfiles.mainProfileJson.profiles.get(SinglePackConstants.PROFILE_KEY);
        boolean sameOne = LauncherProfiles.mainProfileJson.profiles.size() == 1
                && existing != null
                && Objects.equals(existing.name, profile.name)
                && Objects.equals(existing.lastVersionId, profile.lastVersionId)
                && Objects.equals(existing.gameDir, profile.gameDir);
        if (!sameOne) {
            LauncherProfiles.mainProfileJson.profiles.clear();
            LauncherProfiles.mainProfileJson.profiles.put(SinglePackConstants.PROFILE_KEY, profile);
            LauncherProfiles.write();
        }

        String current = LauncherPreferences.DEFAULT_PREF.getString(LauncherPreferences.PREF_KEY_CURRENT_PROFILE, "");
        if (!SinglePackConstants.PROFILE_KEY.equals(current)) {
            LauncherPreferences.DEFAULT_PREF.edit()
                    .putString(LauncherPreferences.PREF_KEY_CURRENT_PROFILE, SinglePackConstants.PROFILE_KEY)
                    .apply();
        }
    }

    public static boolean hasEmbeddedPack(@NonNull Context context) {
        if (!BuildConfig.SINGLE_PACK_MODE) return false;
        AssetManager assets = context.getAssets();
        try (InputStream in = assets.open(SinglePackConstants.EMBEDDED_PACK_ASSET)) {
            return in != null;
        } catch (IOException e) {
            return false;
        }
    }

    public static boolean hasRemotePack() {
        String url = BuildConfig.SINGLE_PACK_ZIP_URL == null ? "" : BuildConfig.SINGLE_PACK_ZIP_URL.trim();
        return !url.isEmpty();
    }

    public static boolean needsBootstrap(@NonNull Context context) {
        if (!BuildConfig.SINGLE_PACK_MODE) return false;
        if (!hasEmbeddedPack(context) && !hasRemotePack()) return false;

        int installed = LauncherPreferences.DEFAULT_PREF.getInt(SinglePackConstants.PREF_INSTALLED_CONTENT_VERSION, 0);
        if (installed < BuildConfig.SINGLE_PACK_CONTENT_VERSION) return true;

        File instanceRoot = getInstanceRoot();
        String[] list = instanceRoot.list();
        return !instanceRoot.isDirectory() || list == null || list.length == 0;
    }

    @NonNull
    public static File getInstanceRoot() {
        return new File(Tools.DIR_GAME_HOME, SinglePackConstants.RELATIVE_GAME_DIR.replaceFirst("^\\./", ""));
    }

    public static void installPack(@NonNull Context context) throws IOException {
        if (!BuildConfig.SINGLE_PACK_MODE) return;

        File zipFile = new File(Tools.DIR_CACHE, "single_pack_import.zip");
        if (hasEmbeddedPack(context)) {
            copyEmbeddedPackToFile(context, zipFile);
        } else if (hasRemotePack()) {
            downloadLargeFile(BuildConfig.SINGLE_PACK_ZIP_URL.trim(), zipFile);
        } else {
            throw new IOException("No embedded or remote pack configured");
        }

        extractPackZip(zipFile);
        if (!zipFile.delete()) {
            Log.w(TAG, "Could not delete temp zip: " + zipFile.getAbsolutePath());
        }

        LauncherPreferences.DEFAULT_PREF.edit()
                .putInt(SinglePackConstants.PREF_INSTALLED_CONTENT_VERSION, BuildConfig.SINGLE_PACK_CONTENT_VERSION)
                .apply();

        LauncherProfiles.load();
        enforceProfileIfEnabled();
    }

    private static void copyEmbeddedPackToFile(Context context, File destination) throws IOException {
        net.kdt.pojavlaunch.utils.FileUtils.ensureParentDirectory(destination);
        try (InputStream in = context.getAssets().open(SinglePackConstants.EMBEDDED_PACK_ASSET);
             FileOutputStream out = new FileOutputStream(destination)) {
            byte[] buf = new byte[65536];
            int n;
            while ((n = in.read(buf)) != -1) {
                out.write(buf, 0, n);
            }
        }
    }

    private static void extractPackZip(File zipFile) throws IOException {
        File instanceRoot = getInstanceRoot();
        if (instanceRoot.exists()) {
            FileUtils.deleteDirectory(instanceRoot);
        }
        net.kdt.pojavlaunch.utils.FileUtils.ensureDirectory(instanceRoot);

        try (java.util.zip.ZipFile zf = new java.util.zip.ZipFile(zipFile)) {
            ZipUtils.zipExtract(zf, "", instanceRoot);
        }
    }

    private static void downloadLargeFile(String urlString, File destination) throws IOException {
        HttpURLConnection conn = (HttpURLConnection) new URL(urlString).openConnection();
        conn.setConnectTimeout(CONNECT_MS);
        conn.setReadTimeout(READ_MS);
        conn.setRequestProperty("User-Agent", Tools.APP_NAME);
        conn.connect();
        int code = conn.getResponseCode();
        if (code != HttpURLConnection.HTTP_OK) {
            conn.disconnect();
            throw new IOException("HTTP " + code + " when downloading pack");
        }
        try (InputStream in = conn.getInputStream();
             FileOutputStream out = new FileOutputStream(destination)) {
            byte[] buf = new byte[65536];
            int n;
            while ((n = in.read(buf)) != -1) {
                out.write(buf, 0, n);
            }
        } finally {
            conn.disconnect();
        }
    }
}
