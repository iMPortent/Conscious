package com.example.c4q.conscious.home.controller;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.home.model.IntelligenceTypeModel;

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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.intelligent_type_cv, parent, false);

        IntelligentTypeViewHolder ITviewHolder = new IntelligentTypeViewHolder(view);

        return ITviewHolder;


    } // ends oncreateViewHolder

    /**
     * replace the contents of a view:
     */
    @Override
    public void onBindViewHolder(HomeIntelligentAdapter.IntelligentTypeViewHolder holder, int position) {

        // set the name and the photo
        holder.intelligentTypeName.setText(intelligenceTypeList.get(position).getName());
        holder.intelligentTypePhoto.setBackgroundResource(intelligenceTypeList.get(position).getPhotoID());

        // set a click listener:
        holder.setClickListener(new ITClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {

                if (isLongClick) {

                    // make a toast ( long click )  : but alter set dialog fragment here:
                    Toast.makeText(context, "" + position + "" + intelligenceTypeList.get(position) + "long click", Toast.LENGTH_SHORT).show();

                } else {
                    // make a toast : but alter set dialog fragment here:
                    Toast.makeText(context, "" + position + "" + intelligenceTypeList.get(position) , Toast.LENGTH_SHORT).show();

                }
            } // ends inner click listner onclick()
        }); // ends holder.setClickListner
    } // ends onBindViewHolder

    @Override
    public int getItemCount() {
        return intelligenceTypeList.size();
    }

    // ViewHolder:
    public class IntelligentTypeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        // fields of views:
        View intelligentContainer; // for the container of the view holder
        TextView intelligentTypeName;
        ImageView intelligentTypePhoto;
        Button intelligentMore_btn;
        ITClickListener itemClickListener; // watches for item clicks for alert dialog

        // click listener:
        private AdapterView.OnItemClickListener clickListener;

        // intelligent type constructor:
        public IntelligentTypeViewHolder(View itemView) {
            super(itemView);

            intelligentTypeName = (TextView) itemView.findViewById(R.id.it_type_title);
            //intelligentTypeDescription = (TextView)itemView.findViewById(R.id.it_type_description);
            intelligentTypePhoto = (ImageView) itemView.findViewById(R.id.it_type_iv);
            intelligentMore_btn = itemView.findViewById(R.id.it_more_btn);
            intelligentContainer = itemView.findViewById(R.id.intelligent_type_cv); // references the card view parent

            itemView.setTag(itemView);
            intelligentMore_btn.setOnClickListener(this::onClick);
            intelligentMore_btn.setOnLongClickListener(this::onLongClick);

            setUpMoreButton(); // set on onclick listner
        }

        // setClickListener:
        public void setClickListener(ITClickListener itemClick) {
            this.itemClickListener = itemClick;

        }


        @Override
        public void onClick(View view) {
            itemClickListener.onClick(view, getAdapterPosition(), false);

        }

        @Override
        public boolean onLongClick(View view) {
            itemClickListener.onClick(view, getAdapterPosition(), true);
            return true;
        }

        public void setUpMoreButton(){
            intelligentMore_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    // custom dialog
                    final Dialog dialog = new Dialog(context);
                    dialog.setContentView(R.layout.intelligent_type_alert_dialog);
                    Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);

                    // if button is clicked, close the custom dialog
                    dialogButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                            Toast.makeText(v.getContext(),"Dismissed..!!",Toast.LENGTH_SHORT).show();
                        }
                    });
                    dialog.show();
                }
            });
        }
    } // ends intelligent type view holder :


    /**
     * create custom viewholder interface onclick listener
     */
    public interface ITClickListener {

        // abstract method:
        void onClick(View view, int position, boolean isLongClick);

    }

    /**
     * implement alert dialog
     */


} // ends homeintelligentadapter

