package com.example.c4q.conscious.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;

import com.example.c4q.conscious.R;


/**
 * Created by NiemaWidaha on 4/3/18.
 */

public class SliderAdapter extends PagerAdapter {

    // private fields:
    Context context;
    LayoutInflater layoutInflater;

    // constructor:
    public SliderAdapter(Context context) {
        this.context = context;
    }

    // arrays:
    // image array:
    public int[] slide_images = {
            R.drawable.onboarding_screen1_img,
            R.drawable.onboarding_screen2_img,
            R.drawable.onboarding_screen3_img,
            R.drawable.onboarding_screen4_img,
    };

    // title arrays:
    public int[] slide_titles = {
            R.string.slide_1_title,
            R.string.slide_2_title,
            R.string.slide_3_title,
            R.string.slide_4_title,
    };

    // description arrays:
    public int[] slide_desc = {
            R.string.slide_1_desc,
            R.string.slide_2_desc,
            R.string.slide_3_desc,
            R.string.slide_4_desc,
    };


    @Override
    public int getCount() {
        return slide_titles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }
} // ends slider adapter