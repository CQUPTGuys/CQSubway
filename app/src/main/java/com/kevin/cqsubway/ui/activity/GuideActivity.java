package com.kevin.cqsubway.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.kevin.cqsubway.R;
import com.kevin.cqsubway.app.SubwayApplication;
import com.kevin.cqsubway.model.db.History;
import com.kevin.cqsubway.model.db.SubwayOne;
import com.kevin.cqsubway.model.db.SubwaySix;
import com.kevin.cqsubway.model.db.SubwayThree;
import com.kevin.cqsubway.model.db.SubwayTwo;
import com.kevin.cqsubway.ui.adapter.GuideHistoryAdapter;
import com.kevin.cqsubway.ui.adapter.GuidePopupAdpter;
import com.kevin.cqsubway.utils.LogUtils;
import com.kevin.cqsubway.utils.PopupWindowUtils;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GuideActivity extends AppCompatActivity {

    @Bind(R.id.guide_back)
    ImageView guideBack;
    @Bind(R.id.guide_ok)
    ImageView guideOk;
    @Bind(R.id.guide_from_edt)
    AppCompatEditText guideFromEdt;
    @Bind(R.id.guide_drop)
    LinearLayout guideDrop;
    @Bind(R.id.guide_icon_divider)
    ImageView guideIconDivider;
    @Bind(R.id.guide_to)
    TextView guideTo;
    @Bind(R.id.guide_to_edt)
    AppCompatEditText guideToEdt;
    @Bind(R.id.guide_rv)
    RecyclerView guideRv;
    @Bind(R.id.guide_clear_data)
    RelativeLayout guideClearData;
    @Bind(R.id.activity_guide)
    LinearLayout activityGuide;
    private GuideHistoryAdapter guideHistoryAdapter;
    private List<History> historyList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
        initView();
        historyList.clear();
        historyList= DataSupport.findAll(History.class);
        if (historyList.size() != 0){
            guideClearData.setVisibility(View.VISIBLE);
        }else {
            guideClearData.setVisibility(View.GONE);
        }
        guideHistoryAdapter = new GuideHistoryAdapter(GuideActivity.this,historyList);
        guideRv.setAdapter(guideHistoryAdapter);
    }





    @OnClick({R.id.guide_back, R.id.guide_ok,R.id.guide_from_edt,R.id.guide_to_edt,R.id.guide_clear_data})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.guide_back:
                finish();
                break;
            case R.id.guide_ok:
                break;
            case R.id.guide_clear_data:

                break;
            case R.id.guide_from_edt:
                Intent fromDataIntent = new Intent(GuideActivity.this, EditStationActivity.class);
                fromDataIntent.putExtra("isFrom",true);
                startActivityForResult(fromDataIntent, 1000);
                break;
            case R.id.guide_to_edt:
                Intent toDataIntent = new Intent(GuideActivity.this, EditStationActivity.class);
                toDataIntent.putExtra("isFrom",false);
                startActivityForResult(toDataIntent, 1000);
                break;
        }
    }


    private void initView(){
        guideRv.setLayoutManager(new LinearLayoutManager(GuideActivity.this));
        guideRv.setItemAnimator(new DefaultItemAnimator());
        guideFromEdt.setFocusable(false);
        guideToEdt.setFocusable(false);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1000 && resultCode == 1003) {
            guideFromEdt.setText(data.getStringExtra("stationFrom"));
        } else if (requestCode == 1000 && resultCode == 1004){
            guideToEdt.setText(data.getStringExtra("stationTo"));
        }
    }
}
