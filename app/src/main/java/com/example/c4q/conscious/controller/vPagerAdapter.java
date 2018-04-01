//package com.example.c4q.conscious.controller;
//
//import android.content.Context;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentPagerAdapter;
//import com.example.c4q.conscious.views.fragments.EngageFragment;
//import com.example.c4q.conscious.views.fragments.SmartFragment;
//
//import static android.net.wifi.p2p.nsd.WifiP2pServiceRequest.newInstance;
//
//
//public class vPagerAdapter extends FragmentPagerAdapter {
//
//    final int PAGE_COUNT = 3;
//    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" };
//    private Context context;
//
//    public vPagerAdapter(FragmentManager fm, Context context) {
//        super(fm);
//        this.context = context;
//    }
//
//    @Override
//    public int getCount() {
//        return PAGE_COUNT;
//    }
//
//    @Override
//    public Fragment getItem(int position) {
//        switch(position) {
//
//            case 0: return EngageFragment.instantiate(this.context,"EngageFragment");
//            case 1: return IncentiveFragment.instantiate(this.context,"IncentiveFragment");
//            case 2: return SmartFragment.instantiate(this.context,"SmartFragment");
//            default: return EngageFragment.instantiate(this.context,"CommuinityFragment");
//        }
//    }
//
//    @Override
//    public CharSequence getPageTitle(int position) {
//        // Generate title based on item position
//        return tabTitles[position];
//    }
//
//}
