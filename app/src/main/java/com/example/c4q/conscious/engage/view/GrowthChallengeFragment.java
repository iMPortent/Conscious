package com.example.c4q.conscious.engage.view;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.engage.controller.GrowthChallengeController;
import com.example.c4q.conscious.engage.model.Challenges;
import com.example.c4q.conscious.smart.ViewInterface;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;

public class GrowthChallengeFragment extends Fragment implements ViewInterface, View.OnClickListener {

    private static final String CHALLENGE_NAME = "CHALLENGE_NAME";
    private static final String CHALLENGE_MESSAGE = "CHALLENGE_MESSAGE";
    private static final String CHALLENGE_DRAWABLE = "CHALLENGE_DRAWABLE";
    private GrowthChallengeAdapter growthChallengeAdapter;
    private List<Challenges> listOfData;
    private LayoutInflater layoutInflater;

    RecyclerView recyclerView;
    CardView cardView;
    CircleImageView circleImageView;
    TextView tv1;
    TextView tv2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.community_item_view, container, false);
        init(view);
        return view;
    }

    public void init(View view) {
        recyclerView = view.findViewById(R.id.recycler_view);
        cardView = view.findViewById(R.id.pfeed_card_view1);
        circleImageView = view.findViewById(R.id.circle_image_view);
        tv1 = view.findViewById(R.id.challenge_name_tv);
        tv2 = view.findViewById(R.id.challenge_tv);

        RecyclerView.LayoutManager recll = new GridLayoutManager(getContext().getApplicationContext(),3);
        recyclerView.setLayoutManager(recll);

        final String[] challenges = {
                "Musical / Rhythmic Challenge",
                "Bodily / Kinesthetics Challenge",
                "Logical / Mathematial Challenge",
                "Naturalist Challenge",
                "Visual / Spatial Challenge",
                "Verbal / Linguistic Challenge",
                "Interpersonal / Social Challenge",
                "Intra - personal / Introspective Challenge"
        };

        final String[] challengeDetails = {
                "Dive into the exploration of musical chords as you slowly become an instrumentalist",
                "Align with your SMART Goals and keep your mind and body in shape",
                "Build and crack with the algorithm you never thought you could",
                "Find and take a picture of your state bird",
                "Draw and recreate the monuments or parks of your town",
                "Learn how to say five phrases in German",
                "Attend 3 meetups this coming week",
                "Attend your local next museum exhibit and pick out five of your favorite pieces"

        };


        final int[] drawables = {
                R.drawable.green_drawable,
                R.drawable.red_drawable,
                R.drawable.blue_drawable,
                R.drawable.yellow_drawable
        };

        // Initialize a new instance of RecyclerView Adapter instance
        growthChallengeAdapter = new GrowthChallengeAdapter(getContext().getApplicationContext(), challenges);

        // Set the adapter for RecyclerView
        recyclerView.setAdapter(growthChallengeAdapter);

        GrowthChallengeController growthChallengeController = new GrowthChallengeController(this);
        layoutInflater = getLayoutInflater();

    }

    @Override
    public void startChallengeDetailActivity(String dateAndTime, String message, int colorResource, View viewRoot) {
        Intent i = new Intent(getActivity(), ChallengeDetailActivity.class);
        i.putExtra(CHALLENGE_NAME, dateAndTime);
        i.putExtra(CHALLENGE_MESSAGE, message);
        i.putExtra(CHALLENGE_DRAWABLE, colorResource);

        //Where the animation happens from the onClick of the circle image view to the Detail Activity.

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


    private class GrowthChallengeAdapter extends RecyclerView.Adapter<GrowthChallengeAdapter.GrowthChallengeViewholder> {


        public GrowthChallengeAdapter(Context applicationContext, String[] challenges) {

        }

        @NonNull
        @Override
        public GrowthChallengeViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = layoutInflater.inflate(R.layout.community_item_view, parent, false);
            return new GrowthChallengeViewholder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull GrowthChallengeViewholder holder, int position) {

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

            GrowthChallengeViewholder(View itemView) {
                super(itemView);
                this.challenge_circle = itemView.findViewById(R.id.circle_image_view);
                this.challenge_message = itemView.findViewById(R.id.challenge_name_tv);
                this.container = itemView.findViewById(R.id.root_main_item);
                this.container.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
//                Challenges challenges = listOfData.get(
//                        this.getAdapterPosition()
//                );
//
//                growthChallengeController.onChallengeClick(
//                        challenges,
//                        v
//                );

            }
        }
    }
}
