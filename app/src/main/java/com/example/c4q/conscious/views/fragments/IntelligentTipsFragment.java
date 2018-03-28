package com.example.c4q.conscious.views.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.intelligent_tips_adapters.BodySmartAdapter;
import com.example.c4q.conscious.intelligent_tips_adapters.MusicSmartAdapter;
import com.example.c4q.conscious.intelligent_tips_adapters.NatureSmartAdapter;
import com.example.c4q.conscious.intelligent_tips_adapters.NumberSmartAdapter;
import com.example.c4q.conscious.intelligent_tips_adapters.PeopleSmartAdapter;
import com.example.c4q.conscious.intelligent_tips_adapters.PictureSmartAdapter;
import com.example.c4q.conscious.intelligent_tips_adapters.SelfSmartAdapter;
import com.example.c4q.conscious.intelligent_tips_adapters.WordSmartAdapter;

public class IntelligentTipsFragment extends Fragment {


    RecyclerView bodySmartRv;
    RecyclerView musicSmartRv;
    RecyclerView natureSmartRv;
    RecyclerView numberSmartRv;
    RecyclerView peopleSmartRv;
    RecyclerView pictureSmartRv;
    RecyclerView selfSmartRv;
    RecyclerView wordSmartRv;
    Context mContext;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_goodie_bag, container, false);

        mContext = getContext();

        bodySmartRv = (RecyclerView) root.findViewById(R.id.body_smart_rv);
        musicSmartRv = (RecyclerView) root.findViewById(R.id.music_smart_rv);
        natureSmartRv = (RecyclerView) root.findViewById(R.id.nature_smart_rv);
        numberSmartRv = (RecyclerView) root.findViewById(R.id.number_smart_rv);
        peopleSmartRv = (RecyclerView) root.findViewById(R.id.people_smart_rv);
        pictureSmartRv = (RecyclerView) root.findViewById(R.id.picture_smart_rv);
        selfSmartRv = (RecyclerView) root.findViewById(R.id.self_smart_rv);
        wordSmartRv = (RecyclerView) root.findViewById(R.id.word_smart_rv);

        BodySmartAdapter bodySmartAdapter = new BodySmartAdapter();
        MusicSmartAdapter musicSmartAdapter = new MusicSmartAdapter();
        NatureSmartAdapter natureSmartAdapter = new NatureSmartAdapter();
        NumberSmartAdapter numberSmartAdapter = new NumberSmartAdapter();
        PeopleSmartAdapter peopleSmartAdapter = new PeopleSmartAdapter();
        PictureSmartAdapter pictureSmartAdapter = new PictureSmartAdapter();
        SelfSmartAdapter selfSmartAdapter = new SelfSmartAdapter();
        WordSmartAdapter wordSmartAdapter = new WordSmartAdapter();

        bodySmartRv.setAdapter(bodySmartAdapter);
        musicSmartRv.setAdapter(musicSmartAdapter);
        natureSmartRv.setAdapter(natureSmartAdapter);
        numberSmartRv.setAdapter(numberSmartAdapter);
        peopleSmartRv.setAdapter(peopleSmartAdapter);
        pictureSmartRv.setAdapter(pictureSmartAdapter);
        selfSmartRv.setAdapter(selfSmartAdapter);
        wordSmartRv.setAdapter(wordSmartAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);

        bodySmartRv.setLayoutManager(linearLayoutManager);
        musicSmartRv.setLayoutManager(linearLayoutManager);
        natureSmartRv.setLayoutManager(linearLayoutManager);
        numberSmartRv.setLayoutManager(linearLayoutManager);
        peopleSmartRv.setLayoutManager(linearLayoutManager);
        pictureSmartRv.setLayoutManager(linearLayoutManager);
        selfSmartRv.setLayoutManager(linearLayoutManager);
        wordSmartRv.setLayoutManager(linearLayoutManager);

        return root;
    }
}