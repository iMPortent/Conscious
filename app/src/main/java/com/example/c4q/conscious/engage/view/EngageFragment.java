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

    private CircleImageView gamesCircle;
    private CircleImageView challengesCircle;
    private TextView gamesTv;
    private TextView challengesTv;
    private ImageView engageIcon;

    public EngageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_engage, container, false);
        gamesCircle = view.findViewById(R.id.gamesCircle);
        challengesCircle = view.findViewById(R.id.challengesCircle);
        gamesTv = view.findViewById(R.id.games);
        challengesTv = view.findViewById(R.id.challenges);
        engageIcon = view.findViewById(R.id.engage_icon);
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        gamesCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intoGamesActivity = new Intent(getActivity(), GameLevelActivity.class);
                startActivity(intoGamesActivity);
            }
        });

        challengesCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intoChallengesActivity = new Intent(getActivity(), GameLevelActivity.class);
                startActivity(intoChallengesActivity);
            }
        });
    }
}
