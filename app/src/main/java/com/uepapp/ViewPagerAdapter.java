package com.uepapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence titles[];
    int numbOfTabs;
    FragmentManager fragmentManager;
    CompactCalendarTab compactCalendarTab = new CompactCalendarTab();
    Tab2 tab2 = new Tab2();

    public ViewPagerAdapter(FragmentManager fm, CharSequence titles[], int mNumbOfTabs) {
        super(fm);
//        FragmentTransaction transaction =  fm.beginTransaction();
//        transaction.add(R.id.compactCalendarTab, compactCalendarTab);
//        transaction.add(R.id.tab2, tab2);
//        transaction.commit();



        this.titles = titles;
        this.numbOfTabs = mNumbOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return compactCalendarTab;
        } else {
            return tab2;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return numbOfTabs;
    }
}