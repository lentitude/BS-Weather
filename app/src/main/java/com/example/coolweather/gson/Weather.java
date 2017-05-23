package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by len_titude on 2017/4/26.
 */

public class Weather {

    public String status;

    public Alarms alarms;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    @SerializedName("hourly_forecast")
    public List<Hourly> hourlyList;
}
