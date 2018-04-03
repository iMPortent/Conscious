package com.example.c4q.conscious.model;

import android.widget.ImageView;

public class TipsModel {

    String intelligentType;
    ImageView challengesImageView;
    ImageView currentImageView;

    public TipsModel(String intelligentType, ImageView challengesImageView, ImageView currentImageView) {
        this.intelligentType = intelligentType;
        this.challengesImageView = challengesImageView;
        this.currentImageView = currentImageView;
    }

    public TipsModel(String intelligentType) {
        this.intelligentType = intelligentType;
    }

    public String getIntelligentType() {
        return intelligentType;
    }

    public ImageView getChallengesImageView() {
        return challengesImageView;
    }

    public ImageView getCurrentImageView() {
        return currentImageView;
    }


}