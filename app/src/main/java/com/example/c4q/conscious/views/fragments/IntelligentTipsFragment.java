package com.example.c4q.conscious.views.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.controller.IntelligentTipsAdapter;
import com.example.c4q.conscious.intelligencetips.model.TipsModel;
import java.util.ArrayList;
import java.util.List;

public class IntelligentTipsFragment extends Fragment {

    // private
    static RecyclerView intelligentTipsRv;
    static Context mContext;
    static ImageButton enterChallengesButton;
    static List<TipsModel> rvData;
    static CardView typeOfIntelligenceCard;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View root = inflater.inflate(R.layout.fragment_intelligent_tips, container, false);

        mContext = getContext();
        intelligentTipsRv = (RecyclerView) root.findViewById(R.id.intelligent_tips_rv);
        enterChallengesButton = (ImageButton) root.findViewById(R.id.enter_intel_type_button);
        typeOfIntelligenceCard = (CardView) root.findViewById(R.id.card_view_item);

        rvData = new ArrayList<>();

        rvData.add( new TipsModel(getResources().getDrawable(R.drawable.it_body_iv)));
        rvData.add( new TipsModel(getResources().getDrawable(R.drawable.it_existential_iv)));
        rvData.add( new TipsModel(getResources().getDrawable(R.drawable.it_musical_iv)));
        rvData.add( new TipsModel(getResources().getDrawable(R.drawable.it_nature_iv)));
        rvData.add( new TipsModel(getResources().getDrawable(R.drawable.it_math_iv)));
        rvData.add( new TipsModel(getResources().getDrawable(R.drawable.it_people_iv)));
        rvData.add( new TipsModel(getResources().getDrawable(R.drawable.it_spatial_iv)));
        rvData.add( new TipsModel(getResources().getDrawable(R.drawable.it_self_iv)));
        rvData.add( new TipsModel(getResources().getDrawable(R.drawable.it_word_iv)));



        intelligentTipsRv.setLayoutManager( new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL));



        IntelligentTipsAdapter intelligentTipsAdapter = new IntelligentTipsAdapter(mContext, rvData);

        intelligentTipsRv.setAdapter(intelligentTipsAdapter);

      //  intelligentTipsRv.setRecyclerListener( RecyclerView.OnClickListener new);

     /*   enterChallengesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,GrowthChallengeActivity.class);
                intent.putExtra("IntelligenceType", intelligenceType.getText().toString());
                startActivity(intent);
               /* growthChallengeFragment.setArguments(args);

//Inflate the fragment
                getFragmentManager().beginTransaction().add(R.id.container, growthChallengeFragment).commit();
                sendToChallenges = new Intent(mContext, GrowthChallengeActivity.class);
                intelligenceTypePicked2 = intelligenceType.getText().toString();
            }
        }); */

        IntelligentTipsAdapter.SpacesItemDecoration decoration = new IntelligentTipsAdapter.SpacesItemDecoration(16);

        intelligentTipsRv.addItemDecoration(decoration);


                return root;
            }

           // public void itemSelected(){}
}