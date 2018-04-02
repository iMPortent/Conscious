package com.example.c4q.conscious.model;

public class TipsModel {
    String category;
    String tip;

    public TipsModel(String category, String tip) {
        this.category = category;
        this.tip = tip;
    }
    public String getCategory() {
        return category;
    }
    public String getTip() {
        return tip;
    }

}