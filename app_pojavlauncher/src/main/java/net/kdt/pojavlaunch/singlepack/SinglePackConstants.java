package net.kdt.pojavlaunch.singlepack;

/**
 * Fixed profile identity for single-pack (fork) builds. Must be a valid UUID string.
 */
public final class SinglePackConstants {
    private SinglePackConstants() {}

    /** Stable key so {@link net.kdt.pojavlaunch.value.launcherprofiles.LauncherProfiles} normalization keeps it. */
    public static final String PROFILE_KEY = "a0000000-0000-4000-8000-000000000001";

    /** Same convention as modpack installer profiles ({@code ./custom_instances/…}). */
    public static final String RELATIVE_GAME_DIR = "./custom_instances/single_pack";

    public static final String PREF_INSTALLED_CONTENT_VERSION = "singlePackContentVersion";
}
