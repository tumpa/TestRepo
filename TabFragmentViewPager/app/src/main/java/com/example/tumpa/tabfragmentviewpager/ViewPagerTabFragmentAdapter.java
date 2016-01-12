package com.example.tumpa.tabfragmentviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by tumpa on 12/22/2015.
 */
public class ViewPagerTabFragmentAdapter extends FragmentStatePagerAdapter {
    int tabNumber;
    public ViewPagerTabFragmentAdapter(FragmentManager fm,int tabNumber) {
        super(fm);
        this.tabNumber = tabNumber;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabFragment1 tab1 = new TabFragment1();
                return tab1;
            case 1:
                TabFragment2 tab2 = new TabFragment2();
                return tab2;
            case 2:
                TabFragment3 tab3 = new TabFragment3();
                return tab3;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabNumber;
    }
}
