package net.kdt.pojavlaunch.modloaders;

import com.kdt.mcgui.ProgressLayout;

import net.kdt.pojavlaunch.R;
import net.kdt.pojavlaunch.Tools;
import net.kdt.pojavlaunch.progresskeeper.ProgressKeeper;
import net.kdt.pojavlaunch.utils.DownloadUtils;
import net.kdt.pojavlaunch.utils.FileUtils;
import net.kdt.pojavlaunch.value.launcherprofiles.LauncherProfiles;
import net.kdt.pojavlaunch.value.launcherprofiles.MinecraftProfile;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

public class FabriclikeDownloadTask implements Runnable, Tools.DownloaderFeedback{
    private final ModloaderDownloadListener mModloaderDownloadListener;
    private final FabriclikeUtils mUtils;
    private final String mGameVersion;
    private final String mLoaderVersion;
    private final boolean mCreateProfile;
    public FabriclikeDownloadTask(ModloaderDownloadListener modloaderDownloadListener, FabriclikeUtils utils, String mGameVersion, String mLoaderVersion, boolean mCreateProfile) {
        this.mModloaderDownloadListener = modloaderDownloadListener;
        this.mUtils = utils;
        this.mGameVersion = mGameVersion;
        this.mLoaderVersion = mLoaderVersion;
        this.mCreateProfile = mCreateProfile;
    }

    @Override
    public void run() {
        ProgressKeeper.submitProgress(ProgressLayout.INSTALL_MODPACK, 0, R.string.fabric_dl_progress);
        try {
            if(runCatching()) mModloaderDownloadListener.onDownloadFinished(null);
            else mModloaderDownloadListener.onDataNotAvailable();
        }catch (IOException e) {
            mModloaderDownloadListener.onDownloadError(e);
        }
        ProgressLayout.clearProgress(ProgressLayout.INSTALL_MODPACK);
    }

    public static void installVersionJson(FabriclikeUtils utils, String gameVersion, String loaderVersion) throws IOException {
        String fabricJson = DownloadUtils.downloadString(utils.createJsonDownloadUrl(gameVersion, loaderVersion));
        String versionId;
        try {
            versionId = new JSONObject(fabricJson).getString("id");
        } catch (JSONException e) {
            throw new IOException("Invalid mod loader version JSON", e);
        }
        File versionJsonDir = new File(Tools.DIR_HOME_VERSION, versionId);
        File versionJsonFile = new File(versionJsonDir, versionId + ".json");
        FileUtils.ensureDirectory(versionJsonDir);
        Tools.write(versionJsonFile.getAbsolutePath(), fabricJson);
    }

    private boolean runCatching() throws IOException{
        installVersionJson(mUtils, mGameVersion, mLoaderVersion);
        if(mCreateProfile) {
            LauncherProfiles.load();
            MinecraftProfile fabricProfile = new MinecraftProfile();
            String prefix = mUtils == FabriclikeUtils.QUILT_UTILS ? "quilt-loader-" : "fabric-loader-";
            fabricProfile.lastVersionId = prefix + mLoaderVersion + "-" + mGameVersion;
            fabricProfile.name = mUtils.getName();
            fabricProfile.icon = mUtils.getIconName();
            LauncherProfiles.insertMinecraftProfile(fabricProfile);
            LauncherProfiles.write();
        }
        return true;
    }

    @Override
    public void updateProgress(int curr, int max) {
        int progress100 = (int)(((float)curr / (float)max)*100f);
        ProgressKeeper.submitProgress(ProgressLayout.INSTALL_MODPACK, progress100, R.string.fabric_dl_progress, mUtils.getName());
    }
}
