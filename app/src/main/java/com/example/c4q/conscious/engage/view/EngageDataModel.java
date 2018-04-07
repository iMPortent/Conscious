package com.example.c4q.conscious.engage.view;


/**
 * Created by C4Q on 4/6/18.
 */

public class EngageDataModel {

    private String challengeName;
    private String challengeDetail;
    private int challengeIcon;

    public EngageDataModel(String challengeName, String challengeDetail, int challengeIcon) {
        this.challengeName = challengeName;
        this.challengeDetail = challengeDetail;
        this.challengeIcon = challengeIcon;
    }

    public String getChallengeName() {
        return challengeName;
    }

    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    public String getChallengeDetail() {
        return challengeDetail;
    }

    public void setChallengeDetail(String challengeDetail) {
        this.challengeDetail = challengeDetail;
    }

    public int getChallengeIcon() {
        return challengeIcon;
    }

    public void setChallengeIcon(int challengeIcon) {
        this.challengeIcon = challengeIcon;
    }
}
