package com.example.time;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author: Monster
 * @date: 2019-06-28 11:45
 **/
public class TimestampTest {
    public static void main(String[] args) {
        LocalDateTime maxtime=LocalDateTime.MAX;
        Timestamp maxTimeStamp=Timestamp.valueOf(maxtime);
        System.out.println(maxTimeStamp);
        System.out.println(maxTimeStamp.toString());

        LocalDateTime mintime=LocalDateTime.MIN;
        System.out.println(Timestamp.valueOf(mintime));
    }
}
