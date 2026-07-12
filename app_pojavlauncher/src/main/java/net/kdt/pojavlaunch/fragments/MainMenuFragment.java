package net.kdt.pojavlaunch.fragments;

import static net.kdt.pojavlaunch.Tools.shareLog;

import android.os.Bundle;
import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.res.ResourcesCompat;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.kdt.mcgui.mcVersionSpinner;

import net.kdt.pojavlaunch.BuildConfig;
import net.kdt.pojavlaunch.R;
import net.kdt.pojavlaunch.Tools;
import net.kdt.pojavlaunch.extra.ExtraConstants;
import net.kdt.pojavlaunch.extra.ExtraCore;
import net.kdt.pojavlaunch.progresskeeper.ProgressKeeper;

public class MainMenuFragment extends Fragment {
    public static final String TAG = "MainMenuFragment";

    private mcVersionSpinner mVersionSpinner;

    public MainMenuFragment(){
        super(R.layout.fragment_launcher);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Button mNewsButton = view.findViewById(R.id.news_button);
        Button mDiscordButton = view.findViewById(R.id.discord_button);
        Button mInstallJarButton = view.findViewById(R.id.install_jar_button);
        Button mShareLogsButton = view.findViewById(R.id.share_logs_button);

        ImageButton mEditProfileButton = view.findViewById(R.id.edit_profile_button);
        Button mPlayButton = view.findViewById(R.id.play_button);
        mVersionSpinner = view.findViewById(R.id.mc_version_spinner);

        mNewsButton.setOnClickListener(v -> Tools.openURL(requireActivity(), getString(R.string.website_url)));
        mDiscordButton.setOnClickListener(v -> Tools.openURL(requireActivity(), getString(R.string.telegram_url)));
        mInstallJarButton.setOnClickListener(v -> runInstallerWithConfirmation(false));
        mInstallJarButton.setOnLongClickListener(v->{
            runInstallerWithConfirmation(true);
            return true;
        });
        mEditProfileButton.setOnClickListener(v -> mVersionSpinner.openProfileEditor(requireActivity()));

        mPlayButton.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.play_button_background, null));
        mPlayButton.setOnClickListener(v -> ExtraCore.setValue(ExtraConstants.LAUNCH_GAME, true));

        mShareLogsButton.setOnClickListener((v) -> shareLog(requireContext()));


        mNewsButton.setOnLongClickListener((v)->{
            Tools.swapFragment(requireActivity(), GamepadMapperFragment.class, GamepadMapperFragment.TAG, null);
            return true;
        });

        if (BuildConfig.SINGLE_PACK_MODE) {
            mVersionSpinner.setVisibility(View.GONE);
            mEditProfileButton.setVisibility(View.GONE);
            View installJar = view.findViewById(R.id.install_jar_button);
            if (installJar != null) installJar.setVisibility(View.GONE);
            View bg = view.findViewById(R.id._background_display_view);
            if (bg != null) bg.setVisibility(View.GONE);

            ConstraintLayout root = view.findViewById(R.id.fragment_menu_main);
            View scroll = view.findViewById(R.id.main_menu_scroll);
            View play = view.findViewById(R.id.play_button);
            if (root != null && scroll != null && play != null) {
                ConstraintSet cs = new ConstraintSet();
                cs.clone(root);
                cs.clear(scroll.getId(), ConstraintSet.BOTTOM);
                int gap = (int) (8f * getResources().getDisplayMetrics().density);
                cs.connect(scroll.getId(), ConstraintSet.BOTTOM, play.getId(), ConstraintSet.TOP, gap);
                cs.applyTo(root);
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        mVersionSpinner.reloadProfiles();
    }

    private void runInstallerWithConfirmation(boolean isCustomArgs) {
        // avoid using custom installers to install a version
        if(Tools.isLocalProfile(requireContext()) || Tools.isDemoProfile(requireContext())){
            Toast.makeText(requireContext(), R.string.toast_not_available_demo, Toast.LENGTH_LONG).show();
            return;
        }

        if (ProgressKeeper.getTaskCount() == 0)
            Tools.installMod(requireActivity(), isCustomArgs);
        else
            Toast.makeText(requireContext(), R.string.tasks_ongoing, Toast.LENGTH_LONG).show();
    }
}
