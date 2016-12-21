package com.kevin.cqsubway.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import com.kevin.cqsubway.R;
import com.kevin.cqsubway.app.SubwayApplication;
import com.kevin.cqsubway.model.bean.StationModel;
import com.kevin.cqsubway.model.db.SubwayOne;
import com.kevin.cqsubway.model.db.SubwaySix;
import com.kevin.cqsubway.model.db.SubwayThree;
import com.kevin.cqsubway.model.db.SubwayTwo;
import com.kevin.cqsubway.ui.adapter.GuidePopupAdpter;
import com.kevin.cqsubway.utils.LogUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EditStationActivity extends AppCompatActivity {

    @Bind(R.id.guide_station_back)
    ImageView guideStationBack;
    @Bind(R.id.guide_station_edit)
    EditText guideStationEdit;
    @Bind(R.id.guide_station_lv)
    ListView guideStationLv;
    @Bind(R.id.guide_station_refresh)
    SwipeRefreshLayout refreshLayout;
    private GuidePopupAdpter dataAdapter;
    private boolean isFrom ;

    private List<StationModel> stationList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_station);
        ButterKnife.bind(this);
        initRefreshLayout();
        guideStationLv.setDividerHeight(0);
        isFrom = getIntent().getBooleanExtra("isFrom",true);
        dataAdapter = new GuidePopupAdpter(stationList,this.getLayoutInflater());
        guideStationLv.setAdapter(dataAdapter);
        guideStationEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(final CharSequence charSequence, int i, int i1, int i2) {
                if (!charSequence.toString().equals("")){
                    refreshLayout.setRefreshing(true);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            QueryData(charSequence.toString());
                        }
                    }, 2000);
                    //QueryData(charSequence.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
            guideStationLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent();
                if (isFrom){
                    intent.putExtra("stationFrom", stationList.get(i).getName());
                    setResult(1003, intent);
                    finish();
                }else {
                    intent.putExtra("stationTo", stationList.get(i).getName());
                    setResult(1004, intent);
                    finish();
                }
            }
        });
    }

    @OnClick(R.id.guide_station_back)
    public void onClick() {
        finish();
    }

    private void QueryData(final String keyword){
        stationList.clear();
        LogUtils.d("开始查询~");
        stationList.clear();
        for (SubwayOne bean : SubwayApplication.subwayOneList) {
            if (bean.getName().contains(keyword) || bean.getName().contains(keyword.toUpperCase())) {
                stationList.add(new StationModel(bean.getName(),bean.getData(),2,bean.getStationId()));
            }
        }
        for (SubwayTwo bean : SubwayApplication.subwayTwoList) {
            if (bean.getName().contains(keyword) || bean.getName().contains(keyword.toUpperCase())) {
                stationList.add(new StationModel(bean.getName(),bean.getData(),2,bean.getStationId()));
            }
        }
        for (SubwayThree bean : SubwayApplication.subwayThreeList) {
            if (bean.getName().contains(keyword) || bean.getName().contains(keyword.toUpperCase())) {
                stationList.add(new StationModel(bean.getName(),bean.getData(),2,bean.getStationId()));
            }
        }
        for (SubwaySix bean : SubwayApplication.subwaySixList) {
            if (bean.getName().contains(keyword) || bean.getName().contains(keyword.toUpperCase())) {
                stationList.add(new StationModel(bean.getName(),bean.getData(),2,bean.getStationId()));
            }
        }
        LogUtils.d("获得了数据--》"+stationList.size());
        dataAdapter.notifyDataSetChanged();
        refreshLayout.setRefreshing(false);

    }

    private void initRefreshLayout() {
        //设置刷新的颜色
        refreshLayout.setColorSchemeResources(
                R.color.colorPrimary,
                R.color.colorPrimary,
                R.color.colorPrimary,
                R.color.colorPrimary);
        //拖动多长的时候开始刷新
        refreshLayout.setDistanceToTriggerSync(100);

        refreshLayout.setProgressBackgroundColorSchemeColor(getResources().getColor(R.color.white));

        //设置大小
        refreshLayout.setSize(SwipeRefreshLayout.DEFAULT);
        //刷新监听器
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                QueryData(guideStationEdit.getText().toString());
            }
        });
    }

}

