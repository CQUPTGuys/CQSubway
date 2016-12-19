package com.kevin.cqsubway.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.kevin.cqsubway.R;
import com.kevin.cqsubway.app.SubwayApplication;
import com.kevin.cqsubway.model.db.SubwayOne;
import com.kevin.cqsubway.model.db.SubwayTwo;
import com.kevin.cqsubway.ui.adapter.OneRouteListViewAdapter;
import com.kevin.cqsubway.ui.adapter.TwoRouteListViewAdapter;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by xianling on 2016/12/19.
 */
public class TwoNumberFragment extends Fragment{
    private List<SubwayTwo> subwayOneList=new ArrayList<>();
    private TwoRouteListViewAdapter adapter;
    @Bind(R.id.lv_two_route)
    ListView lv_two_route;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_two_route,container,false);
        ButterKnife.bind(this, view);
        subwayOneList= SubwayApplication.subwayTwoList;
        adapter=new TwoRouteListViewAdapter(getActivity(),subwayOneList);
        lv_two_route.setAdapter(adapter);
        return view;
    }

}
