package com.example.c4q.conscious.views.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.c4q.conscious.backend.RetrofitFactory;
import com.example.c4q.conscious.controller.InterpersonalAdapter;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.model.Contents;
import com.example.c4q.conscious.model.QODResponse;
import com.example.c4q.conscious.model.Quote;
import java.util.List;

/**
 * Created by c4q on 3/27/18.
 */

public class InterpersonalFragment extends Fragment {
    RecyclerView suggestionList;
    InterpersonalAdapter adapter;
    RetrofitFactory.QuotesApiListener quotesApiListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.interpersonal_fragment_layout, container, false);
        initObjects();
        initViews(view);
        return view;
    }

    public void initObjects(){
        getQuotes("art");
    }

    public void initViews(View view){
        suggestionList = view.findViewById(R.id.recycler_ip_suggestions);
        suggestionList.setLayoutManager(new LinearLayoutManager(getContext()));
        suggestionList.setAdapter(adapter);
    }

    public void getQuotes(String category){

        quotesApiListener = new RetrofitFactory.QuotesApiListener() {

            @Override
            public void quotesCallback(QODResponse response) {
                List<Quote>quotes;
                Contents contents = response.getContents();
                quotes = contents.getQuotes();
                adapter = new InterpersonalAdapter(quotes);
            }
        };


        RetrofitFactory.getInstance().setQuotesApiListener(quotesApiListener);
        RetrofitFactory.getInstance().getCategories(category);

    }
}
