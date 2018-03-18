package com.example.c4q.conscious;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.c4q.conscious.views.fragments.SlidingFragment;

/**
 * Created by c4q on 3/18/18.
 */

public class ComponentSlider extends FragmentActivity {

    final private int NUM_PAGES = 4;
    ViewPager pager;
    PagerAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.component_slider);

        pager = findViewById(R.id.view_pager_categories);
        adapter = new ComponentSliderAdapter(getSupportFragmentManager());
    }

    private class ComponentSliderAdapter extends FragmentStatePagerAdapter{

        public ComponentSliderAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new SlidingFragment();
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
