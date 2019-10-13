package com.example.time;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: Monster
 * @date: 2019-09-05 14:40
 **/
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        Date startTime=calendar.getTime();
        System.out.println(startTime);

        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        Date endTime=calendar.getTime();
        System.out.println(endTime);
    }
}
