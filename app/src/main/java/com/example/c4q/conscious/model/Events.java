package com.example.c4q.conscious.model;

import java.util.ArrayList;


public class Events {

    /***
     *
     * You don't need the events model for the recycler view, just deal with the eventModel
     *
     * **/

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

    public static ArrayList<EventsModel> createContactsList(int numEvents) {
        ArrayList<EventsModel> events = new ArrayList<EventsModel>();

        for (int i = 1; i <= numEvents; i++) {
            events.add(new EventsModel());
        }

        return events;
    }
}
