package com.example.c4q.conscious.controller;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.intelligencetips.model.TipsModel;
import com.example.c4q.conscious.views.activities.IntelligenceTips2Activity;

import java.util.ArrayList;
import java.util.List;

public class Intelligent_TipAdapter extends RecyclerView.Adapter<Intelligent_TipAdapter.ViewHolder> {


    private static final String TAG = " adapter";

    public List<TipsModel> tipsList;
    public Context mContext;
    public int[] drawables;


    public Intelligent_TipAdapter(Context mContext) {
        this.mContext = mContext;
        setUPRVData();

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
    public void setUPRVData() {


        drawables = new int[]{
                R.drawable.it_body_iv,
                R.drawable.it_existential_iv,
                R.drawable.it_musical_iv,
                R.drawable.it_math_iv,
                R.drawable.it_people_iv,
                R.drawable.it_nature_iv,
                R.drawable.it_spatial_iv,
                R.drawable.it_self_iv,
                R.drawable.it_word_iv,


        };
        tipsList = new ArrayList<>();
        for (int i = 0; i < drawables.length; i++) {

            Log.d(TAG, "IN ON CREATE VIEW ");



            tipsList.add(new TipsModel(drawables[i]));

        }
    } // ends setuprvDATA()


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageButton enterCategoryDetails;


        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            enterCategoryDetails = itemView.findViewById(R.id.enter_intel_type_button);
        }

        /**
         * sets up the views
         */

        public void onBind(TipsModel tipsModel) {

            ; // set up data


            try {
                enterCategoryDetails.setImageResource((tipsModel.getEnterIntelType()));


            } catch (NullPointerException ex) {
                //
            }


        }


        @Override
        public void onClick(View v) {
            Intent startIntelligentTipDetail = new Intent(itemView.getContext(), IntelligenceTips2Activity.class);
            itemView.getContext().startActivity(startIntelligentTipDetail);
        }


    }


}