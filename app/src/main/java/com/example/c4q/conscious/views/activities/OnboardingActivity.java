package com.example.c4q.conscious.views.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.example.c4q.conscious.R;

public class OnboardingActivity extends Activity {

    private static final String SHARED_PREFS_KEY = "sharedPrefsTesting";
    private static final String TAG = "OnboardingActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        Log.d(TAG, "onCreate: ran");

        TextView welcome_user = findViewById(R.id.welcome_user_tv);
        TextView disclaimer = findViewById(R.id.disclaimer);
        TextView disclaimer2 = findViewById(R.id.disclaimer2);
        SharedPreferences sharedPrefObject = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);

        Intent intent = getIntent();
        String user = intent.getStringExtra("username");
        welcome_user.setText(user);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(OnboardingActivity.this, MainActivity.class);
                    startActivity(intent);
                    Log.d(TAG, "run: ran");
                }
            }
        };
        timerThread.start();
    }
}
