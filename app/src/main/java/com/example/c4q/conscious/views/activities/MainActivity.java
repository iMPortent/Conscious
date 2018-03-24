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
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.home:
                                selectedFragment = CommunityFragment.newInstance(1, "CommunityFragment" );
                                break;

                            case R.id.smart:
                                selectedFragment = SmartFragment.newInstance(2, "SmartFragment");
                                break;

                            case R.id.incentive:
                                selectedFragment = IncentiveFragment.newInstance(3, "IncentivesFragment");
                                break;
                        }

                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, CommunityFragment.newInstance(1, "CommunityFragment"));
        transaction.commit();
    }

        //
//        myRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                // This method is called once with the initial value and again
//                // whenever data at this location is updated.
//                String value = dataSnapshot.getValue(String.class);
//                textView.setText(value);
//                Log.d("TAG", "Value is: " + value);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError error) {
//                // Failed to read value
//                myRef.setValue("Hey");
//                Log.w("TAG", "Failed to read value.", error.toException());
//            }
//        });


}
