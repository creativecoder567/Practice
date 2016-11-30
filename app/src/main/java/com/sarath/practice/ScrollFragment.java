package com.sarath.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

/**
 * Created by sarath on 11/30/2016.
 */

public class ScrollFragment extends FragmentActivity {

    ViewPager viewPager=null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_fragment);
        viewPager= (ViewPager)findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }
}

class MyAdapter extends FragmentPagerAdapter{

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position==0){
            fragment = new ScrollA();
        }
        if (position==1){
            fragment = new ScrollB();
        }
        if (position==2){
            fragment = new ScrollC();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = new String();
        if (position==0){
            return  "Tab 1";
        }
        if (position==1){
            return  "Tab 2";
        }
        if (position==2){
            return  "Tab 3";
        }
        return title;
    }
}//unable to push to github.