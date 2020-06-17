package com.example.collection;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put(null,"zz");
        System.out.println(map.get(null));
    }
}
