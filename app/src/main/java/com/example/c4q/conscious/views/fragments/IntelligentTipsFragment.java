package com.example.c4q.conscious.views.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.brandongogetap.stickyheaders.exposed.StickyHeaderHandler;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.controller.Intelligent_Tips_Adapter;
import com.example.c4q.conscious.views.activities.GrowthChallengeActivity;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;


public class IntelligentTipsFragment extends Fragment implements StickyHeaderHandler, View.OnClickListener {


    RecyclerView intelligentTipsRv;
    CircleImageView challenge_circle;
    Context mContext;

    @Override
    public List<?> getAdapterData() {
        return null;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_intelligent_tips, container, false);

        mContext = getContext();
        intelligentTipsRv = root.findViewById(R.id.intelligent_tips_rv);
        challenge_circle = root.findViewById(R.id.circle_image_view);
        Intelligent_Tips_Adapter intelligentTipsAdapter = new Intelligent_Tips_Adapter();
        intelligentTipsRv.setAdapter(intelligentTipsAdapter);
        intelligentTipsRv.setLayoutManager(new LinearLayoutManager(getContext()));

        challenge_circle.setOnClickListener(v -> {
            Intent intentToChallenges = new Intent(getActivity(), GrowthChallengeActivity.class);
            startActivity(intentToChallenges);
        });
        return root;
    }

    @Override
    public void onClick(View v) {
        //When the fragment is clicked
    }
}