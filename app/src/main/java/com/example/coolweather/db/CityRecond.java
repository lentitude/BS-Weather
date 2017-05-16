package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by len_titude on 2017/5/14.
 */

public class CityRecond  extends DataSupport{
    private int id;
    private String cityName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
