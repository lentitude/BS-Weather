package com.example.coolweather;

import android.content.Context;
import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SuggestionInfoActivity extends BaseActivity {

    private TextView suggestText;
    private TextView suggestTitle;


    private String info;
    private String sign;
    private String source;

    @Override
    public void initView() {
        setContentView(R.layout.activity_suggestion_info);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_suggestion_info);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        suggestText = (TextView)findViewById(R.id.suggestion_text);
        suggestTitle = (TextView)findViewById(R.id.suggestion_title);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        info = getIntent().getStringExtra("info");
        sign = getIntent().getStringExtra("sign");
        source = getIntent().getStringExtra("source");

        getSupportActionBar().setTitle(source);
        suggestTitle.setText(sign);
        suggestTitle.getPaint().setFakeBoldText(true);
        suggestText.setText(info);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
        }
        return true;
    }


    @Override
    public void onClick(View v) {

    }

    public static void actionStart(Context context, String info, String sign, String source){
        Intent intent = new Intent(context, SuggestionInfoActivity.class);
        intent.putExtra("info", info);
        intent.putExtra("sign", sign);
        intent.putExtra("source", source);
        context.startActivity(intent);
    }
}
