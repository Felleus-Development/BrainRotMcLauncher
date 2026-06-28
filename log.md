Run gradle/actions/setup-gradle@v6
Merged default JDK locations into /home/runner/.m2/toolchains.xml
Enhanced Caching: This build is using the proprietary 'gradle-actions-caching' provider for optimized caching support. See https://github.com/gradle/actions/blob/main/DISTRIBUTION.md for terms of use and opt-out instructions.
Restore Gradle state from cache
All Gradle Wrapper jars are valid
Provision Gradle 8.11
44s
Run ./scripts/languagelist_updater.sh

Welcome to Gradle 8.11!

Here are the highlights of this release:
 - Parallel load and store for Configuration Cache
 - Java compilation errors at the end of the build output
 - Consolidated report for warnings and deprecations

For more details see https://docs.gradle.org/8.11/release-notes.html

To honour the JVM settings for this build a single-use Daemon process will be forked. For more on this, please refer to https://docs.gradle.org/8.11/userguide/gradle_daemon.html#sec:disabling_the_daemon in the Gradle documentation.
Daemon will be stopped at the end of the build 
Configuration on demand is an incubating feature.
lwjgl-nanovg.jar
lwjgl-opengl.jar
lwjgl-jemalloc.jar
lwjgl-openal.jar
jsr305.jar
lwjgl-glfw.jar
lwjgl-stb.jar
lwjgl.jar
lwjgl-lwjglx.jar
lwjgl-tinyfd.jar
lwjgl-freetype.jar

Note: Some input files use unchecked or unsafe operations.
> Task :jre_lwjgl3glfw:compileJava
Note: Recompile with -Xlint:unchecked for details.

> Task :jre_lwjgl3glfw:processResources NO-SOURCE
> Task :jre_lwjgl3glfw:classes

> Task :jre_lwjgl3glfw:jar
lwjgl-nanovg.jar
lwjgl-opengl.jar
lwjgl-jemalloc.jar
lwjgl-openal.jar
jsr305.jar
lwjgl-glfw.jar
lwjgl-stb.jar
lwjgl.jar
lwjgl-lwjglx.jar
lwjgl-tinyfd.jar
lwjgl-freetype.jar
lwjgl-nanovg.jar
lwjgl-opengl.jar
lwjgl-jemalloc.jar
lwjgl-openal.jar
jsr305.jar
lwjgl-glfw.jar
lwjgl-stb.jar
lwjgl.jar
lwjgl-lwjglx.jar
lwjgl-tinyfd.jar
lwjgl-freetype.jar
lwjgl-nanovg.jar
lwjgl-opengl.jar
lwjgl-jemalloc.jar
lwjgl-openal.jar
jsr305.jar
lwjgl-glfw.jar
lwjgl-stb.jar
lwjgl.jar
lwjgl-lwjglx.jar
lwjgl-tinyfd.jar
lwjgl-freetype.jar

> Task :jre_lwjgl3glfw:assemble
> Task :jre_lwjgl3glfw:compileTestJava NO-SOURCE
> Task :jre_lwjgl3glfw:processTestResources NO-SOURCE
> Task :jre_lwjgl3glfw:testClasses UP-TO-DATE
> Task :jre_lwjgl3glfw:test NO-SOURCE
> Task :jre_lwjgl3glfw:check UP-TO-DATE
> Task :jre_lwjgl3glfw:build
gradle/actions: Writing build results to /home/runner/work/_temp/.gradle-actions/build-results/__run_3-1782630099916.json
[Incubating] Problems report is available at: file:///home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/build/reports/problems/problems-report.html

Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/8.11/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 43s
2 actionable tasks: 2 executed
0s
Run actions/setup-java@v5
Installed distributions
Creating settings.xml with server-id: github
Overwriting existing file /home/runner/.m2/settings.xml
1m 25s
Run # Build the launcher
Starting a Gradle Daemon (subsequent builds will be faster)
Configuration on demand is an incubating feature.

fatal: No names found, cannot describe anything.
> Configure project :app_pojavlauncher
BUILD: You have no CurseForge key, the curseforge api will get disabled !
WARNING: BuildType 'proguard' is both debuggable and has 'isMinifyEnabled' set to true.
All code optimizations and obfuscation are disabled for debuggable builds.
Checking the license for package NDK (Side by side) 25.2.9519653 in /usr/local/lib/android/sdk/licenses
License for package NDK (Side by side) 25.2.9519653 accepted.
Preparing "Install NDK (Side by side) 25.2.9519653 v.25.2.9519653".
"Install NDK (Side by side) 25.2.9519653 v.25.2.9519653" ready.
Installing NDK (Side by side) 25.2.9519653 in /usr/local/lib/android/sdk/ndk/25.2.9519653
"Install NDK (Side by side) 25.2.9519653 v.25.2.9519653" complete.
"Install NDK (Side by side) 25.2.9519653 v.25.2.9519653" finished.
lwjgl-nanovg.jar
lwjgl-opengl.jar
lwjgl-jemalloc.jar
lwjgl-openal.jar
jsr305.jar
lwjgl-glfw.jar
lwjgl-stb.jar
lwjgl.jar
lwjgl-lwjglx.jar
lwjgl-tinyfd.jar
lwjgl-freetype.jar

