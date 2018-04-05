package com.example.c4q.conscious.views.activities;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.c4q.conscious.ChallengeDataSource;
import com.example.c4q.conscious.ChallengeDetailActivity;
import com.example.c4q.conscious.GrowthChallengeController;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.ViewInterface;
import com.example.c4q.conscious.model.Challenges;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;

public class GrowthChallengeActivity extends AppCompatActivity implements ViewInterface, View.OnClickListener{

    private static final String CHALLENGE_NAME = "CHALLENGE_NAME";
    private static final String CHALLENGE_MESSAGE = "CHALLENGE_MESSAGE";
    private static final String CHALLENGE_DRAWABLE = "CHALLENGE_DRAWABLE";
    private List<Challenges> listOfData;
    private LayoutInflater layoutInflater;
    private GrowthChallengeAdapter growthChallengeAdapter;
    private GrowthChallengeController growthChallengeController;

    CardView cardView;
    CircleImageView circleImageView;
    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_growth_challenge);

        layoutInflater = getLayoutInflater();

        cardView = findViewById(R.id.pfeed_card_view1);
        circleImageView = findViewById(R.id.circle_image_view);
        tv1 = findViewById(R.id.challenge_name_tv);
        tv2 = findViewById(R.id.challenge_tv);

        growthChallengeController = new GrowthChallengeController(this, new ChallengeDataSource());
    }

    @Override
    public void startChallengeDetailActivity(String dateAndTime, String message, int colorResource, View viewRoot) {
        Intent i = new Intent(this, ChallengeDetailActivity.class);
        i.putExtra(CHALLENGE_NAME, dateAndTime);
        i.putExtra(CHALLENGE_MESSAGE, message);
        i.putExtra(CHALLENGE_DRAWABLE, colorResource);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setEnterTransition(new android.transition.Fade(android.transition.Fade.IN));
            getWindow().setEnterTransition(new android.transition.Fade(android.transition.Fade.OUT));

            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this,
                    new android.util.Pair<>(viewRoot.findViewById(R.id.circle_image_view),
                            getString(R.string.transition_drawable)
                    ));

            startActivity(i, options.toBundle());


        } else {
            startActivity(i);
        }
    }

    @Override
    public void startChallenge(View view) {
        //when start challenge ...
    }

    @Override
    public void completeChallenge(View view) {
        //when complete challenge ...
    }


    @Override
    public void onClick(View v) {

    }


    private class GrowthChallengeAdapter extends RecyclerView.Adapter<GrowthChallengeAdapter.GrowthChallengeViewholder> {//6

        @Override
        public GrowthChallengeViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = layoutInflater.inflate(R.layout.community_item_view, parent, false);
            return new GrowthChallengeViewholder(v);
        }

        @Override
        public void onBindViewHolder(GrowthChallengeViewholder holder, int position) {

            Challenges currentItem = listOfData.get(position);

            holder.challenge_circle.setImageResource(
                    currentItem.getChallenge_color_resource()
            );

            holder.challenge_message.setText(
                    currentItem.getChallenge_name()
            );

        }

        @Override
        public int getItemCount() {
            return listOfData.size();
        }

        class GrowthChallengeViewholder extends RecyclerView.ViewHolder implements View.OnClickListener {

            private CircleImageView challenge_circle;
            private TextView challenge_message;
            private ViewGroup container;

            public GrowthChallengeViewholder(View itemView) {
                super(itemView);
                this.challenge_circle = itemView.findViewById(R.id.circle_image_view);
                this.challenge_message = itemView.findViewById(R.id.challenge_name_tv);
                this.container = itemView.findViewById(R.id.root_main_item);
                this.container.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
                Challenges listItem = listOfData.get(
                        this.getAdapterPosition()
                );

                growthChallengeController.onChallengeClick(
                        listItem,
                        v
                );

            }
        }
    }
}
