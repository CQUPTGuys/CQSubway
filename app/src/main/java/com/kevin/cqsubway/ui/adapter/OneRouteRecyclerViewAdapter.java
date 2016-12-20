package com.kevin.cqsubway.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.kevin.cqsubway.R;
import com.kevin.cqsubway.app.SubwayApplication;
import com.kevin.cqsubway.model.db.SubwayOne;

import java.util.List;

/**
 * Created by xianling on 2016/12/20.
 */
public class OneRouteRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context mContext;
    private List<SubwayOne> list= SubwayApplication.subwayOneList;

    public OneRouteRecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View oneRouteHolder= LayoutInflater.from(mContext).inflate(R.layout.item_fragment_one_route,parent,false);
        return new RouteHolder(oneRouteHolder);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RouteHolder){
             ((RouteHolder) holder).tv_one_route_name.setText(list.get(position).getName());
            ((RouteHolder) holder).tv_one_right.setText(list.get(position).getSubRight());
            ((RouteHolder) holder).tv_one_left.setText(list.get(position).getSubLeft());
        }
    }

    @Override
    public int getItemCount() {
        return list==null ? 0 : list.size();
    }
    class RouteHolder extends RecyclerView.ViewHolder{
         TextView tv_one_route_name,tv_one_right,tv_one_left;

        public RouteHolder(View itemView) {
            super(itemView);
            tv_one_route_name=(TextView) itemView.findViewById(R.id.tv_one_route_name);
            tv_one_right=(TextView) itemView.findViewById(R.id.tv_one_right);
            tv_one_left=(TextView) itemView.findViewById(R.id.tv_one_left);
        }
    }
}