> Task :app_pojavlauncher:preBuild UP-TO-DATE
> Task :app_pojavlauncher:preDebugBuild UP-TO-DATE
> Task :app_pojavlauncher:mergeDebugNativeDebugMetadata NO-SOURCE
> Task :app_pojavlauncher:generateDebugBuildConfig
> Task :app_pojavlauncher:javaPreCompileDebug
> Task :app_pojavlauncher:checkDebugAarMetadata
> Task :app_pojavlauncher:generateDebugResValues
> Task :app_pojavlauncher:mapDebugSourceSetPaths
> Task :app_pojavlauncher:generateDebugResources

> Task :app_pojavlauncher:mergeDebugResources
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pt/strings.xml:146:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pt/strings.xml:151:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fil/strings.xml:121:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fil/strings.xml:124:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values/strings.xml:21:4: Multiple substitutions specified in non-positional format of string resource string/address_memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values/strings.xml:431:4: Multiple substitutions specified in non-positional format of string resource string/bind_process_waiting_joystick. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-lol-rAA/strings.xml:146:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-lol-rAA/strings.xml:229:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-lol-rAA/strings.xml:282:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-lol-rAA/strings.xml:283:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-lol-rAA/strings.xml:284:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-lol-rAA/strings.xml:291:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values/strings.xml:176:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values/strings.xml:268:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values/strings.xml:331:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values/strings.xml:332:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values/strings.xml:333:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values/strings.xml:340:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values/strings.xml:380:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values/strings.xml:378:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files_size. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values/strings.xml:377:4: Multiple substitutions specified in non-positional format of string resource string/newdl_extracting_native_libraries. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-in/strings.xml:15:4: Multiple substitutions specified in non-positional format of string resource string/address_memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-in/strings.xml:151:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-in/strings.xml:237:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-in/strings.xml:291:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-in/strings.xml:292:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-in/strings.xml:293:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-in/strings.xml:300:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-iw/strings.xml:139:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-iw/strings.xml:218:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-in/strings.xml:335:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-in/strings.xml:333:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files_size. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ja/strings.xml:131:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ja/strings.xml:202:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?

> Task :app_pojavlauncher:createDebugCompatibleScreenManifests
> Task :app_pojavlauncher:extractDeepLinksDebug
> Task :app_pojavlauncher:processDebugMainManifest

