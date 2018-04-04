package com.example.c4q.conscious.model;

import android.graphics.drawable.Drawable;

public class TipsModel {

    String intelligentType;
    Drawable enterIntelType;

    public TipsModel(String intelligentType, Drawable enterIntelType) {
        this.intelligentType = intelligentType;
        this.enterIntelType = enterIntelType;
    }

    public TipsModel(String intelligentType) {
        this.intelligentType = intelligentType;
    }

    public String getIntelligentType() {
        return intelligentType;
    }

    public Drawable getEnterIntelType() {
        return enterIntelType;
    }


}