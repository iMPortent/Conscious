package com.example.c4q.conscious.intelligencetips.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.intelligencetips.model.TipsModel;
import com.example.c4q.conscious.intelligencetips.controller.Intelligent_Tips_Adapter;

import java.util.ArrayList;
import java.util.List;


public class IntelligentTipsFragment extends Fragment {


    RecyclerView intelligentTipsRv;
    List<TipsModel> rvData;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_intelligent_tips, container, false);

        intelligentTipsRv = (RecyclerView) root.findViewById(R.id.intelligent_tips_rv);

        rvData = new ArrayList<>();



        rvData.add( new TipsModel(getString(R.string.body_smart),getString(R.string.body_smart_card_1)));
        rvData.add( new TipsModel(getString(R.string.body_smart),getString(R.string.body_smart_card2)));
        rvData.add( new TipsModel(getString(R.string.body_smart),getString(R.string.body_smart_card3)));
        rvData.add( new TipsModel(getString(R.string.body_smart),getString(R.string.body_smart_card4)));
        rvData.add( new TipsModel(getString(R.string.body_smart),getString(R.string.body_smart_card5)));
        rvData.add( new TipsModel(getString(R.string.body_smart),getString(R.string.body_smart_card6)));
        rvData.add( new TipsModel(getString(R.string.body_smart),getString(R.string.body_smart_card7)));
        rvData.add( new TipsModel(getString(R.string.music_smart),getString(R.string.music_smart_card1)));
        rvData.add( new TipsModel(getString(R.string.music_smart),getString(R.string.music_smart_card2)));
        rvData.add( new TipsModel(getString(R.string.music_smart),getString(R.string.music_smart_card3)));
        rvData.add( new TipsModel(getString(R.string.music_smart),getString(R.string.music_smart_card4)));
        rvData.add( new TipsModel(getString(R.string.music_smart),getString(R.string.music_smart_card5)));
        rvData.add( new TipsModel(getString(R.string.music_smart),getString(R.string.music_smart_card6)));
        rvData.add( new TipsModel(getString(R.string.nature_smart),getString(R.string.nature_smart_card1)));
        rvData.add( new TipsModel(getString(R.string.nature_smart),getString(R.string.nature_smart_card2)));
        rvData.add( new TipsModel(getString(R.string.number_smart),getString(R.string.number_smart_card1)));
        rvData.add( new TipsModel(getString(R.string.number_smart),getString(R.string.number_smart_card2)));
        rvData.add( new TipsModel(getString(R.string.number_smart),getString(R.string.number_smart_card3)));
        rvData.add( new TipsModel(getString(R.string.number_smart),getString(R.string.number_smart_card4)));
        rvData.add( new TipsModel(getString(R.string.number_smart),getString(R.string.number_smart_card5)));
        rvData.add( new TipsModel(getString(R.string.number_smart),getString(R.string.number_smart_card6)));
        rvData.add( new TipsModel(getString(R.string.people_smart),getString(R.string.people_smart_card1)));
        rvData.add( new TipsModel(getString(R.string.people_smart),getString(R.string.people_smart_card2)));
        rvData.add( new TipsModel(getString(R.string.people_smart),getString(R.string.people_smart_card3)));
        rvData.add( new TipsModel(getString(R.string.people_smart),getString(R.string.people_smart_Card4)));
        rvData.add( new TipsModel(getString(R.string.people_smart),getString(R.string.people_smart_card5)));
        rvData.add( new TipsModel(getString(R.string.people_smart),getString(R.string.people_smart_card6)));
        rvData.add( new TipsModel(getString(R.string.people_smart),getString(R.string.people_smart_card7)));
        rvData.add( new TipsModel(getString(R.string.people_smart),getString(R.string.people_smart_card8)));
        rvData.add( new TipsModel(getString(R.string.picture_smart),getString(R.string.picture_smart_card1)));
        rvData.add( new TipsModel(getString(R.string.picture_smart),getString(R.string.picture_smart_card2)));
        rvData.add( new TipsModel(getString(R.string.picture_smart),getString(R.string.picture_smart_card3)));
        rvData.add( new TipsModel(getString(R.string.picture_smart),getString(R.string.picture_smart_card4)));
        rvData.add( new TipsModel(getString(R.string.picture_smart),getString(R.string.picture_smart_card5)));
        rvData.add( new TipsModel(getString(R.string.picture_smart),getString(R.string.picture_smart_card6)));
        rvData.add( new TipsModel(getString(R.string.self_smart),getString(R.string.self_smart_card1)));
        rvData.add( new TipsModel(getString(R.string.self_smart),getString(R.string.self_smart_card2)));
        rvData.add( new TipsModel(getString(R.string.self_smart),getString(R.string.self_smart_card3)));
        rvData.add( new TipsModel(getString(R.string.self_smart),getString(R.string.self_smart_card4)));
        rvData.add( new TipsModel(getString(R.string.self_smart),getString(R.string.self_smart_card5)));
        rvData.add( new TipsModel(getString(R.string.self_smart),getString(R.string.self_smart_card6)));
        rvData.add( new TipsModel(getString(R.string.word_smart),getString(R.string.word_smart_card1)));
        rvData.add( new TipsModel(getString(R.string.word_smart),getString(R.string.word_smart_card2)));
        rvData.add( new TipsModel(getString(R.string.word_smart),getString(R.string.word_smart_card3)));
        rvData.add( new TipsModel(getString(R.string.word_smart),getString(R.string.word_smart_card4)));
        rvData.add( new TipsModel(getString(R.string.word_smart),getString(R.string.word_smart_card5)));
        rvData.add( new TipsModel(getString(R.string.word_smart),getString(R.string.word_smart_card6)));
        rvData.add( new TipsModel(getString(R.string.word_smart),getString(R.string.word_smart_card7)));


        Intelligent_Tips_Adapter intelligentTipsAdapter = new Intelligent_Tips_Adapter(rvData);

        intelligentTipsRv.setAdapter(intelligentTipsAdapter);

        intelligentTipsRv.setLayoutManager(new LinearLayoutManager(getContext()));
        // intelligentTipsRv.setLayoutManager(new LinearLayoutManager(getSu));

        return root;
    }

}