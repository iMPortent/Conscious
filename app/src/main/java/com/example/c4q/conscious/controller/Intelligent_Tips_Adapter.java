package com.example.c4q.conscious.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.model.TipsModel;

import java.util.List;

public class Intelligent_Tips_Adapter extends RecyclerView.Adapter<Intelligent_Tips_Adapter.ViewHolder> {


    public List<TipsModel> tipsList;

    public Intelligent_Tips_Adapter(List<TipsModel> tipsList) {
        this.tipsList = tipsList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView type;
        ImageView accomplishedImageView;
        ImageView currentChallengesInProgress;
        ImageButton enterChallengesButton;


        public ViewHolder(View itemView) {
            super(itemView);

            type = itemView.findViewById(R.id.type_of_intelligence);
            accomplishedImageView = itemView.findViewById(R.id.challenge_image);
            currentChallengesInProgress = itemView.findViewById(R.id.current_in_progress_image_view);
            enterChallengesButton = itemView.findViewById(R.id.enter_challenges_button);
        }

        public void onBind(TipsModel tipsModel) {
            type.setText("Type: " + tipsModel.getIntelligentType());
            //challengesImageView;
            //currentChallengesInProgress;

        }
    }


    @Override
    public Intelligent_Tips_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.intelligent_tips_item_view, parent, false);

        return new ViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(Intelligent_Tips_Adapter.ViewHolder holder, int position) {

        TipsModel tipsModel = tipsList.get(position);

        holder.onBind(tipsModel);
    }

    @Override
    public int getItemCount() {
        return tipsList.size();
    }
}
