package com.example.c4q.conscious.engage.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.c4q.conscious.R;
import de.hdodenhof.circleimageview.CircleImageView;

public class ChallengeLevelActivity extends AppCompatActivity {

    CircleImageView easyCircle;
    CircleImageView mediumCircle;
    CircleImageView hardCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_level);

        easyCircle = findViewById(R.id.easyCircle);
        mediumCircle = findViewById(R.id.mediumCircle);
        hardCircle = findViewById(R.id.hardCircle);

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
