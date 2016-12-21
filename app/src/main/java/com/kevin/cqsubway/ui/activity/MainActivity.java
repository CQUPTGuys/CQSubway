package com.kevin.cqsubway.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

import com.kevin.cqsubway.R;
import com.kevin.cqsubway.widget.DragImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.main_map)
    DragImageView mainMap;
    @Bind(R.id.search_cd)
    CardView searchCd;
    @Bind(R.id.guide_rl)
    RelativeLayout guideRl;
    @Bind(R.id.route_rl)
    RelativeLayout routeRl;
    @Bind(R.id.about)
    RelativeLayout about;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();

    }

    private void initView() {
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        mainMap.initImageView(dm.widthPixels, dm.heightPixels - 80);

    }

    @OnClick({R.id.search_cd, R.id.guide_rl, R.id.route_rl, R.id.about})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.search_cd:
                break;
            case R.id.guide_rl:
                Intent toGuide = new Intent(MainActivity.this,GuideActivity.class);
                startActivity(toGuide);
                break;
            case R.id.route_rl:
                startActivity(new Intent(this,RouteActivity.class));
                break;
            case R.id.about:
                startActivity(new Intent(this,AboutMeActivity.class));
                break;
        }
    }
}
