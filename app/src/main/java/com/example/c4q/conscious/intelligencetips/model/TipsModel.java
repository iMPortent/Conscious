package com.example.c4q.conscious.intelligencetips.model;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

public class TipsModel {
    Drawable enterIntelType;

    public TipsModel( Drawable enterIntelType) {
        this.enterIntelType = enterIntelType;
    }

    public Drawable getEnterIntelType() {
        return enterIntelType;
    }

}