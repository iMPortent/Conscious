package com.example.c4q.conscious.views.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.views.fragments.CommunityFragment;
import com.example.c4q.conscious.views.fragments.IncentiveFragment;
import com.example.c4q.conscious.views.fragments.SlidingFragment;
import com.example.c4q.conscious.views.fragments.SmartFragment;

public class ScreenSlidePagerActivity extends FragmentActivity {


    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private ViewPager mPager;
    private Fragment[] pages = {
            new CommunityFragment(),
            new SmartFragment(),
            new IncentiveFragment(),
            new SlidingFragment()
    };

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_view_pager);

            // Instantiate a ViewPager and a PagerAdapter.
            mPager = findViewById(R.id.pager);
            mPager.setAdapter(new ScreenSlidePagerAdapter(getSupportFragmentManager()));
        }

        @Override
        public void onBackPressed() {
            if (mPager.getCurrentItem() == 0) {
                // If the user is currently looking at the first step, allow the system to handle the
                // Back button. This calls finish() on this activity and pops the back stack.
                super.onBackPressed();
            } else {
                // Otherwise, select the previous step.
                mPager.setCurrentItem(mPager.getCurrentItem() - 1);
            }
        }

        /**
         * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
         * sequence.
         */
        private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
            public ScreenSlidePagerAdapter(FragmentManager fm) {
                super(fm);
            }

            @Override
            public Fragment getItem(int position) {
                return pages[position];
            }

            @Override
            public int getCount() {
                return pages.length;
            }
    }
}
