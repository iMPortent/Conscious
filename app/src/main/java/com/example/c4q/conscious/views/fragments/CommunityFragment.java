package com.example.c4q.conscious.views.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.c4q.conscious.R;


public class CommunityFragment extends Fragment {

    private String title;
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static CommunityFragment newInstance(int page, String title) {
        CommunityFragment fragmentFirst = new CommunityFragment();
        Bundle args = new Bundle();
        args.putInt("pageNum", page);
        args.putString("Engage", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("pageNum", 1);
        title = getArguments().getString("Engage");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.community_fragment, container, false);
        return view;
    }
}
