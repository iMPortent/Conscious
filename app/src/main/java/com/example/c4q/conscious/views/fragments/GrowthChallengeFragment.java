package com.example.c4q.conscious.views.fragments;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.c4q.conscious.ChallengeDataSource;
import com.example.c4q.conscious.ChallengeDetailActivity;
import com.example.c4q.conscious.GrowthChallengeController;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.ViewInterface;
import com.example.c4q.conscious.model.Challenges;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.example.c4q.conscious.views.activities.MainActivity.intelligenceTypePicked2;

/**
 * Created by c4q on 4/1/18.
 */

/*
public class GrowthChallengeActivity extends Fragment implements ViewInterface, View.OnClickListener{

    private static final String EXTRA_DATE_AND_TIME = "EXTRA_DATE_AND_TIME";
    private static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";
    private static final String EXTRA_DRAWABLE = "EXTRA_DRAWABLE";
    private List<Challenges> listOfData;
    private LayoutInflater layoutInflater;
    private RecyclerView recyclerView;
    private com.example.c4q.conscious.views.activities.GrowthChallengeActivity.GrowthChallengeAdapter growthChallengeAdapter;
    private GrowthChallengeController growthChallengeController;
//    private Toolbar toolbar;

    String intelligenceTypePicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_growth_challenge);

        recyclerView = findViewById(R.id.rec_list_activity);
        layoutInflater = getLayoutInflater();
        intelligenceTypePicked = getArguments().getString("YourKey");
//        toolbar = findViewById(R.id.tlb_list_activity);
//        toolbar.setTitle(R.string.title_toolbar);
//        toolbar.setLogo(R.drawable.list_icon);
//        toolbar.setTitleMarginStart(72);

        FloatingActionButton fabulous = findViewById(R.id.fab_create_new_item);
        fabulous.setOnClickListener(this);

        growthChallengeController = new GrowthChallengeController(this, new ChallengeDataSource());
    }

    @Override
    public void startChallengeDetailActivity(String dateAndTime, String message, int colorResource, View viewRoot) {
        Intent i = new Intent(this, ChallengeDetailActivity.class);
        i.putExtra(EXTRA_DATE_AND_TIME, dateAndTime);
        i.putExtra(EXTRA_MESSAGE, message);
        i.putExtra(EXTRA_DRAWABLE, colorResource);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setEnterTransition(new android.transition.Fade(android.transition.Fade.IN));
            getWindow().setEnterTransition(new android.transition.Fade(android.transition.Fade.OUT));

            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this,
                    new android.util.Pair<>(viewRoot.findViewById(R.id.circle_image_view),
                            getString(R.string.transition_drawable)
                    ));

            startActivity(i, options.toBundle());


        } else {
            startActivity(i);
        }
    }

    @Override
    public void setUpAdapterAndView(List<Challenges> listOfData) {
        this.listOfData = listOfData;
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        growthChallengeAdapter = new com.example.c4q.conscious.views.activities.GrowthChallengeActivity.GrowthChallengeAdapter();
        recyclerView.setAdapter(growthChallengeAdapter);

        DividerItemDecoration itemDecoration = new DividerItemDecoration(
                recyclerView.getContext(),
                layoutManager.getOrientation()
        );

        itemDecoration.setDrawable(
                ContextCompat.getDrawable(
                        this,
                        R.drawable.divider_white
                )
        );

        recyclerView.addItemDecoration(
                itemDecoration
        );

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(createHelperCallback());
        itemTouchHelper.attachToRecyclerView(recyclerView);


    }

    @Override
    public void addNewChallengeToView(Challenges newItem) {

    }

    @Override
    public void deleteChallengeAt(int position) {

    }

    @Override
    public void showUndoSnackbar() {
        Snackbar.make(
                findViewById(R.id.root_main_activity),
                getString(R.string.action_delete_item),
                Snackbar.LENGTH_LONG
        )
                .setAction(R.string.action_undo, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        growthChallengeController.onUndoConfirmed();
                    }
                })
                .addCallback(new BaseTransientBottomBar.BaseCallback<Snackbar>() {
                    @Override
                    public void onDismissed(Snackbar transientBottomBar, int event) {
                        super.onDismissed(transientBottomBar, event);

                        growthChallengeController.onSnackbarTimeout();
                    }
                })
                .show();
    }

    @Override
    public void insertChallengeAt(int temporaryListItemPosition, Challenges temporaryListItem) {

    }


    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if (viewId == R.id.fab_create_new_item) {
            growthChallengeController.createNewChallenge();
        }
    }

    private class GrowthChallengeAdapter extends RecyclerView.Adapter<com.example.c4q.conscious.views.activities.GrowthChallengeActivity.GrowthChallengeAdapter.GrowthChallengeViewholder> {//6

        @Override
        public com.example.c4q.conscious.views.activities.GrowthChallengeActivity.GrowthChallengeAdapter.GrowthChallengeViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = layoutInflater.inflate(R.layout.community_item_view, parent, false);
            return new com.example.c4q.conscious.views.activities.GrowthChallengeActivity.GrowthChallengeAdapter.GrowthChallengeViewholder(v);
        }

        @Override
        public void onBindViewHolder(com.example.c4q.conscious.views.activities.GrowthChallengeActivity.GrowthChallengeAdapter.GrowthChallengeViewholder holder, int position) {
            //11. and now the ViewHolder data
            Challenges currentItem = listOfData.get(position);

            holder.coloredCircle.setImageResource(
                    currentItem.getColorResource()
            );

            holder.message.setText(
                    currentItem.getMessage()
            );

            holder.dateAndTime.setText(
                    currentItem.getDateAndTime()
            );

            holder.loading.setVisibility(View.INVISIBLE);
        }

        @Override
        public int getItemCount() {
            return listOfData.size();
        }

        class GrowthChallengeViewholder extends RecyclerView.ViewHolder implements View.OnClickListener {

            private CircleImageView coloredCircle;
            private TextView dateAndTime;
            private TextView message;
            private ViewGroup container;
            private ProgressBar loading;

            public GrowthChallengeViewholder(View itemView) {
                super(itemView);
                this.coloredCircle = itemView.findViewById(R.id.circle_image_view);
                this.dateAndTime = itemView.findViewById(R.id.challenge_name_tv);
                this.message = itemView.findViewById(R.id.challenge_tv);
                this.container = itemView.findViewById(R.id.root_main_item);
                this.container.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
                Challenges listItem = listOfData.get(
                        this.getAdapterPosition()
                );

                growthChallengeController.onChallengeClick(
                        listItem,
                        v
                );

            }
        }
    }

    private ItemTouchHelper.Callback createHelperCallback() {

        ItemTouchHelper.SimpleCallback simpleItemTouchCallback = new ItemTouchHelper.SimpleCallback(
                0,
                ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {


            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder,
                                  RecyclerView.ViewHolder target) {
                return false;
            }


            @Override
            public void onSwiped(final RecyclerView.ViewHolder viewHolder, int swipeDir) {
                int position = viewHolder.getAdapterPosition();
                growthChallengeController.onChallengeSwiped(
                        position,
                        listOfData.get(position)
                );
            }
        };

        return simpleItemTouchCallback;
    }

}
*/
