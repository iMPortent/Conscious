package com.example.c4q.conscious.views.activities;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.views.fragments.HomeFragment;
import com.example.c4q.conscious.views.fragments.IntelligentTipsFragment;
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
    public static String intelligenceTypePicked2 = "";
    static ImageButton enterChallengesButton;
    static Context mContext;
    static TextView intelligenceType;


    private int[] tabIcons = {
            R.drawable.ic_home_white_24dp,
            R.drawable.ic_extension_white_24dp,
            R.drawable.ic_arrow_upward_white_24dp,
            R.drawable.ic_play_arrow_white_24dp,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ran before frag");

        mContext = getApplicationContext();
        viewPager = findViewById(R.id.vpPager);
        adapterViewPager = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);

        vPagerIcons = findViewById(R.id.pager_header);
        vPagerIcons.setupWithViewPager(viewPager);
        setupTabIcons();

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("message");
        myRef.setValue("Hey");

        enterChallengesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,GrowthChallengeActivity.class);
                intent.putExtra("IntelligenceType", intelligenceType.getText().toString());
                startActivity(intent);
               /* growthChallengeFragment.setArguments(args);

//Inflate the fragment
                getFragmentManager().beginTransaction().add(R.id.container, growthChallengeFragment).commit();
                sendToChallenges = new Intent(mContext, GrowthChallengeActivity.class); */
                intelligenceTypePicked2 = intelligenceType.getText().toString();
            }
        });
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


    private void setupTabIcons(){
        vPagerIcons.getTabAt(0).setIcon(tabIcons[0]);
        vPagerIcons.getTabAt(1).setIcon(tabIcons[1]);
        vPagerIcons.getTabAt(2).setIcon(tabIcons[2]);
  //      vPagerIcons.getTabAt(3).setIcon(tabIcons[3]);
//        vPagerIcons.getTabAt(4).setIcon(tabIcons[4]);


    }

    private class ScreenSlidePagerAdapter extends FragmentPagerAdapter {

        private Fragment[] pages = {
                new HomeFragment(),
                new IntelligentTipsFragment(),
           //     new GrowthChallengeFragment(),
                new SmartFragment()

        };

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
//            switch(pos) {
//
//                case 0:
//                    return EngageFragment.newInstance(1, "FirstFragment");
//                case 1:
//                    return SmartFragment.newInstance(2, "Second Fragment");
//                case 2:
//                    return IncentiveFragment.newInstance(3, "Third Fragment");
//                case 3:
//                    return GoodieBagFragment.newInstance(4, "Fourth Fragment");
//                case 4:
//                    return FavoritesFragment.newInstance(5, "Fifth Fragment");
//                default: return EngageFragment.newInstance(1, "Default");
//            }
            return pages[pos];
        }

        @Override
        public int getCount() {
            return pages.length;
        }
    }

}
