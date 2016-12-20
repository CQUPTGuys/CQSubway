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
import com.kevin.cqsubway.model.db.SubwayTwo;

import java.util.List;

/**
 * Created by xianling on 2016/12/20.
 */
public class TwoRouteRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context mContext;
    private List<SubwayTwo> list= SubwayApplication.subwayTwoList;

    public TwoRouteRecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View oneRouteHolder= LayoutInflater.from(mContext).inflate(R.layout.item_fragment_two_route,parent,false);
        return new RouteHolder(oneRouteHolder);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RouteHolder){
             ((RouteHolder) holder).tv_two_route_name.setText(list.get(position).getName());
            ((RouteHolder) holder).tv_two_right.setText(list.get(position).getSubRight());
            ((RouteHolder) holder).tv_two_left.setText(list.get(position).getSubLeft());
        }
    }

    @Override
    public int getItemCount() {
        return list==null ? 0 : list.size();
    }
    class RouteHolder extends RecyclerView.ViewHolder{
         TextView tv_two_route_name,tv_two_right,tv_two_left;

        public RouteHolder(View itemView) {
            super(itemView);
            tv_two_route_name=(TextView) itemView.findViewById(R.id.tv_two_route_name);
            tv_two_right=(TextView) itemView.findViewById(R.id.tv_two_right);
            tv_two_left=(TextView) itemView.findViewById(R.id.tv_two_left);
        }
    }
}
