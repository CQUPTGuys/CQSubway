package com.kevin.cqsubway.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kevin.cqsubway.R;
import com.kevin.cqsubway.app.SubwayApplication;
import com.kevin.cqsubway.model.bean.Station;
import com.kevin.cqsubway.model.db.SubwayOne;
import com.kevin.cqsubway.model.db.SubwaySix;
import com.kevin.cqsubway.model.db.SubwayThree;
import com.kevin.cqsubway.model.db.SubwayTwo;
import com.kevin.cqsubway.ui.adapter.GuideShowAdapter;
import com.kevin.cqsubway.utils.LogUtils;
import com.kevin.cqsubway.utils.DataBuilder;
import com.kevin.cqsubway.widget.MaterialProgressDrawable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GuideShowAvitivty extends AppCompatActivity {

    @Bind(R.id.guide_back)
    ImageView guideBack;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;
    @Bind(R.id.guide_show_area)
    TextView guideShowArea;
    @Bind(R.id.guide_show_stationNum)
    TextView guideShowStationNum;
    @Bind(R.id.guide_show_time)
    TextView guideShowTime;
    @Bind(R.id.guide_show_rv)
    RecyclerView guideShowRv;
    private String from;
    private String to;
    private GuideShowAdapter guideShowAdapter;
    private List<Station> result = new ArrayList<>();
    private DataBuilder dataBuilder;
    MaterialProgressDrawable progress;
    private int totalStation = 0;
    private Set<List<Station>> lineSet = new HashSet<List<Station>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_show);
        ButterKnife.bind(this);
        from = getIntent().getStringExtra("from");
        to = getIntent().getStringExtra("to");
        initView();
        dataBuilder = new DataBuilder();
        initStation();
        dataBuilder.getMetroMap(lineSet, totalStation);
        Station s1 = new Station(from);
        Station s2 = new Station(to);
        result = dataBuilder.getLines(s1, s2);
        guideShowStationNum.setText(result.size()+"站");
        guideShowTime.setText("大约"+result.size()*2+"分钟");
        guideShowAdapter = new GuideShowAdapter(GuideShowAvitivty.this,result);
        guideShowRv.setAdapter(guideShowAdapter);


    }


    private void initStation() {
        List<Station> subwayOneList = new ArrayList<>();
        List<Station> subwayTwoList = new ArrayList<>();
        List<Station> subwayThreeList = new ArrayList<>();
        List<Station> subwaySixList = new ArrayList<>();

        for (SubwayOne bean : SubwayApplication.subwayOneList) {
            subwayOneList.add(new Station(bean.getName(), "1号线"));
            LogUtils.d(bean.getName());
        }
        for (SubwayTwo bean : SubwayApplication.subwayTwoList) {
            subwayTwoList.add(new Station(bean.getName(), "2号线"));
        }
        for (SubwayThree bean : SubwayApplication.subwayThreeList) {
            subwayThreeList.add(new Station(bean.getName(), "3号线"));
        }
        for (SubwaySix bean : SubwayApplication.subwaySixList) {
            subwaySixList.add(new Station(bean.getName(), "6号线"));

        }
        for (int j = 0; j < subwayOneList.size(); j++) {
            if (j < subwayOneList.size() - 1) {
                subwayOneList.get(j).next = subwayOneList.get(j + 1);
                subwayOneList.get(j + 1).prev = subwayOneList.get(j);
            }
        }
        for (int j = 0; j < subwayOneList.size(); j++) {
            if (j < subwayOneList.size() - 1) {
                subwayOneList.get(j).next = subwayOneList.get(j + 1);
                subwayOneList.get(j + 1).prev = subwayOneList.get(j);
            }
        }
        for (int j = 0; j < subwayThreeList.size(); j++) {
            if (j < subwayThreeList.size() - 1) {
                subwayThreeList.get(j).next = subwayThreeList.get(j + 1);
                subwayThreeList.get(j + 1).prev = subwayThreeList.get(j);
            }
        }
        for (int j = 0; j < subwaySixList.size(); j++) {
            if (j < subwaySixList.size() - 1) {
                subwaySixList.get(j).next = subwaySixList.get(j + 1);
                subwaySixList.get(j + 1).prev = subwaySixList.get(j);
            }
        }
        totalStation = subwayOneList.size() + subwayTwoList.size() + subwayThreeList.size() + subwaySixList.size();


        lineSet.add(subwayOneList);
        lineSet.add(subwayTwoList);
        lineSet.add(subwayThreeList);
        lineSet.add(subwaySixList);

    }


    private void initView(){


        toolbarTitle.setText("查询结果");
        guideShowArea.setText(from+"  ------  "+to);
        guideShowRv.setLayoutManager(new LinearLayoutManager(this));
        guideShowRv.setItemAnimator(new DefaultItemAnimator());
    }

    @OnClick(R.id.guide_back)
    public void onClick() {
        finish();
    }
}
