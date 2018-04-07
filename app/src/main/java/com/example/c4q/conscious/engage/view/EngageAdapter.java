package com.example.c4q.conscious.engage.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.c4q.conscious.R;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;


public class EngageAdapter extends RecyclerView.Adapter<EngageAdapter.EngageViewHolder> {

    private List<EngageDataModel> engageDataList;

    public EngageAdapter(List<EngageDataModel> engageDataList) {
        this.engageDataList = engageDataList;
    }


    @NonNull
    @Override
    public EngageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_engage_item_view, parent, false);
        return new EngageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EngageViewHolder holder, int position) {
        holder.challengeName.setText("Musical");
        //attach your views with holder

    }

    @Override
    public int getItemCount() {
        return engageDataList.size();
    }

    public static class EngageViewHolder extends RecyclerView.ViewHolder {

        CardView challengeCardView;
        CircleImageView challengeIcon;
        TextView challengeName;
        TextView challengeDetail;

        public EngageViewHolder(View itemView) {
            super(itemView);

            challengeCardView = itemView.findViewById(R.id.challengeCardview);
            challengeIcon = itemView.findViewById(R.id.challengeIcon);
            challengeName = itemView.findViewById(R.id.challengeType);
            challengeDetail = itemView.findViewById(R.id.challengeBrief);

        }
    }
}
