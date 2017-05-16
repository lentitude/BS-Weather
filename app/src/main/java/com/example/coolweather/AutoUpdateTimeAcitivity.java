package com.example.coolweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.coolweather.service.AutoUpdateService;

public class AutoUpdateTimeAcitivity extends BaseActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button5;
    private Button button10;
    private Button button0;

    @Override
    public void initView() {
        setContentView(R.layout.activity_auto_update_time);

        Toolbar toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("更新频率");
        }
        button0 = (Button)findViewById(R.id.hour0);
        button1 =(Button)findViewById(R.id.hour1);
        button2 = (Button)findViewById(R.id.hour2);
        button3 = (Button)findViewById(R.id.hour3);
        button5 = (Button)findViewById(R.id.hour5);
        button10 = (Button)findViewById(R.id.hour10);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {
        button0.setOnClickListener(this);
        button2.setOnClickListener(this);
        button1.setOnClickListener(this);
        button3.setOnClickListener(this);
        button5.setOnClickListener(this);
        button10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(this).edit();
        switch (v.getId()){
            case R.id.hour0:
                editor.putBoolean("isUpdateTime", false);
                break;
            case R.id.hour1:
                editor.putBoolean("isUpdateTime",true);
                editor.putInt("autoUpdateTime", 60);
                break;
            case R.id.hour2:
                editor.putBoolean("isUpdateTime",true);
                editor.putInt("autoUpdateTime", 120);
                break;
            case R.id.hour3:
                editor.putBoolean("isUpdateTime",true);
                editor.putInt("autoUpdateTime", 180);
                break;
            case R.id.hour5:
                editor.putBoolean("isUpdateTime",true);
                editor.putInt("autoUpdateTime", 300);
                break;
            case R.id.hour10:
                editor.putBoolean("isUpdateTime",true);
                editor.putInt("autoUpdateTime", 600);
                break;
            default:

        }
        editor.apply();
        Intent intent = new Intent(this, AutoUpdateService.class);
        startService(intent);
        showShort("设置成功");
        finish();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
            default:
        }
        return true;
    }
}
