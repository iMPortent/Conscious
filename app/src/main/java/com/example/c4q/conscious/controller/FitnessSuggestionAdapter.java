package com.example.c4q.conscious.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.c4q.conscious.R;

import java.util.List;

/**
 * Created by c4q on 3/28/18.
 */

public class FitnessSuggestionAdapter extends RecyclerView.Adapter<FitnessSuggestionAdapter.FitnessSuggestionHolder> {

    List<String>suggestions;

    public FitnessSuggestionAdapter(List<String>suggestions){
        this.suggestions = suggestions;
    }

    @Override
    public FitnessSuggestionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_fitness, parent, false);
        return new FitnessSuggestionHolder(view);
    }

    @Override
    public void onBindViewHolder(FitnessSuggestionHolder holder, int position) {
        holder.bind(suggestions.get(position));
    }

    @Override
    public int getItemCount() {
        return suggestions.size();
    }

    protected class FitnessSuggestionHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public FitnessSuggestionHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_fitness_suggestion);
        }

        public void bind(String suggestion){
            textView.setText(suggestion);
        }
    }
}
