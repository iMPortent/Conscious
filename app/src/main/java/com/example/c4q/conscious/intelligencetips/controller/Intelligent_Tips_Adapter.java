package com.example.c4q.conscious.intelligencetips.controller;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.engage.view.GrowthChallengeFragment;
import com.example.c4q.conscious.intelligencetips.model.TipsModel;

import java.util.List;

public class Intelligent_Tips_Adapter extends RecyclerView.Adapter<Intelligent_Tips_Adapter.ViewHolder> {


    public List<TipsModel> tipsList;

    public Intelligent_Tips_Adapter(List<TipsModel> tipsList) {
        this.tipsList = tipsList;
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


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView category;
        TextView tip;


        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            category = itemView.findViewById(R.id.category);
            tip = itemView.findViewById(R.id.tips);
        }

        public void onBind(TipsModel tipsModel) {

            category.setText("Type: " + tipsModel.getCategory());
            tip.setText("Tip: " + tipsModel.getTip());

        }

        @Override
        public void onClick(View v) {
            Intent startVivs = new Intent(itemView.getContext(), GrowthChallengeFragment.class);
            itemView.getContext().startActivity(startVivs);
        }
    }



}
