package com.example.c4q.conscious.engage.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.example.c4q.conscious.R;


public class ChallengeLevelActivity extends AppCompatActivity {

    ImageView easyCircle;
    ImageView mediumCircle;
    ImageView hardCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_level);

        easyCircle = findViewById(R.id.easy_btn);
        mediumCircle = findViewById(R.id.medium_btn);
        hardCircle = findViewById(R.id.hard_btn);

        easyCircle.setOnClickListener(v -> {
            Intent toGameLevel = new Intent(ChallengeLevelActivity.this, ChallengesActivity.class);
            startActivity(toGameLevel);
        });

        mediumCircle.setOnClickListener(v -> {
            Intent toGameLevel = new Intent(ChallengeLevelActivity.this, ChallengesActivity.class);
            startActivity(toGameLevel);
        });

        hardCircle.setOnClickListener(v -> {
            Intent toGameLevel = new Intent(ChallengeLevelActivity.this, ChallengesActivity.class);
            startActivity(toGameLevel);
        });
    }
}
