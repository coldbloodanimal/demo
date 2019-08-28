package com.example.general;

/**
 * @author: Monster
 * @date: 2019-08-13 17:12
 **/
public class MyMapTest {
    public static void main(String[] args) {
        MyMap<String,String> map=new MyMap<>();
        map.add("xiaoming","whatabadguy");
        map.add("xiaohong","whatabadgirl");
        String name=map.get("xiaohong");
        System.out.println(name);
    }
}
