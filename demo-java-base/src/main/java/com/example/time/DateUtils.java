package com.example.time;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Monster
 * @date: 2019-09-05 17:22
 **/
public class DateUtils {
    public static void main(String[] args) {
        int i=0;
        Map map=new HashMap();
        map.put("key",++i);
        System.out.println(map.get("key"));
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));

        Date date=new Date();

        System.out.println(DateUtils.getThatDayStartTime(date));
        System.out.println(DateUtils.getThatDayEndTime(date));

//        getTodayStartTime();
//        System.out.println(getTodayStartTime());
//        System.out.println(getTodayEndTime());
//        System.out.println(getTodayStartDate());
//        System.out.println(getYeserdayStartDate());
    }

    public static Date getTodayStartDate(int i) {
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        Date startTime=calendar.getTime();
        return startTime;
    }

    public static Date getYeserdayStartDate() {
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR,calendar.get(Calendar.DAY_OF_YEAR)-1);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        Date startTime=calendar.getTime();
        return startTime;
    }

    public static Date getTodayStartDate() {
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        Date startTime=calendar.getTime();
        return startTime;
    }

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



    /**
     * 获得那天开始时间
     * */
    public static Date getThatDayStartTime(Date date) {
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        Date startTime=calendar.getTime();
        return startTime;
    }

    /**
     * 获得那天开始时间
     * */
    public static Date getThatDayEndTime(Date date) {
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        Date startTime=calendar.getTime();
        return startTime;
    }
}
