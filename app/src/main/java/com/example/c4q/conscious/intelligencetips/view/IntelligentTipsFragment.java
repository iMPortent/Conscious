package com.example.c4q.conscious.intelligencetips.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.engage.view.EngageChallengesActivity;
import com.example.c4q.conscious.intelligencetips.model.TipsModel;
import java.util.ArrayList;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;


public class IntelligentTipsFragment extends Fragment {


    RecyclerView intelligentTipsRv;
    Context mContext;
    CircleImageView challenge_circle;

//    @Override
//    public List<?> getAdapterData() {
//        return null;
//    }

    List<TipsModel> rvData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_intelligent_tips, container, false);

        mContext = getContext();
        intelligentTipsRv = root.findViewById(R.id.intelligent_tips_rv);
        challenge_circle = root.findViewById(R.id.circle_image_view);
        intelligentTipsRv = root.findViewById(R.id.intelligent_tips_rv);

//        Intelligent_Tips_Adapter intelligentTipsAdapter = new Intelligent_Tips_Adapter();

        rvData = new ArrayList<>();


        rvData.add(new TipsModel(getString(R.string.body_smart), getString(R.string.body_smart_card_1)));
        rvData.add(new TipsModel(getString(R.string.body_smart), getString(R.string.body_smart_card2)));
        rvData.add(new TipsModel(getString(R.string.body_smart), getString(R.string.body_smart_card3)));
        rvData.add(new TipsModel(getString(R.string.body_smart), getString(R.string.body_smart_card4)));
        rvData.add(new TipsModel(getString(R.string.body_smart), getString(R.string.body_smart_card5)));
        rvData.add(new TipsModel(getString(R.string.body_smart), getString(R.string.body_smart_card6)));
        rvData.add(new TipsModel(getString(R.string.body_smart), getString(R.string.body_smart_card7)));
        rvData.add(new TipsModel(getString(R.string.music_smart), getString(R.string.music_smart_card1)));
        rvData.add(new TipsModel(getString(R.string.music_smart), getString(R.string.music_smart_card2)));
        rvData.add(new TipsModel(getString(R.string.music_smart), getString(R.string.music_smart_card3)));
        rvData.add(new TipsModel(getString(R.string.music_smart), getString(R.string.music_smart_card4)));
        rvData.add(new TipsModel(getString(R.string.music_smart), getString(R.string.music_smart_card5)));
        rvData.add(new TipsModel(getString(R.string.music_smart), getString(R.string.music_smart_card6)));
        rvData.add(new TipsModel(getString(R.string.nature_smart), getString(R.string.nature_smart_card1)));
        rvData.add(new TipsModel(getString(R.string.nature_smart), getString(R.string.nature_smart_card2)));
        rvData.add(new TipsModel(getString(R.string.number_smart), getString(R.string.number_smart_card1)));
        rvData.add(new TipsModel(getString(R.string.number_smart), getString(R.string.number_smart_card2)));
        rvData.add(new TipsModel(getString(R.string.number_smart), getString(R.string.number_smart_card3)));
        rvData.add(new TipsModel(getString(R.string.number_smart), getString(R.string.number_smart_card4)));
        rvData.add(new TipsModel(getString(R.string.number_smart), getString(R.string.number_smart_card5)));
        rvData.add(new TipsModel(getString(R.string.number_smart), getString(R.string.number_smart_card6)));
        rvData.add(new TipsModel(getString(R.string.people_smart), getString(R.string.people_smart_card1)));
        rvData.add(new TipsModel(getString(R.string.people_smart), getString(R.string.people_smart_card2)));
        rvData.add(new TipsModel(getString(R.string.people_smart), getString(R.string.people_smart_card3)));
        rvData.add(new TipsModel(getString(R.string.people_smart), getString(R.string.people_smart_Card4)));
        rvData.add(new TipsModel(getString(R.string.people_smart), getString(R.string.people_smart_card5)));
        rvData.add(new TipsModel(getString(R.string.people_smart), getString(R.string.people_smart_card6)));
        rvData.add(new TipsModel(getString(R.string.people_smart), getString(R.string.people_smart_card7)));
        rvData.add(new TipsModel(getString(R.string.people_smart), getString(R.string.people_smart_card8)));
        rvData.add(new TipsModel(getString(R.string.picture_smart), getString(R.string.picture_smart_card1)));
        rvData.add(new TipsModel(getString(R.string.picture_smart), getString(R.string.picture_smart_card2)));
        rvData.add(new TipsModel(getString(R.string.picture_smart), getString(R.string.picture_smart_card3)));
        rvData.add(new TipsModel(getString(R.string.picture_smart), getString(R.string.picture_smart_card4)));
        rvData.add(new TipsModel(getString(R.string.picture_smart), getString(R.string.picture_smart_card5)));
        rvData.add(new TipsModel(getString(R.string.picture_smart), getString(R.string.picture_smart_card6)));
        rvData.add(new TipsModel(getString(R.string.self_smart), getString(R.string.self_smart_card1)));
        rvData.add(new TipsModel(getString(R.string.self_smart), getString(R.string.self_smart_card2)));
        rvData.add(new TipsModel(getString(R.string.self_smart), getString(R.string.self_smart_card3)));
        rvData.add(new TipsModel(getString(R.string.self_smart), getString(R.string.self_smart_card4)));
        rvData.add(new TipsModel(getString(R.string.self_smart), getString(R.string.self_smart_card5)));
        rvData.add(new TipsModel(getString(R.string.self_smart), getString(R.string.self_smart_card6)));
        rvData.add(new TipsModel(getString(R.string.word_smart), getString(R.string.word_smart_card1)));
        rvData.add(new TipsModel(getString(R.string.word_smart), getString(R.string.word_smart_card2)));
        rvData.add(new TipsModel(getString(R.string.word_smart), getString(R.string.word_smart_card3)));
        rvData.add(new TipsModel(getString(R.string.word_smart), getString(R.string.word_smart_card4)));
        rvData.add(new TipsModel(getString(R.string.word_smart), getString(R.string.word_smart_card5)));
        rvData.add(new TipsModel(getString(R.string.word_smart), getString(R.string.word_smart_card6)));
        rvData.add(new TipsModel(getString(R.string.word_smart), getString(R.string.word_smart_card7)));


//        Intelligent_Tips_Adapter intelligentTipsAdapter = new Intelligent_Tips_Adapter(rvData);
//        intelligentTipsRv.setAdapter(intelligentTipsAdapter);
//        intelligentTipsRv.setLayoutManager(new LinearLayoutManager(getContext()));

        challenge_circle.setOnClickListener(v -> {
            Intent intentToChallenges = new Intent(getActivity(), EngageChallengesActivity.class);
            startActivity(intentToChallenges);
        });
        return root;
    }
}