package com.kevin.cqsubway.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kevin.cqsubway.R;
import com.kevin.cqsubway.model.db.SubwayOne;
import com.kevin.cqsubway.model.db.SubwayThree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianling on 2016/12/19.
 */
public class ThreeRouteListViewAdapter extends BaseAdapter{
    private Context mContext;
    private List<SubwayThree> list=new ArrayList<>();
    private TextView tv_three_route_name,tv_three_right,tv_three_left;

    public ThreeRouteListViewAdapter(Context mContext, List<SubwayThree> list) {
        this.mContext = mContext;
        this.list = list;
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
        view= LayoutInflater.from(mContext).inflate(R.layout.item_fragment_three_route,viewGroup,false);
        tv_three_route_name= (TextView) view.findViewById(R.id.tv_three_route_name);
        tv_three_right= (TextView) view.findViewById(R.id.tv_three_right);
        tv_three_left= (TextView) view.findViewById(R.id.tv_three_left);
        tv_three_route_name.setText(list.get(postion).getName());
        tv_three_right.setText(list.get(postion).getSubRight());
        tv_three_left.setText(list.get(postion).getSubLeft());
        return view;
    }
}
