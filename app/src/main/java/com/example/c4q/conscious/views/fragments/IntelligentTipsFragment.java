package com.example.c4q.conscious.views.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD
import com.brandongogetap.stickyheaders.exposed.StickyHeaderHandler;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.controller.Intelligent_Tips_Adapter;
import com.example.c4q.conscious.views.activities.GrowthChallengeActivity;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;


public class IntelligentTipsFragment extends Fragment implements StickyHeaderHandler, View.OnClickListener {
=======

import com.bumptech.glide.load.engine.Resource;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.controller.Intelligent_Tips_Adapter;
import com.example.c4q.conscious.model.TipsModel;

import java.util.ArrayList;
import java.util.List;


public class IntelligentTipsFragment extends Fragment {
>>>>>>> d5755ec77306de72c46a7361045417cc8454643b


    RecyclerView intelligentTipsRv;

<<<<<<< HEAD
=======
    Context mContext;

>>>>>>> d5755ec77306de72c46a7361045417cc8454643b
    @Override
    public List<?> getAdapterData() {
        return null;
    }

<<<<<<< HEAD
=======
    List<TipsModel> rvData;

>>>>>>> d5755ec77306de72c46a7361045417cc8454643b
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_intelligent_tips, container, false);

        mContext = getContext();
<<<<<<< HEAD
        intelligentTipsRv = root.findViewById(R.id.intelligent_tips_rv);
        challenge_circle = root.findViewById(R.id.circle_image_view);
        Intelligent_Tips_Adapter intelligentTipsAdapter = new Intelligent_Tips_Adapter();
=======
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

>>>>>>> d5755ec77306de72c46a7361045417cc8454643b
        intelligentTipsRv.setAdapter(intelligentTipsAdapter);
        intelligentTipsRv.setLayoutManager(new LinearLayoutManager(getContext()));
<<<<<<< HEAD

        challenge_circle.setOnClickListener(v -> {
            Intent intentToChallenges = new Intent(getActivity(), GrowthChallengeActivity.class);
            startActivity(intentToChallenges);
        });
=======
        // intelligentTipsRv.setLayoutManager(new LinearLayoutManager(getSu));

>>>>>>> d5755ec77306de72c46a7361045417cc8454643b
        return root;
    }

}