package com.example.c4q.conscious.model;

public class Challenges {

    private String challenge_name;
    private String challenge_detail;
    private int challenge_color_resource;

    public Challenges(String dateAndTime, String message, int colorResource) {
        this.challenge_name = dateAndTime;
        this.challenge_detail = message;
        this.challenge_color_resource = colorResource;
    }

    public int getChallenge_color_resource() {
        return challenge_color_resource;
    }

    public void setChallenge_color_resource(int challenge_color_resource) {
        this.challenge_color_resource = challenge_color_resource;
    }

    public String getChallenge_name() {
        return challenge_name;
    }

    public void setChallenge_name(String challenge_name) {
        this.challenge_name = challenge_name;
    }


    public String getChallenge_detail() {
        return challenge_detail;
    }

    public void setChallenge_detail(String challenge_detail) {
        this.challenge_detail = challenge_detail;
    }
}
