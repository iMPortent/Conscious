package com.example.c4q.conscious.backend;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.model.IntelligenceTypeModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NiemaWidaha on 4/2/18.
 */

/**
 * inflate your model layout here:
 */
public class HomeIntelligentAdapter extends RecyclerView.Adapter<HomeIntelligentAdapter.IntelligentTypeViewHolder> {

    // private fields:
    private Context context;
    private List<IntelligenceTypeModel> intelligenceTypeList; // holds the intelligence type


    // default constructor to pass 2 super
    public HomeIntelligentAdapter(List<IntelligenceTypeModel> intelligenceTypeList, Context c) {

        this.intelligenceTypeList = intelligenceTypeList;
        this.context = c;

    } // ends constructor

    // create new views:
    @Override
    public HomeIntelligentAdapter.IntelligentTypeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // create a new view:
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.it_type_cv,parent,false);

        IntelligentTypeViewHolder ITviewHolder = new IntelligentTypeViewHolder(view);

        return ITviewHolder;


    } // ends oncreateViewHolder

    /**
     * replace the contents of a view:
     */
    @Override
    public void onBindViewHolder(HomeIntelligentAdapter.IntelligentTypeViewHolder holder, int position) {

        holder.intelligentTypeName.setText(intelligenceTypeList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return intelligenceTypeList.size();
    }

    // ViewHolder:
    public class IntelligentTypeViewHolder extends RecyclerView.ViewHolder {

        // fields of views:
        TextView intelligentTypeName;
        TextView intelligentTypeDescription;
        ImageView intelligentTypePhoto;


        public IntelligentTypeViewHolder(View itemView){
            super(itemView);

            intelligentTypeName = (TextView)itemView.findViewById(R.id.it_type_title);
            intelligentTypeDescription = (TextView)itemView.findViewById(R.id.it_type_description);
            intelligentTypePhoto = (ImageView) itemView.findViewById(R.id.it_type_photo);

        }

    }
} // ends homeintelligentadapter

