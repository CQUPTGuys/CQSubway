package com.kevin.cqsubway.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.kevin.cqsubway.R;
import com.kevin.cqsubway.model.db.SubwayOne;
import com.kevin.cqsubway.ui.adapter.OneRouteListViewAdapter;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by xianling on 2016/12/19.
 */
public class OneNumberFragment extends Fragment{
    private List<SubwayOne> subwayOneList=new ArrayList<>();
    private OneRouteListViewAdapter adapter;
    @Bind(R.id.lv_one_route)
    ListView lv_one_route;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_one_route, container, false);

        queryList(); ButterKnife.bind(this, view);
        adapter=new OneRouteListViewAdapter(getActivity(),subwayOneList);
        lv_one_route.setAdapter(adapter);
        return view;
    }

    private void queryList() {
        subwayOneList=DataSupport.findAll(SubwayOne.class);
    }
}