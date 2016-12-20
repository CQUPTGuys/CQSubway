package com.kevin.cqsubway.ui.activity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

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
    @Bind(R.id.collapsingToolbarLayout)
    CollapsingToolbarLayout collapsingToolbarLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_new);
        ButterKnife.bind(this);
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.item_now_red));
        collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(R.color.white));
        initFragment();
        vp_route.setAdapter(adapter);
        tl_route.setupWithViewPager(vp_route);
        vp_route.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                System.out.println(tl_route.getSelectedTabPosition());
                switch (position){
                    case 0:
                        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.item_now_red));
                        break;//标题字体颜色break;
                    case 1:
                        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.item_now_green));
                        break;
                    case 2:
                        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.colorPrimary));
                        break;
                    case 3:
                        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.colorAccent));
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
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
