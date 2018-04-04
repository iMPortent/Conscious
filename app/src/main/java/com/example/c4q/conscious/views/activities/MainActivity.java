package com.example.c4q.conscious.views.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.eftimoff.viewpagertransformers.DrawFromBackTransformer;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.views.fragments.FitnessFragment;
import com.example.c4q.conscious.views.fragments.HomeFragment;
import com.example.c4q.conscious.views.fragments.IntelligentTipsFragment;
import com.example.c4q.conscious.views.fragments.InterpersonalFragment;
import com.example.c4q.conscious.views.fragments.SmartFragment;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends FragmentActivity {

    private static final String TAG = "MainActivity";
    FragmentPagerAdapter adapterViewPager;
    FirebaseDatabase database;
    DatabaseReference myRef;
    TabLayout vPagerIcons;
    ViewPager viewPager;

    private int[] tabIcons = {

            R.drawable.home_white,
            R.drawable.smart_dummy_icon,
            R.drawable.incentive_dummy_icon,
            R.drawable.goodie_bag_dummy_icon,
            R.drawable.favorites_dummy_icon
    };


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
        setupTabIcons();

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("message");
        myRef.setValue("Hey");

    }

    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }


    private void setupTabIcons(){
        vPagerIcons.getTabAt(0).setIcon(tabIcons[0]);
        vPagerIcons.getTabAt(1).setIcon(tabIcons[1]);
        vPagerIcons.getTabAt(2).setIcon(tabIcons[2]);
        vPagerIcons.getTabAt(3).setIcon(tabIcons[3]);
    }

    private class ScreenSlidePagerAdapter extends FragmentPagerAdapter {

        private Fragment[] pages = {
                new HomeFragment(),
                new IntelligentTipsFragment(),
                new InterpersonalFragment(),
                new SmartFragment(),
                new FitnessFragment(),
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
