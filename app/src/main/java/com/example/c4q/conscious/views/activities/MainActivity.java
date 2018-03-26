package com.example.c4q.conscious.views.activities;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.views.fragments.CommunityFragment;
import com.example.c4q.conscious.views.fragments.FavoritesFragment;
import com.example.c4q.conscious.views.fragments.GoodieBagFragment;
import com.example.c4q.conscious.views.fragments.IncentiveFragment;
import com.example.c4q.conscious.views.fragments.SmartFragment;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends FragmentActivity {

    private static final String TAG = "MainActivity";
    FragmentPagerAdapter adapterViewPager;
    FirebaseDatabase database;
    DatabaseReference myRef;
    TabLayout vPagerIcons;
    TabItem vPagerTabIcon1;
    TabItem vPagerTabIcon2;
    TabItem vPagerTabIcon3;
    TabItem vPagerTabIcon4;
    TabItem vPagerTabIcon5;
    private int[] tabIcons = {
            R.drawable.community_dummy,
            R.drawable.smart_dummy,
            R.drawable.incentives_dummy,
            R.drawable.goodie_bag_dummy,
            R.drawable.favorite
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ran before frag");

        ViewPager viewPager = findViewById(R.id.vpPager);
        adapterViewPager = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);

        vPagerIcons = findViewById(R.id.pager_header);
        vPagerIcons.setupWithViewPager(viewPager);
        setupTabIcons();
        vPagerTabIcon1 = findViewById(R.id.tabIcon1);
        vPagerTabIcon2 = findViewById(R.id.tabIcon2);
        vPagerTabIcon3 = findViewById(R.id.tabIcon3);
        vPagerTabIcon4 = findViewById(R.id.tabIcon4);
        vPagerTabIcon5 = findViewById(R.id.tabIcon5);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("message");
        myRef.setValue("Hey");

    }

        private void setupTabIcons(){
            vPagerIcons.getTabAt(0).setIcon(tabIcons[0]);
            vPagerIcons.getTabAt(1).setIcon(tabIcons[1]);
            vPagerIcons.getTabAt(2).setIcon(tabIcons[2]);
            vPagerIcons.getTabAt(3).setIcon(tabIcons[3]);
            vPagerIcons.getTabAt(4).setIcon(tabIcons[4]);


    }

    private class ScreenSlidePagerAdapter extends FragmentPagerAdapter {

        private ViewPager mPager;
        private Fragment[] pages = {
                new CommunityFragment(),
                new SmartFragment(),
                new IncentiveFragment(),
                new GoodieBagFragment(),
                new FavoritesFragment(),
        };

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

                case 0:
                    return CommunityFragment.newInstance(1, "FirstFragment");
                case 1:
                    return IncentiveFragment.newInstance(2, "Second Fragment");
//                case 2: return ThirdFragment.newInstance(2, "Third Fragment");
//                case 3: return ThirdFragment.newInstance(4, "Fourth Fragment");
                default: return CommunityFragment.newInstance(1, "Default");
            }
        }

        @Override
        public int getCount() {
            return 5;
        }
    }

}
