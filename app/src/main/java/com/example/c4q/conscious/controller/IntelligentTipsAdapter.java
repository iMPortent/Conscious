package com.example.c4q.conscious.controller;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.intelligencetips.model.TipsModel;
import java.util.List;

public class IntelligentTipsAdapter extends RecyclerView.Adapter<IntelligentTipsAdapter.ViewHolder> {

    public List<TipsModel> tipsList;

    public IntelligentTipsAdapter(List<TipsModel> tipsList) {
        this.tipsList = tipsList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private static final String TAG = "tag";
        TextView type;
        ImageButton enterChallengesButton;
        String typeSelected;

        public ViewHolder(View itemView) {
            super(itemView);

            type = itemView.findViewById(R.id.type_of_intelligence);
            typeSelected = type.getText().toString();
            enterChallengesButton = itemView.findViewById(R.id.enter_intel_type_button);
        }

        public void onBind(TipsModel tipsModel) {
            type.setText("Type: " + tipsModel.getIntelligentType());
            enterChallengesButton.setImageDrawable((tipsModel.getEnterIntelType()));
        }

        public void setItem(String type){
            typeSelected = type;
        }

        @Override
        public void onClick(View v) {
            Log.d(TAG, "onClick " + getAdapterPosition() + " " + typeSelected);
        }
    }

    @Override
    public IntelligentTipsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.intelligent_tips_item_view, parent, false);

        return new ViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(IntelligentTipsAdapter.ViewHolder holder, int position) {

        TipsModel tipsModel = tipsList.get(position);

        holder.onBind(tipsModel);
    }

    @Override
    public int getItemCount() {
        return tipsList.size();
    }
}