> Task :app_pojavlauncher:mergeDebugResources
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ro/strings.xml:125:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ro/strings.xml:180:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fa-rIR/strings.xml:142:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fa-rIR/strings.xml:212:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fa-rIR/strings.xml:244:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fa-rIR/strings.xml:245:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fa-rIR/strings.xml:246:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fa-rIR/strings.xml:253:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ru/strings.xml:15:4: Multiple substitutions specified in non-positional format of string resource string/address_memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ru/strings.xml:151:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ru/strings.xml:237:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ru/strings.xml:291:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ru/strings.xml:292:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ru/strings.xml:293:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ru/strings.xml:300:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ru/strings.xml:335:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ru/strings.xml:333:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files_size. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ca/strings.xml:33:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ca/strings.xml:183:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ca/strings.xml:190:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-de/strings.xml:15:4: Multiple substitutions specified in non-positional format of string resource string/address_memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-sk-rSK/strings.xml:146:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-de/strings.xml:151:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-de/strings.xml:237:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-de/strings.xml:291:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-sk-rSK/strings.xml:229:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-de/strings.xml:292:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-sk-rSK/strings.xml:282:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-de/strings.xml:293:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-sk-rSK/strings.xml:283:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-de/strings.xml:300:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-sk-rSK/strings.xml:284:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-sk-rSK/strings.xml:291:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-de/strings.xml:335:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-de/strings.xml:333:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files_size. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ko/strings.xml:148:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ko/strings.xml:236:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ko/strings.xml:289:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ko/strings.xml:290:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ko/strings.xml:291:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ko/strings.xml:298:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pt-rBR/strings.xml:15:4: Multiple substitutions specified in non-positional format of string resource string/address_memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pt-rBR/strings.xml:151:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pt-rBR/strings.xml:237:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pt-rBR/strings.xml:291:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pt-rBR/strings.xml:292:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pt-rBR/strings.xml:293:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pt-rBR/strings.xml:300:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pt-rBR/strings.xml:335:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pt-rBR/strings.xml:333:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files_size. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-uk/strings.xml:147:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-uk/strings.xml:232:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-uk/strings.xml:285:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-uk/strings.xml:286:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-uk/strings.xml:287:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-uk/strings.xml:294:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-et-rEE/strings.xml:144:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-vi/strings.xml:15:4: Multiple substitutions specified in non-positional format of string resource string/address_memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-vi/strings.xml:151:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-vi/strings.xml:237:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-vi/strings.xml:291:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-vi/strings.xml:292:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-vi/strings.xml:293:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-vi/strings.xml:300:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-vi/strings.xml:338:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-vi/strings.xml:336:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files_size. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-tr/strings.xml:147:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-tr/strings.xml:232:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-tr/strings.xml:285:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-tr/strings.xml:286:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-tr/strings.xml:287:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-tr/strings.xml:294:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-no/strings.xml:96:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-no/strings.xml:98:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-hu/strings.xml:31:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-hu/strings.xml:136:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rTW/strings.xml:15:4: Multiple substitutions specified in non-positional format of string resource string/address_memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-af/strings.xml:34:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rTW/strings.xml:151:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rTW/strings.xml:237:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rTW/strings.xml:291:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rTW/strings.xml:292:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rTW/strings.xml:293:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rTW/strings.xml:300:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rTW/strings.xml:335:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-it/strings.xml:15:4: Multiple substitutions specified in non-positional format of string resource string/address_memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rTW/strings.xml:333:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files_size. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-it/strings.xml:151:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-it/strings.xml:238:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-it/strings.xml:292:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-it/strings.xml:293:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-it/strings.xml:294:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-it/strings.xml:301:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-it/strings.xml:336:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rCN/strings.xml:15:4: Multiple substitutions specified in non-positional format of string resource string/address_memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-it/strings.xml:334:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files_size. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rCN/strings.xml:151:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rCN/strings.xml:237:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rCN/strings.xml:291:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rCN/strings.xml:292:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rCN/strings.xml:293:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rCN/strings.xml:300:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rCN/strings.xml:335:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-zh-rCN/strings.xml:333:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files_size. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ar/strings.xml:15:4: Multiple substitutions specified in non-positional format of string resource string/address_memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ar/strings.xml:151:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ar/strings.xml:237:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ar/strings.xml:291:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ar/strings.xml:292:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ar/strings.xml:293:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ar/strings.xml:300:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ar/strings.xml:332:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ar/strings.xml:330:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files_size. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-mn-rMN/strings.xml:34:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-sr/strings.xml:113:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/.gradle/caches/8.11/transforms/f692d6e3bce1108b8542a49c0d01f556/transformed/preference-1.2.0/res/values-sr/values-sr.xml:4:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-sv/strings.xml:67:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-sv/strings.xml:69:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-bn-rBD/strings.xml:34:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-cs/strings.xml:15:4: Multiple substitutions specified in non-positional format of string resource string/address_memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-cs/strings.xml:151:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-cs/strings.xml:237:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-cs/strings.xml:291:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-cs/strings.xml:292:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-cs/strings.xml:293:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-cs/strings.xml:300:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-cs/strings.xml:335:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-cs/strings.xml:333:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files_size. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ms/strings.xml:115:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ms/strings.xml:118:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-es/strings.xml:14:4: Multiple substitutions specified in non-positional format of string resource string/address_memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-es/strings.xml:150:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-es/strings.xml:236:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-es/strings.xml:290:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-es/strings.xml:291:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-es/strings.xml:292:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-es/strings.xml:299:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-es/strings.xml:334:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-es/strings.xml:332:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files_size. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-ba/strings.xml:34:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-kk/strings.xml:33:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-az-rAZ/strings.xml:147:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-az-rAZ/strings.xml:232:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-az-rAZ/strings.xml:285:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-az-rAZ/strings.xml:286:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-az-rAZ/strings.xml:287:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-az-rAZ/strings.xml:294:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-th/strings.xml:147:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-th/strings.xml:232:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-th/strings.xml:285:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-th/strings.xml:286:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-th/strings.xml:287:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-th/strings.xml:294:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-da/strings.xml:22:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-tt/strings.xml:107:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-lt/strings.xml:136:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-lt/strings.xml:202:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-lt/strings.xml:235:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-lt/strings.xml:240:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-en-rGB/strings.xml:146:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-en-rGB/strings.xml:230:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-en-rGB/strings.xml:283:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-en-rGB/strings.xml:284:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-en-rGB/strings.xml:285:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-en-rGB/strings.xml:292:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-el/strings.xml:147:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-el/strings.xml:233:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-el/strings.xml:286:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-el/strings.xml:287:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-el/strings.xml:288:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-el/strings.xml:295:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-nl/strings.xml:146:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-nl/strings.xml:218:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-nl/strings.xml:230:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-nl/strings.xml:231:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-nl/strings.xml:232:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-nl/strings.xml:239:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fr/strings.xml:15:4: Multiple substitutions specified in non-positional format of string resource string/address_memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fr/strings.xml:151:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fr/strings.xml:237:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fr/strings.xml:291:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fr/strings.xml:292:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fr/strings.xml:293:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fr/strings.xml:300:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fr/strings.xml:335:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-fr/strings.xml:333:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files_size. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-rpr/strings.xml:117:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-rpr/strings.xml:119:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pl/strings.xml:15:4: Multiple substitutions specified in non-positional format of string resource string/address_memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pl/strings.xml:151:4: Multiple substitutions specified in non-positional format of string resource string/mcl_launch_downloading_progress. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pl/strings.xml:237:4: Multiple substitutions specified in non-positional format of string resource string/memory_warning_msg. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pl/strings.xml:291:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_applying_overrides. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pl/strings.xml:292:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_metadata. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pl/strings.xml:293:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pl/strings.xml:300:4: Multiple substitutions specified in non-positional format of string resource string/modpack_download_downloading_mods_fc. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pl/strings.xml:335:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files. Did you mean to add the formatted="false" attribute?
/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/res/values-pl/strings.xml:333:4: Multiple substitutions specified in non-positional format of string resource string/newdl_downloading_game_files_size. Did you mean to add the formatted="false" attribute?

> Task :app_pojavlauncher:processDebugManifest
> Task :app_pojavlauncher:mergeDebugShaders
> Task :app_pojavlauncher:processDebugManifestForPackage
> Task :app_pojavlauncher:compileDebugShaders NO-SOURCE
> Task :app_pojavlauncher:generateDebugAssets UP-TO-DATE
warn: removing resource net.kdt.pojavlaunch.debug:string/login_error_invalid_username without required default value.
warn: removing resource net.kdt.pojavlaunch.debug:string/login_microsoft without required default value.

> Task :app_pojavlauncher:processDebugResources
> Task :arc_dns_injector:compileJava

Note: Some input files use or override a deprecated API.
> Task :app_pojavlauncher:compileDebugJavaWithJavac
Note: Recompile with -Xlint:deprecation for details.

