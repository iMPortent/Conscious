package com.example.c4q.conscious.uv;

import android.content.Intent;
import android.content.res.Resources;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.eftimoff.viewpagertransformers.DrawFromBackTransformer;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.engage.view.ChallengeDetailActivity;
import com.example.c4q.conscious.engage.view.EngageChallengesActivity;
import com.example.c4q.conscious.engage.view.EngageFragment;
import com.example.c4q.conscious.home.views.HomeFragment;
import com.example.c4q.conscious.intelligencetips.view.IntelligentTipsFragment;
import com.example.c4q.conscious.smart.controller.InterpersonalFragment;
import com.example.c4q.conscious.smart.view.SmartFragment;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends FragmentActivity {

    private static final String TAG = "MainActivity";
    FragmentPagerAdapter adapterViewPager;
    FirebaseDatabase database;
    DatabaseReference myRef;
    TabLayout vPagerIcons;
    ViewPager viewPager;

    private int[] tabIcons; // holds drawable images for the tab photos
    private int[] tabText; // holds drawable txt for the tab text



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ran before frag");

        viewPager = findViewById(R.id.vpPager);
        adapterViewPager = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);
        viewPager.setPageTransformer(true, new DrawFromBackTransformer());

        vPagerIcons = findViewById(R.id.pager_header);
        vPagerIcons.setupWithViewPager(viewPager);


        // tab icon resources
        tabIcons = new int[]{
                R.drawable.ic_extension_black_24dp,
                R.drawable.ic_home_black_24dp,
                R.drawable.ic_play_arrow_black_24dp,
                R.drawable.ic_arrow_upward_black_24dp,
                R.drawable.ic_arrow_upward_black_24dp,
        };

        // tab text resources
        tabText = new int[]{
                R.string.tab_1_txt,
                R.string.tab_2_txt,
                R.string.tab_3_txt,
                R.string.tab_4_txt,
                R.string.tab_4_txt,
        };


        setupTabIcons();

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("message");
        myRef.setValue("Hey");

    }

    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }


    private void setupTabIcons() {
        for (int i = 0; i < vPagerIcons.getTabCount(); i++) {
            Log.d(TAG, "setupTabIcons: " + vPagerIcons.getTabCount());
            TabLayout.Tab tab = vPagerIcons.getTabAt(i);
            if (tab != null) {
                try {

                    // adds the icon + text to the tab:
                    tab.setText(tabIcons[i]);
                    tab.setIcon(tabText[i]);


                } catch (Resources.NotFoundException n) {

                    //  catch for the log
                    Log.d(TAG, "setupTabIcons: " + n);
                    Log.d(TAG, "setupTabText: " + n);

                }
            }
        }

    }

    public void whenChallengedClicked(View view) {
        Intent toDetailActivity = new Intent(this, ChallengeDetailActivity.class);
        startActivity(toDetailActivity);
    }

    private class ScreenSlidePagerAdapter extends FragmentPagerAdapter {

        private Fragment[] pages = {
                new HomeFragment(),
                new IntelligentTipsFragment(),
                new InterpersonalFragment(),
                new EngageFragment(),
                new SmartFragment()

        };

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            return pages[pos];
        }

        @Override
        public int getCount() {
            return pages.length;
        }
    }

}
