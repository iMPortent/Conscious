package com.example.c4q.conscious.smart.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.c4q.conscious.R;

import java.util.List;


public class GoalAdapter extends RecyclerView.Adapter<GoalAdapter.GoalHolder> {

    List<String> goals;

    public GoalAdapter(List<String> goals){
        this.goals = goals;
    }

    @Override
    public GoalHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.smart_recycler_items, parent, false);
        return new GoalHolder(view);
    }

    @Override
    public int getItemCount() {
        return goals.size();
    }

    @Override
    public void onBindViewHolder(GoalHolder holder, int position) {
        holder.bind(goals.get(position));
    }

    public void update(){
        notifyDataSetChanged();
    }

    class GoalHolder extends RecyclerView.ViewHolder {

        TextView thisGoal;

        public GoalHolder(View itemView) {
            super(itemView);
            thisGoal = itemView.findViewById(R.id.text_item_goal);
        }

        public void bind(String goal){
            thisGoal.setText(goal);
        }
    }
}
