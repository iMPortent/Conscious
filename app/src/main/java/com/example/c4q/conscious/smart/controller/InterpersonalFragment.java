package com.example.c4q.conscious.smart.controller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.c4q.conscious.smart.controller.InterpersonalAdapter;
import com.example.c4q.conscious.smart.model.Contents;
import com.example.c4q.conscious.smart.model.QODResponse;
import com.example.c4q.conscious.smart.model.Quote;
import com.example.c4q.conscious.utility.RetrofitFactory;
import com.example.c4q.conscious.R;

import java.util.List;

/**
 * Created by c4q on 3/27/18.
 */

public class InterpersonalFragment extends Fragment {
    RecyclerView suggestionList;
    InterpersonalAdapter adapter;
    RetrofitFactory.QuotesApiListener quotesApiListener;
    TextView quote;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.interpersonal_fragment_layout, container, false);
        initViews(view);
        initObjects();
        return view;
    }

    public void initObjects(){
        getQuotes("art");
    }

    public void initViews(View view){
        quote = view.findViewById(R.id.text_quote);
    }

    public void getQuotes(String category){

        quotesApiListener = new RetrofitFactory.QuotesApiListener() {

            @Override
            public void quotesCallback(QODResponse response) {
                List<Quote>quotes;
                Contents contents = response.getContents();
                quotes = contents.getQuotes();
                quote.setText(quotes.get(0).getQuote());
            }
        };


        RetrofitFactory.getInstance().setQuotesApiListener(quotesApiListener);
        RetrofitFactory.getInstance().getCategories(category);

    }
}
