package com.example.c4q.conscious;

import android.view.View;

import com.example.c4q.conscious.model.Challenges;

import java.util.List;

/**
 * Created by C4Q on 4/1/18.
 */

public interface ViewInterface {

    void startChallengeDetailActivity(String dateAndTime, String message, int colorResource, View viewRoot);
    void startChallenge(View view);
    void completeChallenge(View view);
}
