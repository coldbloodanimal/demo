package com.example.number;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Monster
 * @date: 2019-06-06 13:46
 **/
public class BigDecimalTest {
    public static void main(String[] args) {
        compare();
    }


    public static void listAddTest(){
        List<BigDecimal> list=new ArrayList<>();
        list.add(new BigDecimal(0.34));
        list.add(new BigDecimal(520.36));
        list.add(new BigDecimal(989.693));
        BigDecimal result=new BigDecimal(0);
        System.out.print(result);
    }


    public static void divide(){
        BigDecimal result= BigDecimal.TEN.divide(new BigDecimal(3));
        System.out.print(result);
    }

    public static void divideGood(){
        BigDecimal result= BigDecimal.TEN.divide(new BigDecimal(3),2, RoundingMode.HALF_EVEN);
        System.out.print(result);
    }

    public static void compare(){
        BigDecimal a=new BigDecimal(0.34);
        BigDecimal b=new BigDecimal(1.34);
        System.out.print(a.compareTo(b));
    }
}
