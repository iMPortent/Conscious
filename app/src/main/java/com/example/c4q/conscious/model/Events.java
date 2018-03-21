package com.example.c4q.conscious.model;

import java.util.ArrayList;

/**
 * Created by C4Q on 3/20/18.
 */

public class Events {

    private ArrayList<EventsModel> eventResults;

    public Events(ArrayList<EventsModel> eventResults) {
        this.eventResults = eventResults;
    }

    public ArrayList<EventsModel> getEventResults() {
        return eventResults;
    }

    public void setEventResults(ArrayList<EventsModel> eventResults) {
        this.eventResults = eventResults;
    }
}
