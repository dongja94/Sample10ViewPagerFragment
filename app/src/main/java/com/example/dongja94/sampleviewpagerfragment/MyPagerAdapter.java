package com.example.dongja94.sampleviewpagerfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by dongja94 on 2016-01-26.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    private static final int ITEM_COUNT = 5;

    @Override
    public Fragment getItem(int position) {
        return PagerFragment.newInstance("" + position);
    }

    @Override
    public int getCount() {
        return ITEM_COUNT;
    }
}
