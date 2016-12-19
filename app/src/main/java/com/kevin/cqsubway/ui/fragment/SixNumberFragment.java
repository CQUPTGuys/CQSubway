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
import com.kevin.cqsubway.model.db.SubwaySix;
import com.kevin.cqsubway.ui.adapter.OneRouteListViewAdapter;
import com.kevin.cqsubway.ui.adapter.SixRouteListViewAdapter;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by xianling on 2016/12/19.
 */
public class SixNumberFragment extends Fragment{
    private List<SubwaySix> subwayOneList=new ArrayList<>();
    private SixRouteListViewAdapter adapter;
    @Bind(R.id.lv_six_route)
    ListView lv_six_route;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_six_route, container, false);
        ButterKnife.bind(this, view);
        queryList();
        adapter=new SixRouteListViewAdapter(getActivity(),subwayOneList);
        lv_six_route.setAdapter(adapter);
        return view;
    }

    private void queryList() {
        subwayOneList= DataSupport.findAll(SubwaySix.class);
    }
}
