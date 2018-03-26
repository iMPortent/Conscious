package com.example.c4q.conscious.views.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.c4q.conscious.R;
import com.example.c4q.conscious.controller.vPagerAdapter;
import com.example.c4q.conscious.views.fragments.CommunityFragment;
import com.example.c4q.conscious.views.fragments.IncentiveFragment;
import com.example.c4q.conscious.views.fragments.SmartFragment;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    FragmentPagerAdapter adapterViewPager;
    FirebaseDatabase database;
    DatabaseReference myRef;
    TextView textView;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.navigation);
        ViewPager viewPager = findViewById(R.id.vpPager);
        viewPager.setAdapter(new vPagerAdapter(getSupportFragmentManager(),
                MainActivity.this));

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        //Firebase uses a factory class
        //initializing database
        database = FirebaseDatabase.getInstance();
        //write to the database
        //key
        myRef = database.getReference("message");
        //value
        myRef.setValue("Hey");

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        switch (item.getItemId()) {
                            case R.id.home:
                                transaction.replace(R.id.frame_layout, CommunityFragment.newInstance(1, "CommunityFragment" ));
                                transaction.commit();
                                break;

                            case R.id.smart:
                                transaction.replace(R.id.frame_layout,SmartFragment.newInstance(2, "SmartFragment"));
                                transaction.commit();
                                break;

                            case R.id.incentive:
//                                selectedFragment = IncentiveFragment.newInstance(3, "IncentivesFragment");
                                break;

                        }



                        return true;
                    }
                });
    }

}
