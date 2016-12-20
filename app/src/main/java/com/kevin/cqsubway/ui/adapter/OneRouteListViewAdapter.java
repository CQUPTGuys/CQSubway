package com.kevin.cqsubway.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kevin.cqsubway.R;
import com.kevin.cqsubway.app.SubwayApplication;
import com.kevin.cqsubway.model.db.SubwayOne;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianling on 2016/12/19.
 */
public class OneRouteListViewAdapter extends BaseAdapter{
    private Context mContext;
    private List<SubwayOne> list= SubwayApplication.subwayOneList;
    private TextView tv_one_route_name,tv_one_right,tv_one_left;

    public OneRouteListViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return list==null ? 0 : list.size();
    }

    @Override
    public Object getItem(int postion) {
        return list.get(postion);
    }

    @Override
    public long getItemId(int postion) {
        return postion;
    }

    @Override
    public View getView(int postion, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(mContext).inflate(R.layout.item_fragment_one_route,viewGroup,false);
        tv_one_route_name= (TextView) view.findViewById(R.id.tv_one_route_name);
        tv_one_right= (TextView) view.findViewById(R.id.tv_one_right);
        tv_one_left= (TextView) view.findViewById(R.id.tv_one_left);
        tv_one_route_name.setText(list.get(postion).getName());
        tv_one_right.setText(list.get(postion).getSubRight());
        tv_one_right.setText(list.get(postion).getSubLeft());
        return view;
    }
}
