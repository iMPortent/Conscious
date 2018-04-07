package com.example.c4q.conscious.engage.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.c4q.conscious.R;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class EngageChallengesActivity extends Fragment {

    private RecyclerView recyclerView;
    private List<EngageDataModel> engageDataModel;

    public EngageChallengesActivity() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_engage_challenges, container, false);
        return root;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.challenge_recycler_view);

        recyclerView.setHasFixedSize(true);
        engageDataModel = setData();
        // layout manager:
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        // adapter:
        EngageAdapter adapter = new EngageAdapter(engageDataModel);
        recyclerView.setAdapter(adapter);

    }

    EngageDataModel type1; // body
    EngageDataModel type2; // existential
    EngageDataModel type3; // music
    EngageDataModel type4; // nature
    EngageDataModel type5; // number
    EngageDataModel type6; // picture
    EngageDataModel type7; // people
    EngageDataModel type8; // self
    EngageDataModel type9; // word

    public List<EngageDataModel> setData() {

        List<EngageDataModel> challengeDataList = new ArrayList<>();

        // type 1 : bodily:
        type1 = new EngageDataModel(
                "BODILY/KINESTHETICS",
                "Go outside and run 5 miles",
                1
                );

        // type 2 : Existential
        type2 = new EngageDataModel(
                "EXISTENTIAL",
                "Read Existentialism",
                2
        );

        // type 3 : Musical:
        type3 = new EngageDataModel(
                "MUSICAL/RHYTHMIC",
                "Learn the chords to Jimi Hendrix Waterfalls",
                3
        );

        // type 4 : Naturalist:
        type4 = new EngageDataModel(
                "NATURALIST",
                "Go outside and run 5 miles",
                4
        );

        // type 5 : Logical- Mathematical:
        type5 = new EngageDataModel(
                "MATHEMATICS/LOGICAL",
                "Solve these Japanese Mathematical equations",
                5
        );

        // type 6 : Spatial: picture
        type6 = new EngageDataModel(
                "BODILY/KINESTHETICS",
                "Go outside and run 5 miles",
                6
        );

        // type 7 : Interpersonal - people :
        type7 = new EngageDataModel(
                "INTERPERSONAL",
                "Find yourself immersed in a conversation where you do nothing more than listen",
                7
        );

        // type 8 : Intrapersonal - self :
        type8 = new EngageDataModel(
                "INTRAPERSONAL",
                "Find yourself immersed in a conversation where you do nothing more than speak",
                8
        );

        // type 9 : Linguistic :
        type9 = new EngageDataModel(
                "Linguistic",
                "List a couple phrases in another language",
                9
        );

        challengeDataList.add(type1);
        challengeDataList.add(type2);
        challengeDataList.add(type3);
        challengeDataList.add(type4);
        challengeDataList.add(type5);
        challengeDataList.add(type6);
        challengeDataList.add(type7);
        challengeDataList.add(type8);
        challengeDataList.add(type9);


        return challengeDataList;

    }

    public void whenChallengeClicked(){

    }


}
