package com.example.number;


import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;

public class StrintToNumber {
    public static void main(String[] args) {
        JSONObject jo=new JSONObject();
        jo.put("aa","159,176.01");

//        String ss="159,176.01";
//        System.out.println(BigDecimal.valueOf());
        System.out.println(jo.getBigDecimal("aa"));
    }
}
