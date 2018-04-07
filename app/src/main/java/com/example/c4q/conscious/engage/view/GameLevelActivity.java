package com.example.c4q.conscious.engage.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.c4q.conscious.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class GameLevelActivity extends AppCompatActivity {

    CircleImageView easyCircle;
    CircleImageView mediumCircle;
    CircleImageView hardCircle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        easyCircle = findViewById(R.id.easyCircle);
        mediumCircle = findViewById(R.id.mediumCircle);
        hardCircle = findViewById(R.id.hardCircle);

        easyCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toGameLevel = new Intent(GameLevelActivity.this, GamesActivity.class);
                startActivity(toGameLevel);
            }
        });

        mediumCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toGameLevel = new Intent(GameLevelActivity.this, GamesActivity.class);
                startActivity(toGameLevel);
            }
        });

        hardCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toGameLevel = new Intent(GameLevelActivity.this, GamesActivity.class);
                startActivity(toGameLevel);
            }
        });
    }
}
