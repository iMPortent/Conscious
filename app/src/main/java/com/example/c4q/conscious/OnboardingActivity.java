package com.example.c4q.conscious;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OnboardingActivity extends Activity {

    private static final String SHARED_PREFS_KEY = "sharedPrefsTesting";
    private SharedPreferences sharedPrefObject;
    private TextView welcome_user;
    private TextView question_one;
    private TextView question_two;
    private TextView question_three;
    private EditText question_one_et;
    private EditText question_two_et;
    private EditText question_three_et;
    private Button submit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        welcome_user = findViewById(R.id.welcome_user_tv);
        question_one = findViewById(R.id.question_one);
        question_two = findViewById(R.id.question_two);
        question_three = findViewById(R.id.question_three);
        question_one_et = findViewById(R.id.question_one_et);
        question_two_et = findViewById(R.id.question_two_et);
        question_three_et = findViewById(R.id.question_three_et);
        submit_btn = findViewById(R.id.sumbit);
        sharedPrefObject = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);

        Intent intent = getIntent();
        String user = intent.getStringExtra("username");
        welcome_user.setText("Welcome " + user + " \n Please answer these onboarding questions to personalize your feed.");

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Must save user input into the database.
                 */
                Intent intentToRegistration = new Intent(OnboardingActivity.this, PersonalizedFeedActivity.class);
                startActivity(intentToRegistration);
            }
        });

    }
}
