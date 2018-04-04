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
     * create intelligence objects:
     */
    IntelligenceTypeModel type1; // body
    IntelligenceTypeModel type2; // existential
    IntelligenceTypeModel type3; // music
    IntelligenceTypeModel type4; // nature
    IntelligenceTypeModel type5; // number
    IntelligenceTypeModel type6; // picture
    IntelligenceTypeModel type7; // people
    IntelligenceTypeModel type8; // self
    IntelligenceTypeModel type9; // word


    /**
     * this sets up the data based on the strings:
     */
    public List<IntelligenceTypeModel> initializeData() {

        // list of objects:
        List<IntelligenceTypeModel> intelligence_type_list = new ArrayList<>();

        // type 1 : bodily:
        type1 = new IntelligenceTypeModel(
                R.string.body_smart_title_txt,
                R.drawable.it_nature_iv,
                R.string.body_smart_description);

        // type 2 : Existential
        type2 = new IntelligenceTypeModel(
                R.string.music_smart_title_txt,
                R.drawable.it_nature_iv,
                R.string.music_smart_description);

        // type 3 : Musical:
        type3 = new IntelligenceTypeModel(
                R.string.nature_smart_title_txt,
                R.drawable.it_nature_iv,
                R.string.nature_smart_description);

        // type 4 : Naturalist:
        type4 = new IntelligenceTypeModel(
                R.string.number_smart_title_txt,
                R.drawable.it_nature_iv,
                R.string.number_smart_description);

        // type 5 : Logical- Mathematical:
        type5 = new IntelligenceTypeModel(
                R.string.people_smart_title_txt,
                R.drawable.it_nature_iv,
                R.string.people_smart_description);

        // type 6 : Spatial: picture
        type6 = new IntelligenceTypeModel(
                R.string.picture_smart_title_txt,
                R.drawable.it_nature_iv,
                R.string.picture_smart_description);

        // type 7 : Interpersonal - people :
        type7 = new IntelligenceTypeModel(
                R.string.self_smart_title_txt,
                R.drawable.it_nature_iv,
                R.string.self_smart_description);

        // type 8 : Intrapersonal - self :
        type8 = new IntelligenceTypeModel(
                R.string.word_smart_title_txt,
                R.drawable.it_nature_iv,
                R.string.word_smart_description);

        // type 9 : Linguistic :
        type9 = new IntelligenceTypeModel(
                R.string.existential_title_txt,
                R.drawable.it_nature_iv,
                R.string.existential_smart_description);

        // add objects to recycler view:
        intelligence_type_list.add(type1);
        intelligence_type_list.add(type2);
        intelligence_type_list.add(type3);
        intelligence_type_list.add(type4);
        intelligence_type_list.add(type5);
        intelligence_type_list.add(type6);
        intelligence_type_list.add(type7);
        intelligence_type_list.add(type8);
        intelligence_type_list.add(type9);


        return intelligence_type_list;
    }
} // ends HomeFragment.java
