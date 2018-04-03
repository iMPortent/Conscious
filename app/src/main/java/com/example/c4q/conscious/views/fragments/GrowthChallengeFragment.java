package com.example.c4q.conscious.views.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.conscious.R;

import static com.example.c4q.conscious.views.activities.MainActivity.intelligenceTypePicked2;

/**
 * Created by c4q on 4/1/18.
 */

public class GrowthChallengeFragment extends Fragment {

    String intelligenceTypePicked;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.growth_challenges_frag, container, false);

        intelligenceTypePicked = getArguments().getString("YourKey");





        return root;
    }
}
