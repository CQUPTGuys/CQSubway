package com.kevin.cqsubway.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kevin.cqsubway.R;
import com.kevin.cqsubway.app.SubwayApplication;
import com.kevin.cqsubway.model.db.SubwayOne;
import com.kevin.cqsubway.model.db.SubwaySix;
import com.kevin.cqsubway.model.db.SubwayThree;
import com.kevin.cqsubway.model.db.SubwayTwo;
import com.kevin.cqsubway.utils.DijkstraUtils;

public class GuideShowAvitivty extends AppCompatActivity {

    private String from;
    private String to;
    private int lineFrom;
    private int lintTo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_show);
        DijkstraUtils graph = new DijkstraUtils(DijkstraUtils.DIRECTED_GRAPH, DijkstraUtils.ADJACENCY_MATRIX, 121);
        quereFrom();
        quereTo();

        for (SubwayOne bean : SubwayApplication.subwayOneList){
            graph.addVertex(bean.getName());

        }
        for (SubwayTwo bean : SubwayApplication.subwayTwoList){
            graph.addVertex(bean.getName());
        }
        for (SubwayThree bean : SubwayApplication.subwayThreeList){
            graph.addVertex(bean.getName());
        }
        for (SubwaySix bean : SubwayApplication.subwaySixList){
            graph.addVertex(bean.getName());
        }

    }

    private void quereTo() {

    }

    private void quereFrom() {
    }
}
