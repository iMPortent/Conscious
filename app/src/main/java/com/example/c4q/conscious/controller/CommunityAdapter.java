package com.example.c4q.conscious.controller;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.model.Events;
import com.example.c4q.conscious.model.EventsModel;
import com.example.c4q.conscious.views.fragments.CommunityFragment;

import java.util.ArrayList;

public class CommunityAdapter extends RecyclerView.Adapter<CommunityAdapter.CommunityViewHolder> {

    public ArrayList<Events> eventsList;

    public CommunityAdapter(){
        this.eventsList = new ArrayList<>();
    }

    public CommunityAdapter(ArrayList<Events> eventsList) {
        this.eventsList = eventsList;
        notifyDataSetChanged();
    }

    @Override
    public CommunityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.community_fragment, parent, false);
        return new CommunityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CommunityViewHolder holder, int position) {
        Events events = eventsList.get(position);
        holder.onBind(events.getEventResults().get(position));
    }

    @Override
    public int getItemCount() {
        return eventsList.size();
    }

    public class CommunityViewHolder extends RecyclerView.ViewHolder {

        private TextView event_name;
        private TextView event_location;
        private TextView event_date;
        private TextView event_time;

        public CommunityViewHolder(View itemView) {
            super(itemView);

            event_name = itemView.findViewById(R.id.event_name);
            event_location = itemView.findViewById(R.id.event_location);
            event_date = itemView.findViewById(R.id.event_date);
            event_time = itemView.findViewById(R.id.event_time);
        }


        public void onBind(EventsModel eventsModel) {
            Log.d("MESSAGE", "onBind: " + eventsModel.getEvent_name());
            event_name.setText(eventsModel.getEvent_name());
            event_location.setText(eventsModel.getEvent_location());
            event_date.setText(eventsModel.getEvent_date());
            event_time.setText(eventsModel.getEvent_time());
        }
    }
}
