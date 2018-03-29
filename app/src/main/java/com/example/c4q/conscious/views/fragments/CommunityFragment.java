package com.example.c4q.conscious.views.fragments;


import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.views.activities.MusicActivity;


public class CommunityFragment extends Fragment {

//    ImageView engage_logo;
    ImageView placeholder_one;
    ImageView placeholder_two;
    ImageView placeholder_three;

    public CommunityFragment(){
        //Default constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.community_fragment, container, false);
//        engage_logo = view.findViewById(R.id.engage_logo);
        placeholder_one = view.findViewById(R.id.placeholder_one);
        placeholder_two = view.findViewById(R.id.placeholder_two);
        placeholder_three = view.findViewById(R.id.placeholder_three);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        placeholder_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toActivity = new Intent(getActivity(), MusicActivity.class);
                getActivity().startActivity(toActivity);
            }
        });

    }
}
