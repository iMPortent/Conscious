package com.example.c4q.conscious.controller;

/*import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.intelligencetips.model.TipsModel;
import com.example.c4q.conscious.views.activities.IntelligenceTips2Activity;

import java.util.List;

import static android.view.View.*;


public class IntelligentTipsAdapter extends RecyclerView.Adapter<IntelligentTipsAdapter.ViewHolder> {

    public List<TipsModel> tipsList;
    public Context mContext;


    });
            // open another activity on item click
            Intent intent = new Intent(mContext, IntelligenceTips2Activity.class);
            intent.putExtra("image", position); // put image data in Intent
            mContext.startActivity(intent); // start Intent



    @Override
        public void onClick(View v) {
            Log.d(TAG, "onClick " + getAdapterPosition() + " " + typeSelected);

                Intent startDetail = new Intent(itemView.getContext(), IntelligenceTips2Activity.class);
                itemView.getContext().startActivity(startDetail);
            }
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
        holder.itemView.setOnClickListener(new OnClickListener() {

}

    @Override
    public int getItemCount() {
        return tipsList.size();
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
public IntelligentTipsAdapter(Context c, List<TipsModel> tipsList) {
        this.mContext = c; this.tipsList = tipsList;
        }
        }

public class ViewHolder extends RecyclerView.ViewHolder implements OnClickListener{

    private static final String TAG = "tag";

    // fields:
    ImageButton enterChallengesButton;
    String typeSelected;

    public ViewHolder(View itemView) {
        super(itemView);

        enterChallengesButton = itemView.findViewById(R.id.enter_intel_type_button);

    }

    public void onBind(TipsModel tipsModel) {
        enterChallengesButton.setImageDrawable((tipsModel.getEnterIntelType()));
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(mContext, IntelligenceTips2Activity.class);
        intent.putExtra("image", position); // put image data in Intent
        mContext.startActivity(intent); // start Intent

    } */