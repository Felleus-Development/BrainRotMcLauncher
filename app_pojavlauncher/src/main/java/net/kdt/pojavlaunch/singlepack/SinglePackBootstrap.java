package net.kdt.pojavlaunch.singlepack;

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
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/**
 * Fork helper: one fixed profile, optional download + unzip of a server-hosted pack.
 */
public final class SinglePackBootstrap {
    private static final String TAG = "SinglePackBootstrap";
    private static final int CONNECT_MS = 30_000;
    private static final int READ_MS = 600_000;

    private SinglePackBootstrap() {}

    public static boolean isEnabled() {
        return BuildConfig.SINGLE_PACK_MODE;
    }

    /**
     * Called at the end of {@link net.kdt.pojavlaunch.value.launcherprofiles.LauncherProfiles#load()}.
     */
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

    /**
     * Whether we must download/extract before opening the main launcher (first run or pack update).
     */
    public static boolean needsBootstrap() {
        if (!BuildConfig.SINGLE_PACK_MODE) return false;
        String url = BuildConfig.SINGLE_PACK_ZIP_URL == null ? "" : BuildConfig.SINGLE_PACK_ZIP_URL.trim();
        if (url.isEmpty()) {
            Log.w(TAG, "SINGLE_PACK_MODE is true but SINGLE_PACK_ZIP_URL is empty — skipping download.");
            return false;
        }

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

    /**
     * Download ZIP from {@link BuildConfig#SINGLE_PACK_ZIP_URL}, replace instance dir, bump pref version, enforce profile.
     */
    public static void downloadAndInstall() throws IOException {
        if (!BuildConfig.SINGLE_PACK_MODE) return;

        String url = BuildConfig.SINGLE_PACK_ZIP_URL == null ? "" : BuildConfig.SINGLE_PACK_ZIP_URL.trim();
        if (url.isEmpty()) {
            throw new IOException("SINGLE_PACK_ZIP_URL is not set");
        }

        File zipFile = new File(Tools.DIR_CACHE, "single_pack_import.zip");
        downloadLargeFile(url, zipFile);

        File instanceRoot = getInstanceRoot();
        if (instanceRoot.exists()) {
            FileUtils.deleteDirectory(instanceRoot);
        }
        net.kdt.pojavlaunch.utils.FileUtils.ensureDirectory(instanceRoot);

        try (java.util.zip.ZipFile zf = new java.util.zip.ZipFile(zipFile)) {
            ZipUtils.zipExtract(zf, "", instanceRoot);
        }
        if (!zipFile.delete()) {
            Log.w(TAG, "Could not delete temp zip: " + zipFile.getAbsolutePath());
        }

        LauncherPreferences.DEFAULT_PREF.edit()
                .putInt(SinglePackConstants.PREF_INSTALLED_CONTENT_VERSION, BuildConfig.SINGLE_PACK_CONTENT_VERSION)
                .apply();

        LauncherProfiles.load();
        enforceProfileIfEnabled();
    }

    private static void downloadLargeFile(String urlString, File destination) throws IOException {
        HttpURLConnection conn = (HttpURLConnection) new URL(urlString).openConnection();
        conn.setConnectTimeout(CONNECT_MS);
        conn.setReadTimeout(READ_MS);
        conn.setRequestProperty("User-Agent", Tools.APP_NAME);
        if (conn instanceof HttpsURLConnection) {
            // defaults OK for normal HTTPS
        }
        conn.connect();
        int code = conn.getResponseCode();
        if (code != HttpURLConnection.HTTP_OK) {
            conn.disconnect();
            throw new IOException("HTTP " + code + " when downloading pack");
        }
        try (java.io.InputStream in = conn.getInputStream();
             java.io.FileOutputStream out = new java.io.FileOutputStream(destination)) {
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
