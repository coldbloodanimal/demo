package com.example.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Monster
 * @date: 2019-10-30 11:26
 **/
public class DateTimeTest {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        System.out.println(new SimpleDateFormat().format(date));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
    }
}
