package com.kevin.cqsubway.ui.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianling on 2016/12/19.
 */
public class RouteAdapter extends FragmentPagerAdapter{
    private Context context;
    private List<Fragment> fragmentList;
    private List<String> titleList = new ArrayList<>();
    public RouteAdapter(FragmentManager fm,Context context, List<Fragment> fragments) {
        super(fm);
        this.context = context;
        this.fragmentList = fragments;
        titleList.add("一号线");
        titleList.add("二号线");
        titleList.add("三号线");
        titleList.add("六号线");
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
