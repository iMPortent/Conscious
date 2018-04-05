package com.example.c4q.conscious.smart.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.smart.controller.GoalAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SmartFragment extends Fragment implements View.OnClickListener {

    EditText firstGoal, secondGoal, thirdGoal;
    Button submitFirst, submitSecond, submitThird;
    RecyclerView goalRecycler;
    List<String> smartGoals;
    GoalAdapter adapter;


    public SmartFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_smart, container, false);

        initViews(view);
        init();
        return view;
    }

    public void initViews(View view){
        firstGoal = view.findViewById(R.id.goal_one);
        submitFirst = view.findViewById(R.id.button_submit_one);
        submitFirst.setOnClickListener(this);
        secondGoal = view.findViewById(R.id.goal_two);
        submitSecond = view.findViewById(R.id.button_submit_two);
        submitSecond.setOnClickListener(this);
        thirdGoal = view.findViewById(R.id.goal_three);
        submitThird = view.findViewById(R.id.button_submit_three);
        submitThird.setOnClickListener(this);
        goalRecycler = view.findViewById(R.id.recycler_smart);

    }

    public void init(){
        smartGoals = new ArrayList<>();
        adapter = new GoalAdapter(smartGoals);
        goalRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        goalRecycler.setAdapter(adapter);
    }

    public void addGoal(EditText goal){
        smartGoals.add(goal.getText().toString());
        adapter.update();
    }

    public void viewsGone(EditText goalField, Button goalSubmit){
        goalField.setVisibility(View.GONE);
        goalSubmit.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_submit_one:
                addGoal(firstGoal);
                viewsGone(firstGoal,submitFirst);
                break;

            case R.id.button_submit_two:
                addGoal(secondGoal);
                viewsGone(secondGoal,submitSecond);
                break;

            case R.id.button_submit_three:
                addGoal(thirdGoal);
                viewsGone(thirdGoal,submitThird);
                break;

            default:
                break;
        }
    }
}
