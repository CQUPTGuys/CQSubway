package com.kevin.cqsubway.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.kevin.cqsubway.R;
import com.kevin.cqsubway.app.SubwayApplication;
import com.kevin.cqsubway.model.db.SubwayThree;
import com.kevin.cqsubway.ui.adapter.ThreeRouteListViewAdapter;
import com.kevin.cqsubway.ui.adapter.ThreeRouteRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by xianling on 2016/12/19.
 */
public class ThreeNumberFragment extends Fragment{
    private ThreeRouteRecyclerViewAdapter adapter;
    @Bind(R.id.lv_three_route)
    RecyclerView lv_three_route;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_three_route, container, false);
        ButterKnife.bind(this, view);
        lv_three_route.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new ThreeRouteRecyclerViewAdapter(getActivity());
        lv_three_route.setAdapter(adapter);
        return view;
    }
}
