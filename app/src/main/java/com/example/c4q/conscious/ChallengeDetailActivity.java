package com.example.c4q.conscious;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChallengeDetailActivity extends AppCompatActivity {

    private static final String CHALLENGE_NAME = "CHALLENGE_NAME";
    private static final String CHALLENGE_MESSAGE = "CHALLENGE_MESSAGE";
    private static final String CHALLENGE_DRAWABLE = "CHALLENGE_DRAWABLE";
    private TextView challenge_name;
    private TextView challenge_detail;
    private View coloredBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_detail);

        Intent i = getIntent();
        String dateAndTimeExtra = i.getStringExtra(CHALLENGE_NAME);
        String messageExtra = i.getStringExtra(CHALLENGE_MESSAGE);
        int drawableResourceExtra = i.getIntExtra(CHALLENGE_DRAWABLE, 0);

        challenge_name = findViewById(R.id.challenge_name);
        challenge_name.setText(dateAndTimeExtra);

        challenge_detail = findViewById(R.id.challenge_detail);
        challenge_detail.setText(messageExtra);

        coloredBackground = findViewById(R.id.imv_colored_background);
        coloredBackground.setBackgroundResource(
                drawableResourceExtra
        );

    }
}
