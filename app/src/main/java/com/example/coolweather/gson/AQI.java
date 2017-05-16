package com.example.coolweather.gson;

/**
 * Created by len_titude on 2017/4/26.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
        public String co;
        public String o3;
        public String pm10;
        public String so2;
    }
}
