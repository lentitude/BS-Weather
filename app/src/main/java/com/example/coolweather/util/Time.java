package com.example.coolweather.util;

import org.joda.time.DateTime;

import static android.R.attr.value;

/**
 * Created by len_titude on 2017/5/9.
 */

public class Time {
    /**
     * 输入时间 XXXX-XX-XX 的字符串, 放回中文指代的时间, 比如 "今天 02/09"
     */
    public static String parseTime(String timeText){
        DateTime dateTime = new DateTime();
        String[] time = timeText.split("-");

        int currentMonth = dateTime.getMonthOfYear();
        int currentDay = dateTime.getDayOfMonth();
        int currentWeak = dateTime.getDayOfWeek();
        int currentYear = dateTime.getYear();

        int month = Integer.parseInt(time[1]);
        int day = Integer.parseInt(time[2]);
        int year = Integer.parseInt(time[0]);

        int offset = 0;  // 相差量

        if (year == currentYear){
            //如果是同一年：
            if (month == currentMonth){
                // 如果是同一个月
                offset = day - currentDay;

            }else{
                offset = day + parseMonth(currentMonth, currentYear) - currentDay;
            }

        }else{
            offset = 31 - currentDay + day;
        }



        String monthAndDay = time[1] + "/" + time[2];
        if (offset == 0) return "今天 " + monthAndDay;
        if (offset == 1) return  "明天 " + monthAndDay;
        return parseWeak(currentWeak + offset) + " " + monthAndDay;

    }

    /**
     * 输入一个数字, 输出是星期几的字符串: 2  ->  周二
     */
    public static String parseWeak(int weak){
        String[] weakday = new String[]{"周一", "周二", "周三", "周四", "周五", "周六", "周日"};
        int index = (weak - 1)%7;
        return weakday[index];
    }

    /**
     * 输入月份和年份, 输出该月份的天数
     */
    public static int parseMonth(int month, int year){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:return 31;
            case 2:
                if (parseYear(year)) {
                    return 29;
                }
                return 28;
            default:
                return 30;
        }
    }


    /**
     * 输入年份, 判断是否是闰年
     */
    public static boolean parseYear(int year){
        String yearOfString = String.valueOf(year);
        int len = yearOfString.length();
        char lastOne = yearOfString.charAt(len - 1);
        char lastTwo = yearOfString.charAt(len - 2);
        if (lastOne == lastTwo && lastOne == '0'){
            if (year % 400 == 0){
                return true;
            }else{
                return false;
            }
        }

        if (year % 4 == 0){
            return true;
        }else{
            return false;
        }

    }

}
