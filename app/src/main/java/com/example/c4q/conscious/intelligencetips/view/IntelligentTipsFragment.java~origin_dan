package com.example.c4q.conscious.intelligencetips.view;

import android.drm.DrmRights;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.controller.IntelligentTipsAdapter;
import com.example.c4q.conscious.intelligencetips.model.TipsModel;
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

        rvData.add( new TipsModel(getString(R.string.body_smart),getResources().getDrawable(R.drawable.it_body_iv)));
        rvData.add( new TipsModel(getString(R.string.music_smart),getResources().getDrawable(R.drawable.it_musical_iv)));
        rvData.add( new TipsModel(getString(R.string.nature_smart),getResources().getDrawable(R.drawable.it_nature_iv)));
        rvData.add( new TipsModel(getString(R.string.number_smart),getResources().getDrawable(R.drawable.it_math_iv)));
        rvData.add( new TipsModel(getString(R.string.people_smart),getResources().getDrawable(R.drawable.it_people_iv)));
        rvData.add( new TipsModel(getString(R.string.picture_smart),getResources().getDrawable(R.drawable.it_spatial_iv)));
        rvData.add( new TipsModel(getString(R.string.self_smart),getResources().getDrawable(R.drawable.it_self_iv)));
        rvData.add( new TipsModel(getString(R.string.word_smart),getResources().getDrawable(R.drawable.it_word_iv)));

        IntelligentTipsAdapter intelligentTipsAdapter = new IntelligentTipsAdapter(rvData);
        intelligentTipsRv.setAdapter(intelligentTipsAdapter);
        intelligentTipsRv.setLayoutManager(new StaggeredGridLayoutManager(3, LinearLayoutManager.HORIZONTAL));

        return root;
    }
}