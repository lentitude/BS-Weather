package com.example.coolweather.util;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by len_titude on 2017/4/30.
 */

public class TaskKiller {

    public static List<Activity> activityList = new ArrayList<>();

    public static void addActivity(Activity activity){
        activityList.add(activity);
    }

    public static void dropActivity(Activity activity){
        activityList.remove(activity);
    }

    public static void dropAllAcitivty(){
        for (Activity activity : activityList){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }

}
