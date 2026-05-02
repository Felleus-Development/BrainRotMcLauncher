package net.kdt.pojavlaunch.singlepack;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import net.kdt.pojavlaunch.LauncherActivity;
import net.kdt.pojavlaunch.PojavApplication;
import net.kdt.pojavlaunch.R;

/**
 * Shown before {@link LauncherActivity} when a fork build must fetch the pack ZIP.
 */
public class SinglePackPrepareActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_pack_prepare);

        TextView status = findViewById(R.id.single_pack_status_text);
        status.setText(R.string.single_pack_downloading);

        PojavApplication.sExecutorService.execute(() -> {
            try {
                SinglePackBootstrap.downloadAndInstall();
                runOnUiThread(() -> {
                    startActivity(new Intent(this, LauncherActivity.class));
                    finish();
                });
            } catch (Exception e) {
                runOnUiThread(() -> showFailure(e));
            }
        });
    }

    private void showFailure(Exception e) {
        new AlertDialog.Builder(this)
                .setTitle(R.string.single_pack_error_title)
                .setMessage(getString(R.string.single_pack_error_message, e.getMessage() != null ? e.getMessage() : e.toString()))
                .setPositiveButton(R.string.single_pack_retry, (d, w) -> recreate())
                .setNegativeButton(android.R.string.cancel, (d, w) -> {
                    Toast.makeText(this, R.string.single_pack_exit_hint, Toast.LENGTH_LONG).show();
                    finishAffinity();
                })
                .setCancelable(false)
                .show();
    }
}
