package com.kevin.cqsubway.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kevin.cqsubway.R;

/**
 * Created by xianling on 2016/12/19.
 */
public class AboutMeAdapter extends BaseAdapter{
    private Context mContext;
    private int[] ints;

    public AboutMeAdapter(Context mContext, int[] ints) {
        this.mContext = mContext;
        this.ints = ints;
    }

    @Override
    public int getCount() {
        return ints==null ? 0 :ints.length;
    }

    @Override
    public Object getItem(int position) {
        return ints[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(mContext).inflate(R.layout.item_activity_about,viewGroup,false);
        TextView textView= (TextView) view.findViewById(R.id.tc_about_me_item_name);
        textView.setText(ints[position]);
        return view;
    }
}
