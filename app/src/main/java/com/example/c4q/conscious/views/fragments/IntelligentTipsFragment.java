package com.example.c4q.conscious.views.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.bumptech.glide.load.engine.Resource;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.controller.Intelligent_Tips_Adapter;
import com.example.c4q.conscious.model.TipsModel;
import com.example.c4q.conscious.views.activities.MainActivity;
import com.example.c4q.conscious.views.activities.WelcomeActivity;

import java.util.ArrayList;
import java.util.List;

import static android.widget.LinearLayout.VERTICAL;


public class IntelligentTipsFragment extends Fragment {


    RecyclerView intelligentTipsRv;

    Context mContext;

    LinearLayoutManager linearLayoutManager;

    ImageButton enterChallengesButton;

    List<TipsModel> rvData;

    Intent sendToChallenges;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_intelligent_tips, container, false);

        mContext = getContext();

        intelligentTipsRv = (RecyclerView) root.findViewById(R.id.intelligent_tips_rv);

        enterChallengesButton = (ImageButton) root.findViewById(R.id.enter_challenges_button);

        rvData = new ArrayList<>();

        rvData.add( new TipsModel(getString(R.string.body_smart)));
        rvData.add( new TipsModel(getString(R.string.music_smart)));
        rvData.add( new TipsModel(getString(R.string.nature_smart)));
        rvData.add( new TipsModel(getString(R.string.number_smart)));
        rvData.add( new TipsModel(getString(R.string.people_smart)));
        rvData.add( new TipsModel(getString(R.string.picture_smart)));
        rvData.add( new TipsModel(getString(R.string.self_smart)));
        rvData.add( new TipsModel(getString(R.string.word_smart)));

        Intelligent_Tips_Adapter intelligentTipsAdapter = new Intelligent_Tips_Adapter(rvData);

        intelligentTipsRv.setAdapter(intelligentTipsAdapter);

                linearLayoutManager = new LinearLayoutManager(mContext, VERTICAL, false);

        intelligentTipsRv.setLayoutManager(linearLayoutManager);

        enterChallengesButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                sendToChallenges = new Intent(mContext, GrowthChallengeFragment.class);

            }
        });

        return root;
    }

}