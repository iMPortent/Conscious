package com.example.c4q.conscious.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.model.Quote;

import java.util.List;

/**
 * Created by c4q on 3/28/18.
 */

public class InterpersonalAdapter extends RecyclerView.Adapter<InterpersonalAdapter.InterpersonalHolder> {

    List<Quote>interpersonalList;

    public InterpersonalAdapter(List<Quote>interpersonalList){
        this.interpersonalList = interpersonalList;
    }

    @Override
    public InterpersonalHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_interpersonal, parent, false);
        return new InterpersonalHolder(view);
    }

    @Override
    public void onBindViewHolder(InterpersonalHolder holder, int position) {
        holder.bind(interpersonalList.get(position));
    }

    @Override
    public int getItemCount() {
        return interpersonalList.size();
    }

    protected class InterpersonalHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public InterpersonalHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
        }

        public void bind(Quote quote){
            textView.setText(quote.getQuote());
        }
    }
}
