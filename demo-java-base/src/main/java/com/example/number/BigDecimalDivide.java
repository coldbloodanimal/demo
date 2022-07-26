package com.example.number;

import java.math.BigDecimal;

public class BigDecimalDivide {
    public static void main(String[] args) {
        BigDecimal Dividend = new BigDecimal("1");
        BigDecimal divisor = new BigDecimal("3");
        BigDecimal res1 = Dividend.divide(divisor,3,BigDecimal.ROUND_UP);
        System.out.println("除法ROUND_UP："+res1);
        BigDecimal res2 = Dividend.divide(divisor,3,BigDecimal.ROUND_DOWN);
        System.out.println("除法ROUND_DOWN："+res2);
        BigDecimal res3 = Dividend.divide(divisor,3,BigDecimal.ROUND_CEILING);
        System.out.println("除法ROUND_CEILING："+res3);
        BigDecimal res4 = Dividend.divide(divisor,3,BigDecimal.ROUND_FLOOR);
        System.out.println("除法ROUND_FLOOR："+res4);
        BigDecimal res5 = Dividend.divide(divisor,3,BigDecimal.ROUND_HALF_UP);
        System.out.println("除法ROUND_HALF_UP："+res5);
        BigDecimal res6 = Dividend.divide(divisor,3,BigDecimal.ROUND_HALF_DOWN);
        System.out.println("除法ROUND_HALF_DOWN："+res6);
        BigDecimal res7 = Dividend.divide(divisor,3,BigDecimal.ROUND_HALF_EVEN);
        System.out.println("除法ROUND_HALF_EVEN："+res7);
        BigDecimal res8 = Dividend.divide(divisor,3,BigDecimal.ROUND_UNNECESSARY);
        System.out.println("除法ROUND_UNNECESSARY："+res8);
    }
}
