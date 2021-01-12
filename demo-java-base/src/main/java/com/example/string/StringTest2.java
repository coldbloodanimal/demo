package com.example.string;

import com.example.collection.HashMapTest;

import java.util.HashMap;
import java.util.Map;

public class StringTest2 {
    public static void main(String[] args) {
        String a1="null";
        String a2="";
        String a3=null;

        Object c1="null";
        Object c2="";
        Object c3=null;

        Map<String,Object> map2=new HashMap<>();
        map2.put("d1",c1);
        map2.put("d2",c2);
        map2.put("d3",c3);

        Map<String,Object> map=new HashMap<>();
        map.put("b1","null");
        map.put("b2","");
        map.put("b3",null);

        System.out.println("hi");
    }
}
