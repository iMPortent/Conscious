package com.example.c4q.conscious.engage.controller;

import android.view.View;

import com.example.c4q.conscious.engage.model.Challenges;
import com.example.c4q.conscious.smart.ViewInterface;

public class GrowthChallengeController {

    private ViewInterface view;
    private ChallengeDataSource dataSource;


    public GrowthChallengeController(ViewInterface view) {
        this.view = view;
        this.dataSource = new ChallengeDataSource();
    }

    public void onChallengeClick(Challenges challenges, View viewRoot){
        view.startChallengeDetailActivity(
                challenges.getChallenge_name(),
                challenges.getChallenge_detail(),
                challenges.getChallenge_color_resource(),
                viewRoot
        );
    }
}
