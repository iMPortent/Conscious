package com.example.c4q.conscious.views.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.backend.HomeIntelligentAdapter;
import com.example.c4q.conscious.model.IntelligenceTypeModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c4q on 4/1/18.
 */

public class HomeFragment extends Fragment {

    // private fields:
    private Context context;
    private RecyclerView homeIntelligentRV;
    private List<IntelligenceTypeModel> intelligenceTypeModelArrayList;

    /**
     * oncreate:
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    } // ends onCreateView

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // recycler view:
        homeIntelligentRV = (RecyclerView) view.findViewById(R.id.home_intelligent_rv);
        homeIntelligentRV.setHasFixedSize(true);
        intelligenceTypeModelArrayList = initializeData();
        // layout manager:
        homeIntelligentRV.setLayoutManager(new LinearLayoutManager(getActivity()));
        // adapter:
        HomeIntelligentAdapter adapter = new HomeIntelligentAdapter(intelligenceTypeModelArrayList, getContext());
        homeIntelligentRV.setAdapter(adapter); // pass adapter to r.v
    }

    /**
     * this sets up the data based on the strings:
     */
    public List<IntelligenceTypeModel> initializeData() {


        List<IntelligenceTypeModel> list = new ArrayList<>();

        IntelligenceTypeModel music = new IntelligenceTypeModel(
                R.string.music_smart,
                R.drawable.add_icon_it,
                R.string.music_smart_description);


        list.add(music);
        return list;
    }
} // ends HomeFragment.java
