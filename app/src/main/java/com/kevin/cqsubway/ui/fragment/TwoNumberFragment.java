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
import com.kevin.cqsubway.model.db.SubwayTwo;
import com.kevin.cqsubway.ui.adapter.TwoRouteListViewAdapter;
import com.kevin.cqsubway.ui.adapter.TwoRouteRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by xianling on 2016/12/19.
 */
public class TwoNumberFragment extends Fragment{
    private TwoRouteRecyclerViewAdapter adapter;
    @Bind(R.id.lv_two_route)
    RecyclerView lv_two_route;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_two_route,container,false);
        ButterKnife.bind(this, view);
        lv_two_route.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new TwoRouteRecyclerViewAdapter(getActivity());
        lv_two_route.setAdapter(adapter);
        return view;
    }
}
