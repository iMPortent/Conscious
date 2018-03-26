package com.example.c4q.conscious.views.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import com.example.c4q.conscious.R;
import com.example.c4q.conscious.views.fragments.CommunityFragment;
import com.example.c4q.conscious.views.fragments.IncentiveFragment;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends FragmentActivity {

    private static final String TAG = "MainActivity";
    FragmentPagerAdapter adapterViewPager;
    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ran before frag");

        ViewPager viewPager = findViewById(R.id.vpPager);
        adapterViewPager = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("message");
        myRef.setValue("Hey");
    }

    private class ScreenSlidePagerAdapter extends FragmentPagerAdapter {

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

                case 0:
                    return CommunityFragment.newInstance(0, "FirstFragment");
                case 1:
                    return IncentiveFragment.newInstance(1, "Second Fragment");
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
