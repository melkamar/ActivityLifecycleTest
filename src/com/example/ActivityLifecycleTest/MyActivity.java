package com.example.ActivityLifecycleTest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Log.w("MyActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.w("MyActivity", "onStart PA");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.w("MyActivity", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.w("MyActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.w("MyActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.w("MyActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.w("MyActivity", "onDestroy");
    }
}
