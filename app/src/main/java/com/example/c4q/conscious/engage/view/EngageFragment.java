package com.example.c4q.conscious.engage.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.c4q.conscious.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class EngageFragment extends Fragment {

    private ImageView gamesCircle;
    private ImageView challengesCircle;
    private ImageView engageIcon;

    public EngageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_engage, container, false);
        gamesCircle = view.findViewById(R.id.games_btn);
        challengesCircle = view.findViewById(R.id.challenges_btn);
        engageIcon = view.findViewById(R.id.engage_icon);
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        gamesCircle.setOnClickListener(v -> {
            Intent intoGamesActivity = new Intent(getActivity(), GameLevelActivity.class);
            startActivity(intoGamesActivity);
        });

        challengesCircle.setOnClickListener(v -> {
            Intent intoChallengesActivity = new Intent(getActivity(), ChallengeLevelActivity.class);
            startActivity(intoChallengesActivity);
        });
    }
}
