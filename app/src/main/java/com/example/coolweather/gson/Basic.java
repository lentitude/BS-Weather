package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by len_titude on 2017/4/26.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public  Update update;

    public class Update{
        public String loc;

    }


}
