package com.example.c4q.conscious;

import android.view.View;
import com.example.c4q.conscious.model.Challenges;

public class GrowthChallengeController {
    private Challenges temporaryChallenge;
    private int temporaryChallengePosition;
    private ViewInterface view;
    private ChallengeDataSource dataSource;


    public GrowthChallengeController(ViewInterface view, ChallengeDataSource dataSource) {
        this.view = view;
        this.dataSource = dataSource;
    }

    public void onChallengeClick(Challenges challenges, View viewRoot){
        view.startChallengeDetailActivity(
                challenges.getDateAndTime(),
                challenges.getMessage(),
                challenges.getColorResource(),
                viewRoot
        );
    }



    public void createNewChallenge() {
        Challenges newItem = dataSource.createNewChallenge();
        view.addNewChallengeToView(newItem);
    }

    public void onChallengeSwiped(int position, Challenges challenges) {
        dataSource.deleteChallenge(challenges);
        view.deleteChallengeAt(position);
        temporaryChallengePosition = position;
        temporaryChallenge = challenges;
        view.showUndoSnackbar();

    }

    public void onUndoConfirmed() {
        if (temporaryChallenge != null){
            dataSource.insertChallenge(temporaryChallenge);
            view.insertChallengeAt(temporaryChallengePosition, temporaryChallenge);
            temporaryChallenge = null;
            temporaryChallengePosition = 0;
        }
    }

    public void onSnackbarTimeout() {
        temporaryChallenge = null;
        temporaryChallengePosition = 0;
    }
}
