package com.example.number;

import java.math.BigDecimal;

public class BigDecimalBaseTest {
    public static void main(String[] args) {
        BigDecimal a=BigDecimal.ONE;
        BigDecimal b=new BigDecimal(3.14);

        System.out.println(b.intValue());
        //加
        System.out.println(a.add(b));
        //减
        System.out.println(a.subtract(b));
        //乘法
        System.out.println(a.multiply(b));
        //出发
        System.out.println(a.divide(b,5,BigDecimal.ROUND_HALF_UP));
    }
}
