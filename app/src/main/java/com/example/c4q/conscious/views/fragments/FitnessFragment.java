package com.example.c4q.conscious.views.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.controller.FitnessSuggestionAdapter;

/**
 * Created by c4q on 3/27/18.
 */

public class FitnessFragment extends Fragment {

    RecyclerView fitnessSugg;
    FitnessSuggestionAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fitness_fragment_layout, container, false);
        init(view);

        return view;
    }

    public void init(View view){
        fitnessSugg = view.findViewById(R.id.recycler_fit_suggestions);
        fitnessSugg.setLayoutManager(new LinearLayoutManager(getContext()));
        fitnessSugg.setAdapter(adapter);
    }



}
