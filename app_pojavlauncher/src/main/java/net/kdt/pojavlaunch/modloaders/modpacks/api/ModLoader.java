package net.kdt.pojavlaunch.modloaders.modpacks.api;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.Nullable;

import net.kdt.pojavlaunch.JavaGUILauncherActivity;
import net.kdt.pojavlaunch.modloaders.FabriclikeDownloadTask;
import net.kdt.pojavlaunch.modloaders.FabriclikeUtils;
import net.kdt.pojavlaunch.modloaders.ForgeDownloadTask;
import net.kdt.pojavlaunch.modloaders.ForgeUtils;
import net.kdt.pojavlaunch.modloaders.ModloaderDownloadListener;

import java.io.File;
import java.io.IOException;

public class ModLoader {
    public static final int MOD_LOADER_FORGE = 0;
    public static final int MOD_LOADER_FABRIC = 1;
    public static final int MOD_LOADER_QUILT = 2;
    public final int modLoaderType;
    public final String modLoaderVersion;
    public final String minecraftVersion;

    public ModLoader(int modLoaderType, String modLoaderVersion, String minecraftVersion) {
        this.modLoaderType = modLoaderType;
        this.modLoaderVersion = modLoaderVersion;
        this.minecraftVersion = minecraftVersion;
    }

    /**
     * Get the Version ID (the name of the mod loader in the versions/ folder)
     * @return the Version ID as a string
     */
    public String getVersionId() {
        switch (modLoaderType) {
            case MOD_LOADER_FORGE:
                return minecraftVersion+"-forge-"+modLoaderVersion;
            case MOD_LOADER_FABRIC:
                return "fabric-loader-"+modLoaderVersion+"-"+minecraftVersion;
            case MOD_LOADER_QUILT:
                return "quilt-loader-"+modLoaderVersion+"-"+minecraftVersion;
            default:
                return null;
        }
    }

    /**
     * Get the Runnable that needs to run in order to download the mod loader.
     * The task will also install the mod loader if it does not require GUI installation
     * @param listener the listener that gets notified of the installation status
     * @return the task Runnable that needs to be ran
     */
    public Runnable getDownloadTask(ModloaderDownloadListener listener) {
        switch (modLoaderType) {
            case MOD_LOADER_FORGE:
                return new ForgeDownloadTask(listener, minecraftVersion, modLoaderVersion);
            case MOD_LOADER_FABRIC:
                return createFabriclikeTask(listener, FabriclikeUtils.FABRIC_UTILS);
            case MOD_LOADER_QUILT:
                return createFabriclikeTask(listener, FabriclikeUtils.QUILT_UTILS);
            default:
                return null;
        }
    }

    /**
     * Get the Intent to start the graphical installation of the mod loader.
     * This method should only be ran after the download task of the specified mod loader finishes.
     * This method returns null if the mod loader does not require GUI installation
     * @param context the package resolving Context (can be the base context)
     * @param modInstallerJar the JAR file of the mod installer, provided by ModloaderDownloadListener after the installation
     *                        finishes.
     * @return the Intent which the launcher needs to start in order to install the mod loader
     */
    public Intent getInstallationIntent(Context context, File modInstallerJar) {
        Intent baseIntent = new Intent(context, JavaGUILauncherActivity.class);
        switch (modLoaderType) {
            case MOD_LOADER_FORGE:
                ForgeUtils.addAutoInstallArgs(baseIntent, modInstallerJar, getVersionId());
                return baseIntent;
            case MOD_LOADER_QUILT:
            case MOD_LOADER_FABRIC:
            default:
                return null;
        }
    }

    /**
     * Check whether the mod loader this object denotes requires GUI installation
     * @return true if mod loader requires GUI installation, false otherwise
     */
    public boolean requiresGuiInstallation() {
        switch (modLoaderType) {
            case MOD_LOADER_FORGE:
                return true;
            case MOD_LOADER_FABRIC:
            case MOD_LOADER_QUILT:
            default:
                return false;
        }
    }

    private FabriclikeDownloadTask createFabriclikeTask(ModloaderDownloadListener modloaderDownloadListener, FabriclikeUtils utils) {
        return new FabriclikeDownloadTask(modloaderDownloadListener, utils, minecraftVersion, modLoaderVersion, false);
    }

    @Nullable
    public static ModLoader parseVersionId(String versionId) {
        if (versionId == null) return null;
        String[] fabriclikeParts = splitFabriclikeVersionId(versionId, "fabric-loader-");
        if (fabriclikeParts != null) {
            return new ModLoader(MOD_LOADER_FABRIC, fabriclikeParts[0], fabriclikeParts[1]);
        }
        fabriclikeParts = splitFabriclikeVersionId(versionId, "quilt-loader-");
        if (fabriclikeParts != null) {
            return new ModLoader(MOD_LOADER_QUILT, fabriclikeParts[0], fabriclikeParts[1]);
        }
        int forgeIndex = versionId.indexOf("-forge-");
        if (forgeIndex > 0) {
            return new ModLoader(
                    MOD_LOADER_FORGE,
                    versionId.substring(forgeIndex + "-forge-".length()),
                    versionId.substring(0, forgeIndex)
            );
        }
        return null;
    }

    public static boolean ensureVersionJsonInstalled(String versionId) throws IOException {
        ModLoader modLoader = parseVersionId(versionId);
        if (modLoader == null) return false;
        switch (modLoader.modLoaderType) {
            case MOD_LOADER_FABRIC:
                FabriclikeDownloadTask.installVersionJson(
                        FabriclikeUtils.FABRIC_UTILS, modLoader.minecraftVersion, modLoader.modLoaderVersion);
                return true;
            case MOD_LOADER_QUILT:
                FabriclikeDownloadTask.installVersionJson(
                        FabriclikeUtils.QUILT_UTILS, modLoader.minecraftVersion, modLoader.modLoaderVersion);
                return true;
            default:
                return false;
        }
    }

    @Nullable
    private static String[] splitFabriclikeVersionId(String versionId, String prefix) {
        if (!versionId.startsWith(prefix)) return null;
        String rest = versionId.substring(prefix.length());
        for (int i = rest.length() - 1; i >= 0; i--) {
            if (rest.charAt(i) != '-') continue;
            String minecraftVersion = rest.substring(i + 1);
            if (minecraftVersion.matches("\\d+\\.\\d+.*")) {
                return new String[]{rest.substring(0, i), minecraftVersion};
            }
        }
        return null;
    }
}
