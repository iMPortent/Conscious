package com.example.c4q.conscious.views.activities;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.controller.CommunityAdapter;

public class PersonalizedFeedActivity extends FragmentActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalized_feed);

        recyclerView = findViewById(R.id.pfeed_recycler_view);

        CommunityAdapter communityAdapter = new CommunityAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setAdapter(communityAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        Log.d("MESSAGE", "onResponse: " + communityAdapter.eventsList);
        communityAdapter.notifyDataSetChanged();
    }
}
