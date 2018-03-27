package com.example.c4q.conscious.views.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.conscious.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GoodieBagFragment extends Fragment {

    RecyclerView bodySmart;
    RecyclerView musicSmart;
    RecyclerView natureSmart;
    RecyclerView numberSmart;
    RecyclerView peopleSmart;
    RecyclerView pictureSmart;
    RecyclerView selfSmart;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_goodie_bag, container, false);

        bodySmart = root.findViewById(R.id.body_smart_rv);
        musicSmart = root.findViewById(R.id.music_smart_rv);
        natureSmart = root.findViewById(R.id.nature_smart_rv);
        numberSmart = root.findViewById(R.id.number_smart_rv);
        peopleSmart = root.findViewById(R.id.people_smart_rv);
        pictureSmart = root.findViewById(R.id.picture_smart_rv);
        selfSmart = root.findViewById(R.id.self_smart_rv);


        return root;
    }

}
