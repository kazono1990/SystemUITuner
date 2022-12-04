package jp.co.kazono.systemUiTuner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static String TAG = "SystemUiTuner";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Package and Class Name for System UI DemoMode
        String packageName = "com.android.systemui";
        String className = "com.android.systemui.DemoMode";

        // Create Intent and run DemoMode
        Intent intent = new Intent();
        intent.setClassName(packageName, className);
        startActivity(intent);
        Log.i(TAG, String.format("Start %s.", className));

        // Discard original activity
        finish();
    }
}