> Task :arc_dns_injector:processResources NO-SOURCE
> Task :arc_dns_injector:classes
> Task :arc_dns_injector:jar
> Task :forge_installer:compileJava
> Task :forge_installer:processResources NO-SOURCE
> Task :forge_installer:classes
> Task :forge_installer:jar
> Task :jre_lwjgl3glfw:compileJava UP-TO-DATE
> Task :jre_lwjgl3glfw:processResources NO-SOURCE
> Task :jre_lwjgl3glfw:classes UP-TO-DATE

> Task :jre_lwjgl3glfw:jar UP-TO-DATE
lwjgl-nanovg.jar
lwjgl-opengl.jar
lwjgl-jemalloc.jar
lwjgl-openal.jar
jsr305.jar
lwjgl-glfw.jar
lwjgl-stb.jar
lwjgl.jar
lwjgl-lwjglx.jar
lwjgl-tinyfd.jar
lwjgl-freetype.jar
lwjgl-nanovg.jar
lwjgl-opengl.jar
lwjgl-jemalloc.jar
lwjgl-openal.jar
jsr305.jar
lwjgl-glfw.jar
lwjgl-stb.jar
lwjgl.jar
lwjgl-lwjglx.jar
lwjgl-tinyfd.jar
lwjgl-freetype.jar

> Task :app_pojavlauncher:mergeDebugAssets
> Task :app_pojavlauncher:processDebugJavaRes NO-SOURCE
> Task :app_pojavlauncher:compressDebugAssets
> Task :app_pojavlauncher:checkDebugDuplicateClasses
> Task :app_pojavlauncher:mergeDebugJavaResource
> Task :app_pojavlauncher:mergeLibDexDebug
> Task :app_pojavlauncher:dexBuilderDebug
> Task :app_pojavlauncher:preProguardBuild UP-TO-DATE
> Task :app_pojavlauncher:mergeProjectDexDebug
> Task :app_pojavlauncher:desugarDebugFileDependencies
> Task :app_pojavlauncher:configureNdkBuildDebug[arm64-v8a]

