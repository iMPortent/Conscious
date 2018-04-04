package com.example.c4q.conscious;

import android.view.View;
import com.example.c4q.conscious.model.Challenges;

public class GrowthChallengeController {

    private ViewInterface view;
    private ChallengeDataSource dataSource;


    public GrowthChallengeController(ViewInterface view, ChallengeDataSource dataSource) {
        this.view = view;
        this.dataSource = dataSource;
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
