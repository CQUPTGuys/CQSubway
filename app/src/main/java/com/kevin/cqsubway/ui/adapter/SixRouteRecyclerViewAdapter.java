package com.kevin.cqsubway.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kevin.cqsubway.R;
import com.kevin.cqsubway.app.SubwayApplication;
import com.kevin.cqsubway.model.db.SubwayOne;
import com.kevin.cqsubway.model.db.SubwaySix;

import java.util.List;

/**
 * Created by xianling on 2016/12/20.
 */
public class SixRouteRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context mContext;
    private List<SubwaySix> list= SubwayApplication.subwaySixList;

    public SixRouteRecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View oneRouteHolder= LayoutInflater.from(mContext).inflate(R.layout.item_fragment_six_route,parent,false);
        return new RouteHolder(oneRouteHolder);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RouteHolder){
             ((RouteHolder) holder).tv_six_route_name.setText(list.get(position).getName());
            ((RouteHolder) holder).tv_six_right.setText(list.get(position).getSubRight());
            ((RouteHolder) holder).tv_six_left.setText(list.get(position).getSubLeft());
        }
    }

    @Override
    public int getItemCount() {
        return list==null ? 0 : list.size();
    }
    class RouteHolder extends RecyclerView.ViewHolder{
         TextView tv_six_route_name,tv_six_right,tv_six_left;

        public RouteHolder(View itemView) {
            super(itemView);
            tv_six_route_name=(TextView) itemView.findViewById(R.id.tv_six_route_name);
            tv_six_right=(TextView) itemView.findViewById(R.id.tv_six_right);
            tv_six_left=(TextView) itemView.findViewById(R.id.tv_six_left);
        }
    }
}
