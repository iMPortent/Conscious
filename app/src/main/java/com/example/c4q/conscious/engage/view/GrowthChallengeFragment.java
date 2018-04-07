package com.example.c4q.conscious.engage.view;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.engage.model.Challenges;
import com.example.c4q.conscious.smart.ViewInterface;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/*public class GrowthChallengeFragment extends Fragment implements ViewInterface, View.OnClickListener {

    private static final String CHALLENGE_NAME = "CHALLENGE_NAME";
    private static final String CHALLENGE_MESSAGE = "CHALLENGE_MESSAGE";
    private static final String CHALLENGE_DRAWABLE = "CHALLENGE_DRAWABLE";
    private List<Challenges> listOfData;
    private LayoutInflater layoutInflater;
    private GrowthChallengeAdapter growthChallengeAdapter;
    private GrowthChallengeController growthChallengeController;
    Challenges listItem;

    CardView cardView;
    CircleImageView circleImageView;
    TextView tv1;
    TextView tv2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_growth_challenge, container, false);
        init(view);

        return view;
    }

    public void init(View view) {
        cardView = view.findViewById(R.id.pfeed_card_view1);
        circleImageView = view.findViewById(R.id.circle_image_view);
        tv1 = view.findViewById(R.id.challenge_name_tv);
        tv2 = view.findViewById(R.id.challenge_tv);
        growthChallengeController = new GrowthChallengeController(this);
        layoutInflater = getLayoutInflater();

    }

    @Override
    public void startChallengeDetailActivity(String dateAndTime, String message, int colorResource, View viewRoot) {
        Intent i = new Intent(getActivity(), ChallengeDetailActivity.class);
        i.putExtra(CHALLENGE_NAME, dateAndTime);
        i.putExtra(CHALLENGE_MESSAGE, message);
        i.putExtra(CHALLENGE_DRAWABLE, colorResource);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getActivity().getWindow().setEnterTransition(new android.transition.Fade(android.transition.Fade.IN));
            getActivity().getWindow().setEnterTransition(new android.transition.Fade(android.transition.Fade.OUT));

            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(getActivity(),
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
                listItem = listOfData.get(
                        this.getAdapterPosition()
                );
                growthChallengeController.onChallengeClick(listItem, v);
            }
        }
    }
} */