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
import com.kevin.cqsubway.model.db.SubwayTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianling on 2016/12/19.
 */
public class TwoRouteListViewAdapter extends BaseAdapter{
    private Context mContext;
    private List<SubwayTwo> list= SubwayApplication.subwayTwoList;
    private TextView tv_two_route_name,tv_two_right,tv_two_left;

    public TwoRouteListViewAdapter(Context mContext) {
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
        view= LayoutInflater.from(mContext).inflate(R.layout.item_fragment_two_route,viewGroup,false);
        tv_two_route_name= (TextView) view.findViewById(R.id.tv_two_route_name);
        tv_two_right= (TextView) view.findViewById(R.id.tv_two_right);
        tv_two_left= (TextView) view.findViewById(R.id.tv_two_left);
        tv_two_route_name.setText(list.get(postion).getName());
        tv_two_right.setText(list.get(postion).getSubRight());
        tv_two_right.setText(list.get(postion).getSubLeft());
        return view;
    }
}
