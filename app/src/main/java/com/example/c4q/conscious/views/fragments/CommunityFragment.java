package com.example.c4q.conscious.views.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.controller.CommunityAdapter;
import com.example.c4q.conscious.model.Events;
import com.example.c4q.conscious.model.EventsModel;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CommunityFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    public static CommunityFragment newInstance(int page, String title) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        CommunityFragment fragment = new CommunityFragment();
        args.putString("someTitle", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.community_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.community_recycler_view);
        return view;

    }
}
