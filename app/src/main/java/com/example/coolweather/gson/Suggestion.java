package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by len_titude on 2017/4/26.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    @SerializedName("drsg")
    public Clothes clothes;

    @SerializedName("flu")
    public Cold cold;


    public UV uv;

    public class UV{
        @SerializedName("txt")
        public String info;

        @SerializedName("brf")
        public String sign;
    }

    public class Cold{
        @SerializedName("txt")
        public String info;

        @SerializedName("brf")
        public String sign;
    }

    public class Clothes{
        @SerializedName("txt")
        public String info;

        @SerializedName("brf")
        public String sign;
    }

    public class Comfort{
        @SerializedName("txt")
        public String info;

        @SerializedName("brf")
        public String sign;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;

        @SerializedName("brf")
        public String sign;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;

        @SerializedName("brf")
        public String sign;
    }
}
