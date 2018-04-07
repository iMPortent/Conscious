package com.example.c4q.conscious.controller;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.intelligencetips.model.TipsModel;
import com.example.c4q.conscious.views.activities.IntelligenceTips2Activity;

import java.util.List;

public class Intelligent_TipAdapter extends RecyclerView.Adapter<Intelligent_TipAdapter.ViewHolder> {


    public List<TipsModel> tipsList;
    public Context mContext;

    public Intelligent_TipAdapter(Context mContext, List<TipsModel> tipsList) {
        this.mContext = mContext;
        this.tipsList = tipsList;

    }

    @Override
    public Intelligent_TipAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.intelligent_tips_item_view, parent, false);

        return new ViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(Intelligent_TipAdapter.ViewHolder holder, int position) {

        TipsModel tipsModel = tipsList.get(position);
        holder.onBind(tipsModel);
    }

    @Override
    public int getItemCount() {
        return tipsList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageButton enterCategoryDetails;


        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
        }

        public void onBind(TipsModel tipsModel) {

            enterCategoryDetails.setImageDrawable((tipsModel.getEnterIntelType()));


        }


        @Override
        public void onClick(View v) {
            Intent startIntelligentTipDetail = new Intent(itemView.getContext(), IntelligenceTips2Activity.class);
            itemView.getContext().startActivity(startIntelligentTipDetail);
        }
    }

    public static class SpacesItemDecoration extends RecyclerView.ItemDecoration {
        private final int mSpace;

        public SpacesItemDecoration(int space) {
            this.mSpace = space;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            outRect.left = 20;
            outRect.right = 20;
            outRect.bottom = 20;

            // Add top margin only for the first item to avoid double space between items
            if (parent.getChildAdapterPosition(view) == 0)
                outRect.top = mSpace;
        }
    }
}