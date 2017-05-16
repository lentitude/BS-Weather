package com.example.coolweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SettingActivity extends BaseActivity{

    private Button chooseArea;
    private Button aboutApplication;
    private Button autoUpdateTime;

    @Override
    public void initView() {
        setContentView(R.layout.activity_setting);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_setting);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("设置");
        }

        chooseArea = (Button)findViewById(R.id.choose_area);
        aboutApplication = (Button)findViewById(R.id.about_app);
        autoUpdateTime = (Button)findViewById(R.id.auto_update_time);
    }

    @Override
    public void initListener() {
        chooseArea.setOnClickListener(this);
        aboutApplication.setOnClickListener(this);
        autoUpdateTime.setOnClickListener(this);
    }

    @Override
    public void initData() {
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.choose_area:
                // 跳转到选择地区界面
                actionStart(ChooseAreaActivity.class);
                break;
            case R.id.about_app:
                // 跳转到关于天气界面
                actionStart(AboutApplicationActivity.class);
                break;
            case R.id.auto_update_time:
                //跳转到自动更新频率界面
                actionStart(AutoUpdateTimeAcitivity.class);
                break;
            default:

        }
    }

    public void actionStart(Class<?> c){
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }
}