> Task :app_pojavlauncher:buildNdkBuildDebug[arm64-v8a]
C/C++: rm: cannot remove '/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/../jniLibs/*/libawt_headless.so': No such file or directory
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/ctxbridges/gl_bridge.c:87:65: warning: format specifies type 'void *' but the argument has type 'EGLint' (aka 'int') [-Wformat]
C/C++:         if (!bindResult) printf("EGLBridge: bind failed: %p\n", eglGetError_p());
C/C++:                                                          ~~     ^~~~~~~~~~~~~~~
C/C++:                                                          %d
C/C++: 1 warning generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/ctxbridges/swap_interval_no_egl.c:238:29: warning: format specifies type 'int' but the argument has type 'unsigned long' [-Wformat]
C/C++:                             sizeof(struct ANativeWindow_real), nativeWindowReal->common.version);
C/C++:                             ^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/log.h:15:65: note: expanded from macro 'LOGW'
C/C++: #define LOGW(...) __android_log_print(ANDROID_LOG_WARN,    TAG, __VA_ARGS__)
C/C++:                                                                 ^~~~~~~~~~~
C/C++: 1 warning generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/input_bridge_v3.c:467:94: warning: more '%' conversions than data arguments [-Wformat-insufficient-args]
C/C++:     TRY_ATTACH_ENV(jvm_env, pojav_environ->runtimeJavaVMPtr, "nativeSetWindowAttrib failed: %i", return;);
C/C++:                                                                                             ~^
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/input_bridge_v3.c:39:16: note: expanded from macro 'TRY_ATTACH_ENV'
C/C++:         printf(error_message);                                             \
C/C++:                ^~~~~~~~~~~~~
C/C++: 1 warning generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/jre_launcher.c:119:69: warning: format specifies type 'int' but the argument has type 'size_t' (aka 'unsigned long') [-Wformat]
C/C++:             printf("Failed to set signal hander for signal %i: %s", i, strerror(errno));
C/C++:                                                            ~~       ^
C/C++:                                                            %zu
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/jre_launcher.c:202:37: warning: passing 'char **' to parameter of type 'const char **' discards qualifiers in nested pointer types [-Wincompatible-pointer-types-discards-qualifiers]
C/C++:     free_char_array(env, argsArray, argv);
C/C++:                                     ^~~~
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.h:11:75: note: passing argument to parameter 'charArray' here
C/C++: void free_char_array(JNIEnv *env, jobjectArray jstringArray, const char **charArray);
C/C++:                                                                           ^
C/C++: 2 warnings generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.c:103:33: warning: passing 'const char *' to parameter of type 'char *' discards qualifiers [-Wincompatible-pointer-types-discards-qualifiers]
C/C++:         android_update_LD_LIBRARY_PATH(ldLibPathUtf);
C/C++:                                        ^~~~~~~~~~~~
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.c:156:32: warning: passing 'char **' to parameter of type 'const char **' discards qualifiers in nested pointer types [-Wincompatible-pointer-types-discards-qualifiers]
C/C++:         free_char_array(env, cmdArgs, cmd_args_c);
C/C++:                                       ^~~~~~~~~~
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.c:41:75: note: passing argument to parameter 'charArray' here
C/C++: void free_char_array(JNIEnv *env, jobjectArray jstringArray, const char **charArray) {
C/C++:                                                                           ^
C/C++: 2 warnings generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/awt_bridge.c:120:109: warning: incompatible pointer to integer conversion passing 'void *' to parameter of type 'jint' (aka 'int') [-Wint-conversion]
C/C++:     (*runtimeJNIEnvPtr_GRAPHICS)->ReleaseIntArrayElements(runtimeJNIEnvPtr_GRAPHICS, jreRgbArray, rgbArray, NULL);
C/C++:                                                                                                             ^~~~
C/C++: /usr/local/lib/android/sdk/ndk/25.2.9519653/toolchains/llvm/prebuilt/linux-x86_64/lib64/clang/14.0.7/include/stddef.h:89:16: note: expanded from macro 'NULL'
C/C++: #  define NULL ((void*)0)
C/C++:                ^~~~~~~~~~
C/C++: 1 warning generated.

> Task :app_pojavlauncher:configureNdkBuildDebug[armeabi-v7a]
> Task :app_pojavlauncher:mergeExtDexDebug

> Task :app_pojavlauncher:buildNdkBuildDebug[armeabi-v7a]
C/C++: rm: cannot remove '/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/../jniLibs/*/libawt_headless.so': No such file or directory
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/ctxbridges/gl_bridge.c:87:65: warning: format specifies type 'void *' but the argument has type 'EGLint' (aka 'int') [-Wformat]
C/C++:         if (!bindResult) printf("EGLBridge: bind failed: %p\n", eglGetError_p());
C/C++:                                                          ~~     ^~~~~~~~~~~~~~~
C/C++:                                                          %d
C/C++: 1 warning generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/input_bridge_v3.c:467:94: warning: more '%' conversions than data arguments [-Wformat-insufficient-args]
C/C++:     TRY_ATTACH_ENV(jvm_env, pojav_environ->runtimeJavaVMPtr, "nativeSetWindowAttrib failed: %i", return;);
C/C++:                                                                                             ~^
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/input_bridge_v3.c:39:16: note: expanded from macro 'TRY_ATTACH_ENV'
C/C++:         printf(error_message);                                             \
C/C++:                ^~~~~~~~~~~~~
C/C++: 1 warning generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/jre_launcher.c:202:37: warning: passing 'char **' to parameter of type 'const char **' discards qualifiers in nested pointer types [-Wincompatible-pointer-types-discards-qualifiers]
C/C++:     free_char_array(env, argsArray, argv);
C/C++:                                     ^~~~
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.h:11:75: note: passing argument to parameter 'charArray' here
C/C++: void free_char_array(JNIEnv *env, jobjectArray jstringArray, const char **charArray);
C/C++:                                                                           ^
C/C++: 1 warning generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.c:103:33: warning: passing 'const char *' to parameter of type 'char *' discards qualifiers [-Wincompatible-pointer-types-discards-qualifiers]
C/C++:         android_update_LD_LIBRARY_PATH(ldLibPathUtf);
C/C++:                                        ^~~~~~~~~~~~
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.c:156:32: warning: passing 'char **' to parameter of type 'const char **' discards qualifiers in nested pointer types [-Wincompatible-pointer-types-discards-qualifiers]
C/C++:         free_char_array(env, cmdArgs, cmd_args_c);
C/C++:                                       ^~~~~~~~~~
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.c:41:75: note: passing argument to parameter 'charArray' here
C/C++: void free_char_array(JNIEnv *env, jobjectArray jstringArray, const char **charArray) {
C/C++:                                                                           ^
C/C++: 2 warnings generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/awt_bridge.c:120:109: warning: incompatible pointer to integer conversion passing 'void *' to parameter of type 'jint' (aka 'int') [-Wint-conversion]
C/C++:     (*runtimeJNIEnvPtr_GRAPHICS)->ReleaseIntArrayElements(runtimeJNIEnvPtr_GRAPHICS, jreRgbArray, rgbArray, NULL);
C/C++:                                                                                                             ^~~~
C/C++: /usr/local/lib/android/sdk/ndk/25.2.9519653/toolchains/llvm/prebuilt/linux-x86_64/lib64/clang/14.0.7/include/stddef.h:89:16: note: expanded from macro 'NULL'
C/C++: #  define NULL ((void*)0)
C/C++:                ^~~~~~~~~~
C/C++: 1 warning generated.

> Task :app_pojavlauncher:configureNdkBuildDebug[x86]

> Task :app_pojavlauncher:buildNdkBuildDebug[x86]
C/C++: rm: cannot remove '/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/../jniLibs/*/libawt_headless.so': No such file or directory
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/ctxbridges/gl_bridge.c:87:65: warning: format specifies type 'void *' but the argument has type 'EGLint' (aka 'int') [-Wformat]
C/C++:         if (!bindResult) printf("EGLBridge: bind failed: %p\n", eglGetError_p());
C/C++:                                                          ~~     ^~~~~~~~~~~~~~~
C/C++:                                                          %d
C/C++: 1 warning generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/input_bridge_v3.c:467:94: warning: more '%' conversions than data arguments [-Wformat-insufficient-args]
C/C++:     TRY_ATTACH_ENV(jvm_env, pojav_environ->runtimeJavaVMPtr, "nativeSetWindowAttrib failed: %i", return;);
C/C++:                                                                                             ~^
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/input_bridge_v3.c:39:16: note: expanded from macro 'TRY_ATTACH_ENV'
C/C++:         printf(error_message);                                             \
C/C++:                ^~~~~~~~~~~~~
C/C++: 1 warning generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/jre_launcher.c:202:37: warning: passing 'char **' to parameter of type 'const char **' discards qualifiers in nested pointer types [-Wincompatible-pointer-types-discards-qualifiers]
C/C++:     free_char_array(env, argsArray, argv);
C/C++:                                     ^~~~
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.h:11:75: note: passing argument to parameter 'charArray' here
C/C++: void free_char_array(JNIEnv *env, jobjectArray jstringArray, const char **charArray);
C/C++:                                                                           ^
C/C++: 1 warning generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.c:103:33: warning: passing 'const char *' to parameter of type 'char *' discards qualifiers [-Wincompatible-pointer-types-discards-qualifiers]
C/C++:         android_update_LD_LIBRARY_PATH(ldLibPathUtf);
C/C++:                                        ^~~~~~~~~~~~
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.c:156:32: warning: passing 'char **' to parameter of type 'const char **' discards qualifiers in nested pointer types [-Wincompatible-pointer-types-discards-qualifiers]
C/C++:         free_char_array(env, cmdArgs, cmd_args_c);
C/C++:                                       ^~~~~~~~~~
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.c:41:75: note: passing argument to parameter 'charArray' here
C/C++: void free_char_array(JNIEnv *env, jobjectArray jstringArray, const char **charArray) {
C/C++:                                                                           ^
C/C++: 2 warnings generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/awt_bridge.c:120:109: warning: incompatible pointer to integer conversion passing 'void *' to parameter of type 'jint' (aka 'int') [-Wint-conversion]
C/C++:     (*runtimeJNIEnvPtr_GRAPHICS)->ReleaseIntArrayElements(runtimeJNIEnvPtr_GRAPHICS, jreRgbArray, rgbArray, NULL);
C/C++:                                                                                                             ^~~~
C/C++: /usr/local/lib/android/sdk/ndk/25.2.9519653/toolchains/llvm/prebuilt/linux-x86_64/lib64/clang/14.0.7/include/stddef.h:89:16: note: expanded from macro 'NULL'
C/C++: #  define NULL ((void*)0)
C/C++:                ^~~~~~~~~~
C/C++: 1 warning generated.

> Task :app_pojavlauncher:configureNdkBuildDebug[x86_64]

> Task :app_pojavlauncher:buildNdkBuildDebug[x86_64]
C/C++: rm: cannot remove '/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/../jniLibs/*/libawt_headless.so': No such file or directory
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/ctxbridges/gl_bridge.c:87:65: warning: format specifies type 'void *' but the argument has type 'EGLint' (aka 'int') [-Wformat]
C/C++:         if (!bindResult) printf("EGLBridge: bind failed: %p\n", eglGetError_p());
C/C++:                                                          ~~     ^~~~~~~~~~~~~~~
C/C++:                                                          %d
C/C++: 1 warning generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/ctxbridges/swap_interval_no_egl.c:238:29: warning: format specifies type 'int' but the argument has type 'unsigned long' [-Wformat]
C/C++:                             sizeof(struct ANativeWindow_real), nativeWindowReal->common.version);
C/C++:                             ^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/log.h:15:65: note: expanded from macro 'LOGW'
C/C++: #define LOGW(...) __android_log_print(ANDROID_LOG_WARN,    TAG, __VA_ARGS__)
C/C++:                                                                 ^~~~~~~~~~~
C/C++: 1 warning generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/input_bridge_v3.c:467:94: warning: more '%' conversions than data arguments [-Wformat-insufficient-args]
C/C++:     TRY_ATTACH_ENV(jvm_env, pojav_environ->runtimeJavaVMPtr, "nativeSetWindowAttrib failed: %i", return;);
C/C++:                                                                                             ~^
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/input_bridge_v3.c:39:16: note: expanded from macro 'TRY_ATTACH_ENV'
C/C++:         printf(error_message);                                             \
C/C++:                ^~~~~~~~~~~~~
C/C++: 1 warning generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/jre_launcher.c:119:69: warning: format specifies type 'int' but the argument has type 'size_t' (aka 'unsigned long') [-Wformat]
C/C++:             printf("Failed to set signal hander for signal %i: %s", i, strerror(errno));
C/C++:                                                            ~~       ^
C/C++:                                                            %zu
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/jre_launcher.c:202:37: warning: passing 'char **' to parameter of type 'const char **' discards qualifiers in nested pointer types [-Wincompatible-pointer-types-discards-qualifiers]
C/C++:     free_char_array(env, argsArray, argv);
C/C++:                                     ^~~~
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.h:11:75: note: passing argument to parameter 'charArray' here
C/C++: void free_char_array(JNIEnv *env, jobjectArray jstringArray, const char **charArray);
C/C++:                                                                           ^
C/C++: 2 warnings generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.c:103:33: warning: passing 'const char *' to parameter of type 'char *' discards qualifiers [-Wincompatible-pointer-types-discards-qualifiers]
C/C++:         android_update_LD_LIBRARY_PATH(ldLibPathUtf);
C/C++:                                        ^~~~~~~~~~~~
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.c:156:32: warning: passing 'char **' to parameter of type 'const char **' discards qualifiers in nested pointer types [-Wincompatible-pointer-types-discards-qualifiers]
C/C++:         free_char_array(env, cmdArgs, cmd_args_c);
C/C++:                                       ^~~~~~~~~~
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/utils.c:41:75: note: passing argument to parameter 'charArray' here
C/C++: void free_char_array(JNIEnv *env, jobjectArray jstringArray, const char **charArray) {
C/C++:                                                                           ^
C/C++: 2 warnings generated.
C/C++: /home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/awt_bridge.c:120:109: warning: incompatible pointer to integer conversion passing 'void *' to parameter of type 'jint' (aka 'int') [-Wint-conversion]
C/C++:     (*runtimeJNIEnvPtr_GRAPHICS)->ReleaseIntArrayElements(runtimeJNIEnvPtr_GRAPHICS, jreRgbArray, rgbArray, NULL);
C/C++:                                                                                                             ^~~~
C/C++: /usr/local/lib/android/sdk/ndk/25.2.9519653/toolchains/llvm/prebuilt/linux-x86_64/lib64/clang/14.0.7/include/stddef.h:89:16: note: expanded from macro 'NULL'
C/C++: #  define NULL ((void*)0)
C/C++:                ^~~~~~~~~~
C/C++: 1 warning generated.

> Task :app_pojavlauncher:mergeDebugJniLibFolders
> Task :app_pojavlauncher:validateSigningDebug
> Task :app_pojavlauncher:writeDebugAppMetadata
> Task :app_pojavlauncher:writeDebugSigningConfigVersions
> Task :app_pojavlauncher:mergeDebugNativeLibs
> Task :app_pojavlauncher:stripDebugDebugSymbols
> Task :app_pojavlauncher:packageDebug
> Task :app_pojavlauncher:createDebugApkListingFileRedirect
> Task :app_pojavlauncher:assembleDebug
gradle/actions: Writing build results to /home/runner/work/_temp/.gradle-actions/build-results/__run_4-1782630142607.json
[Incubating] Problems report is available at: file:///home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/build/reports/problems/problems-report.html

Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/8.11/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 1m 24s
46 actionable tasks: 44 executed, 2 up-to-date
3s
Run rm -rf app_pojavlauncher/src/main/assets/components/jre
Configuration on demand is an incubating feature.

> Configure project :app_pojavlauncher
BUILD: You have no CurseForge key, the curseforge api will get disabled !
WARNING: BuildType 'proguard' is both debuggable and has 'isMinifyEnabled' set to true.
All code optimizations and obfuscation are disabled for debuggable builds.
fatal: No names found, cannot describe anything.
lwjgl-nanovg.jar
lwjgl-opengl.jar
lwjgl-jemalloc.jar
lwjgl-openal.jar
jsr305.jar
lwjgl-glfw.jar
lwjgl-stb.jar
lwjgl.jar
lwjgl-lwjglx.jar
lwjgl-tinyfd.jar
lwjgl-freetype.jar

> Task :app_pojavlauncher:preBuild UP-TO-DATE
> Task :app_pojavlauncher:preDebugBuild UP-TO-DATE
> Task :app_pojavlauncher:mergeDebugNativeDebugMetadata NO-SOURCE
> Task :app_pojavlauncher:generateDebugBuildConfig UP-TO-DATE
> Task :app_pojavlauncher:javaPreCompileDebug UP-TO-DATE
> Task :app_pojavlauncher:checkDebugAarMetadata UP-TO-DATE
> Task :app_pojavlauncher:generateDebugResValues UP-TO-DATE
> Task :app_pojavlauncher:mapDebugSourceSetPaths UP-TO-DATE
> Task :app_pojavlauncher:generateDebugResources UP-TO-DATE
> Task :app_pojavlauncher:mergeDebugResources UP-TO-DATE
> Task :app_pojavlauncher:createDebugCompatibleScreenManifests UP-TO-DATE
> Task :app_pojavlauncher:extractDeepLinksDebug UP-TO-DATE
> Task :app_pojavlauncher:processDebugMainManifest UP-TO-DATE
> Task :app_pojavlauncher:processDebugManifest UP-TO-DATE
> Task :app_pojavlauncher:processDebugManifestForPackage UP-TO-DATE
> Task :app_pojavlauncher:processDebugResources UP-TO-DATE
> Task :app_pojavlauncher:compileDebugJavaWithJavac UP-TO-DATE
> Task :app_pojavlauncher:mergeDebugShaders UP-TO-DATE
> Task :app_pojavlauncher:compileDebugShaders NO-SOURCE
> Task :app_pojavlauncher:generateDebugAssets UP-TO-DATE
> Task :arc_dns_injector:compileJava UP-TO-DATE
> Task :arc_dns_injector:processResources NO-SOURCE
> Task :arc_dns_injector:classes UP-TO-DATE
> Task :arc_dns_injector:jar UP-TO-DATE
> Task :forge_installer:compileJava UP-TO-DATE
> Task :forge_installer:processResources NO-SOURCE
> Task :forge_installer:classes UP-TO-DATE
> Task :forge_installer:jar UP-TO-DATE
> Task :jre_lwjgl3glfw:compileJava UP-TO-DATE
> Task :jre_lwjgl3glfw:processResources NO-SOURCE
> Task :jre_lwjgl3glfw:classes UP-TO-DATE

> Task :jre_lwjgl3glfw:jar UP-TO-DATE
lwjgl-nanovg.jar
lwjgl-opengl.jar
lwjgl-jemalloc.jar
lwjgl-openal.jar
jsr305.jar
lwjgl-glfw.jar
lwjgl-stb.jar
lwjgl.jar
lwjgl-lwjglx.jar
lwjgl-tinyfd.jar
lwjgl-freetype.jar
lwjgl-nanovg.jar
lwjgl-opengl.jar
lwjgl-jemalloc.jar
lwjgl-openal.jar
jsr305.jar
lwjgl-glfw.jar
lwjgl-stb.jar
lwjgl.jar
lwjgl-lwjglx.jar
lwjgl-tinyfd.jar
lwjgl-freetype.jar

> Task :app_pojavlauncher:mergeDebugAssets UP-TO-DATE
> Task :app_pojavlauncher:compressDebugAssets UP-TO-DATE
> Task :app_pojavlauncher:processDebugJavaRes NO-SOURCE
> Task :app_pojavlauncher:mergeDebugJavaResource UP-TO-DATE
> Task :app_pojavlauncher:checkDebugDuplicateClasses UP-TO-DATE
> Task :app_pojavlauncher:desugarDebugFileDependencies UP-TO-DATE
> Task :app_pojavlauncher:mergeExtDexDebug UP-TO-DATE
> Task :app_pojavlauncher:mergeLibDexDebug UP-TO-DATE
> Task :app_pojavlauncher:dexBuilderDebug UP-TO-DATE
> Task :app_pojavlauncher:mergeProjectDexDebug UP-TO-DATE
> Task :app_pojavlauncher:preProguardBuild UP-TO-DATE
> Task :app_pojavlauncher:configureNdkBuildDebug[arm64-v8a]

> Task :app_pojavlauncher:buildNdkBuildDebug[arm64-v8a]
C/C++: rm: cannot remove '/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/../jniLibs/*/libawt_headless.so': No such file or directory

> Task :app_pojavlauncher:configureNdkBuildDebug[armeabi-v7a]

> Task :app_pojavlauncher:buildNdkBuildDebug[armeabi-v7a]
C/C++: rm: cannot remove '/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/../jniLibs/*/libawt_headless.so': No such file or directory

> Task :app_pojavlauncher:configureNdkBuildDebug[x86]

> Task :app_pojavlauncher:buildNdkBuildDebug[x86]
C/C++: rm: cannot remove '/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/../jniLibs/*/libawt_headless.so': No such file or directory

> Task :app_pojavlauncher:configureNdkBuildDebug[x86_64]

> Task :app_pojavlauncher:buildNdkBuildDebug[x86_64]
C/C++: rm: cannot remove '/home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/app_pojavlauncher/src/main/jni/../jniLibs/*/libawt_headless.so': No such file or directory

> Task :app_pojavlauncher:mergeDebugJniLibFolders UP-TO-DATE
> Task :app_pojavlauncher:mergeDebugNativeLibs UP-TO-DATE
> Task :app_pojavlauncher:stripDebugDebugSymbols UP-TO-DATE
> Task :app_pojavlauncher:validateSigningDebug UP-TO-DATE
> Task :app_pojavlauncher:writeDebugAppMetadata UP-TO-DATE
> Task :app_pojavlauncher:writeDebugSigningConfigVersions UP-TO-DATE
> Task :app_pojavlauncher:packageDebug
> Task :app_pojavlauncher:createDebugApkListingFileRedirect UP-TO-DATE
> Task :app_pojavlauncher:assembleDebug
gradle/actions: Writing build results to /home/runner/work/_temp/.gradle-actions/build-results/__run_5-1782630221972.json
[Incubating] Problems report is available at: file:///home/runner/work/BrainRotMcLauncher/BrainRotMcLauncher/build/reports/problems/problems-report.html

Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/8.11/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 3s
46 actionable tasks: 9 executed, 37 up-to-date
0s
Run md5sum out/BrainRotsMc.apk > out/BrainRotsMc.md5
2s
Run actions/upload-artifact@v6
With the provided path, there will be 2 files uploaded
Artifact name is valid!
Root directory input is valid!
Beginning upload of artifact content to blob storage
Uploaded bytes 8388608
Uploaded bytes 16777216
Uploaded bytes 25165824
Uploaded bytes 33554432
Uploaded bytes 38976727
Finished uploading artifact content to blob storage!
SHA256 digest of uploaded artifact zip is cafd211c77884cad6b54e801fd2889c723a71f9e4527fc1211b7473ecd01b820
Finalizing artifact upload
Artifact BrainRotsMc.zip successfully finalized. Artifact ID 7932068388
Artifact BrainRotsMc has been successfully uploaded! Final size is 38976727 bytes. Artifact ID is 7932068388
Artifact download URL: https://github.com/Felleus-Development/BrainRotMcLauncher/actions/runs/28314518428/artifacts/7932068388
3s
Run actions/upload-artifact@v6
With the provided path, there will be 2 files uploaded
Artifact name is valid!
Root directory input is valid!
Beginning upload of artifact content to blob storage
Uploaded bytes 8388608
Uploaded bytes 16777216
Uploaded bytes 25165824
Uploaded bytes 33554432
Uploaded bytes 38976777
Finished uploading artifact content to blob storage!
SHA256 digest of uploaded artifact zip is 1a4c04191014bd59f789f9a9187f866b3f860194bc4fa43d83f2253e127747ed
Finalizing artifact upload
Artifact BrainRotsMc-noruntime.zip successfully finalized. Artifact ID 7932068661
Artifact BrainRotsMc-noruntime has been successfully uploaded! Final size is 38976777 bytes. Artifact ID is 7932068661
Artifact download URL: https://github.com/Felleus-Development/BrainRotMcLauncher/actions/runs/28314518428/artifacts/7932068661
0s
Post job cleanup.
7s
Post job cleanup.
In post-action step
Enhanced Caching: This build is using the proprietary 'gradle-actions-caching' provider for optimized caching support. See https://github.com/gradle/actions/blob/main/DISTRIBUTION.md for terms of use and opt-out instructions.
Stopping Gradle daemons
Performing cache cleanup