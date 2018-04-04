package com.example.c4q.conscious.views.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.brandongogetap.stickyheaders.StickyLayoutManager;
import com.brandongogetap.stickyheaders.exposed.StickyHeader;
import com.brandongogetap.stickyheaders.exposed.StickyHeaderHandler;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.controller.Intelligent_Tips_Adapter;

import java.util.List;

import static java.lang.Math.E;

public class IntelligentTipsFragment extends Fragment implements StickyHeaderHandler{


    RecyclerView intelligentTipsRv;

    Context mContext;

    @Override
    public List<?> getAdapterData() {
        return null;
    }


    @Nullable
    @Override
     public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_intelligent_tips, container, false);

        mContext = getContext();
        intelligentTipsRv = (RecyclerView) root.findViewById(R.id.intelligent_tips_rv);

        Intelligent_Tips_Adapter intelligentTipsAdapter = new Intelligent_Tips_Adapter();

        intelligentTipsRv.setAdapter(intelligentTipsAdapter);

        // intelligentTipsRv.setLayoutManager(new LinearLayoutManager(getSu));
        intelligentTipsRv.setLayoutManager(new LinearLayoutManager(getContext()));

        return root;
    }

}