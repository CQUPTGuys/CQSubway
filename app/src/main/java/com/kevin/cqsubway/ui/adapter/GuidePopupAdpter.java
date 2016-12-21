package com.kevin.cqsubway.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kevin.cqsubway.R;
import com.kevin.cqsubway.model.bean.StationModel;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Kevin Liu on 2016/12/20.
 * Function：
 */

public class GuidePopupAdpter extends BaseAdapter {
    private List<StationModel> beanList;
    private LayoutInflater layoutInflater;

    public GuidePopupAdpter(List<StationModel> beanList, LayoutInflater layoutInflater) {
        this.beanList = beanList;
        this.layoutInflater = layoutInflater;
    }

    @Override
    public int getCount() {
        return beanList.size();
    }

    @Override
    public Object getItem(int position) {
        return beanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView != null) {
            viewHolder = (ViewHolder) convertView.getTag();
        } else {
            convertView = layoutInflater.inflate(R.layout.item_guide_popup, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        viewHolder.name.setText(beanList.get(position).getName());
        viewHolder.data.setText(beanList.get(position).getData());

        return convertView;
    }

    class ViewHolder {
        @Bind(R.id.item_guide_popup_name_tv)
        TextView name;
        @Bind(R.id.item_guide_popup_data_tv)
        TextView data;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}