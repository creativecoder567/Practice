package com.sarath.practice;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

/**
 * Created by sarath on 12/1/2016.
 */

public class SwipeFragment extends FragmentActivity implements ActionBar.TabListener {
    ViewPager viewPager;
    ActionBar actionBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.swipe_fragment);

        viewPager= (ViewPager) findViewById(R.id.SwipePager);
        viewPager.setAdapter(new SwipeAdapter(getSupportFragmentManager()));
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab1 = actionBar.newTab();
        tab1.setText("Tab 1");
        tab1.setTabListener(this);

        ActionBar.Tab tab2 = actionBar.newTab();
        tab2.setText("Tab 2");
        tab2.setTabListener(this);

        ActionBar.Tab tab3 = actionBar.newTab();
        tab3.setText("Tab 3");
        tab3.setTabListener(this);

        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
        actionBar.addTab(tab3);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Log.d("sarath","onTabSelected at " + " position " +tab.getPosition()+" name "+tab.getText());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Log.d("sarath","onTabUnSelected at " + " position " +tab.getPosition()+" name "+tab.getText());
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Log.d("sarath","onTabReSelected at " + " position " +tab.getPosition()+" name "+tab.getText());
    }
}
class SwipeAdapter extends FragmentPagerAdapter{

    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment =null;
        if(position==0)
        {
            fragment = new SwipeA();
        }
        if(position==1)
        {
            fragment = new SwipeB();
        }
        if(position==2)
        {
            fragment = new SwipeC();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}