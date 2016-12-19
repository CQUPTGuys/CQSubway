package com.kevin.cqsubway.ui.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.kevin.cqsubway.R;
import com.kevin.cqsubway.ui.adapter.RouteAdapter;
import com.kevin.cqsubway.ui.fragment.OneNumberFragment;
import com.kevin.cqsubway.ui.fragment.SixNumberFragment;
import com.kevin.cqsubway.ui.fragment.ThreeNumberFragment;
import com.kevin.cqsubway.ui.fragment.TwoNumberFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by xianling on 2016/12/19.
 */
public class RouteActivity extends AppCompatActivity{
    private OneNumberFragment oneNumberFragment;
    private TwoNumberFragment twoNumberFragment;
    private ThreeNumberFragment threeNumberFragment;
    private SixNumberFragment sixNumberFragment;
    private List<Fragment> fragmentList;
    private RouteAdapter adapter;
    @Bind(R.id.vp_route)
    ViewPager vp_route;
    @Bind(R.id.tl_route)
    TabLayout tl_route;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);
        ButterKnife.bind(this);
        initFragment();
        vp_route.setAdapter(adapter);
        tl_route.setupWithViewPager(vp_route);
    }



    private void initFragment() {
        fragmentList=new ArrayList<>();
        oneNumberFragment=new OneNumberFragment();
        twoNumberFragment=new TwoNumberFragment();
        threeNumberFragment=new ThreeNumberFragment();
        sixNumberFragment=new SixNumberFragment();
        fragmentList.add(oneNumberFragment);
        fragmentList.add(twoNumberFragment);
        fragmentList.add(threeNumberFragment);
        fragmentList.add(sixNumberFragment);
        adapter=new RouteAdapter(getSupportFragmentManager(),this,fragmentList);
    }
}
