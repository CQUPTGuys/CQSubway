package com.kevin.cqsubway.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kevin.cqsubway.R;
import com.kevin.cqsubway.model.db.History;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin Liu on 2016/12/19.
 * Function：
 */

public class GuideHistoryAdapter extends RecyclerView.Adapter<GuideHistoryAdapter.GuideHistoryViewHolder> {


    private List<History> historyList = new ArrayList<>();
    private Context context;

    public GuideHistoryAdapter(Context context,List<History> data){
        this.context = context;
        this.historyList = data;
    }


    @Override
    public GuideHistoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        GuideHistoryViewHolder holder = new GuideHistoryViewHolder(LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.item_guide_history,
                        parent,
                        false));
        return holder;
    }

    @Override
    public void onBindViewHolder(GuideHistoryViewHolder holder, int position) {
        holder.from.setText(historyList.get(position).getFrom()+" ----");
        holder.to.setText(" "+historyList.get(position).getTo());
    }

    @Override
    public int getItemCount() {
        return historyList.size();
    }

    class GuideHistoryViewHolder extends RecyclerView.ViewHolder{

        private TextView from;
        private TextView to;

        public GuideHistoryViewHolder(View itemView) {
            super(itemView);
            from = (TextView) itemView.findViewById(R.id.item_guide_from);
            to = (TextView) itemView.findViewById(R.id.item_guide_to);
        }
    }
}
