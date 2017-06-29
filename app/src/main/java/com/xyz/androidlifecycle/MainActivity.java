package com.xyz.androidlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String tag="ALC Events";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(tag, "In on Create Method");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "In on Start Method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "In on Resume Method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "In on Pause Method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "In on Stop Method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "In on Restart Method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "In on Destroy Method");
    }
}
