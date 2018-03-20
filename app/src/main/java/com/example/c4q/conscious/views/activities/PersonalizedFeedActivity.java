package com.example.c4q.conscious.views.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.c4q.conscious.R;

public class PersonalizedFeedActivity extends Activity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalized_feed);

        recyclerView = findViewById(R.id.pfeed_recycler_view);
    }
}
