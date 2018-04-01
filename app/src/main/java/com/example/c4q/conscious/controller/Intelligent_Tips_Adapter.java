package com.example.c4q.conscious.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        TextView category;
        TextView tip;


        public ViewHolder(View itemView) {
            super(itemView);
            category = itemView.findViewById(R.id.category);
            tip = itemView.findViewById(R.id.tips);
        }

        public void onBind(TipsModel tipsModel) {

            category.setText("Type: " + tipsModel.getCategory());
            tip.setText("Tip: " + tipsModel.getTip());

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
