package com.kevin.cqsubway.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.kevin.cqsubway.R;
import com.kevin.cqsubway.ui.adapter.AboutMeAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by xianling on 2016/12/19.
 */
public class AboutMeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private AboutMeAdapter adapter;
    private static final int ABOUT_ME_HELP = 0;
    private static final int ABOUT_ME_FUNCTION = 1;
    private static final int ABOUT_ME_CALL = 2;
    private MaterialDialog dialog;
    private int[] ints = {R.string.help_CQSubway, R.string.functin_CQSubway, R.string.call_CQSubway};
    @Bind(R.id.lv_activity_about_me)
    ListView lv_activity_about_me;
    @Bind(R.id.tv_app_verson)
    TextView tv_app_verson;
    @Bind(R.id.guide_back)
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        ButterKnife.bind(this);
        initView();
    }
    private void initView() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        adapter = new AboutMeAdapter(this, ints);
        lv_activity_about_me.setOnItemClickListener(this);
        lv_activity_about_me.setAdapter(adapter);
        dialog = new MaterialDialog.Builder(this)
                .cancelable(true)
                .build();
        //tv_app_verson.setText(getVersion());
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        switch (position){
            case ABOUT_ME_HELP:
                dialog.setTitle(R.string.help_CQSubway);
                dialog.setContent(R.string.help_CQSubway_content);
                dialog.show();
                break;
            case ABOUT_ME_FUNCTION:
                dialog.setTitle(R.string.functin_CQSubway);
                dialog.setContent(R.string.functin_CQSubway_content);
                dialog.show();
                break;
            case ABOUT_ME_CALL:
                dialog.setTitle(R.string.call_CQSubway);
                dialog.setContent(R.string.call_CQSubway_content);
                dialog.show();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        dialog.cancel();
        dialog = null;
    }
}
