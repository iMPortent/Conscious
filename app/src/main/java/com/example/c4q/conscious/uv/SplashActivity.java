package com.example.c4q.conscious.uv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.example.c4q.conscious.R;

public class SplashActivity extends Activity {

    ImageView splash_logo;
    private static final String TAG = "Splash Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.d(TAG, "onCreate: Splash ran ");

        splash_logo = findViewById(R.id.splash_logo);

        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();

        Log.d(TAG, "onCreate: Thread ran ");

        /***
         * maybe add a progress dialog bar for when the splash is taking place?
         */
    }
}
