package com.example.time;

import java.util.Calendar;
import java.util.Date;

/**
 * @author: Monster
 * @date: 2019-09-05 17:22
 **/
public class DateUtils {

    public static Long getTodayStartTime() {
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        Date startTime=calendar.getTime();
        return startTime.getTime();
    }

    public static Long getTodayEndTime() {
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        Date startTime=calendar.getTime();
        return startTime.getTime();
    }

    public static void main(String[] args) {
        getTodayStartTime();
        System.out.println(getTodayStartTime());
        System.out.println(getTodayEndTime());
    }
}
