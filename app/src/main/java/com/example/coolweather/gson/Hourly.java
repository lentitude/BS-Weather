package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by len_titude on 2017/5/13.
 */

public class Hourly {

    public Cond cond;

    public class Cond{

        public String code;

        public String txt;

    }

    public String date;

    public String tmp;
}
