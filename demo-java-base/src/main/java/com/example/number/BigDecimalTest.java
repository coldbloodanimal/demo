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

        System.out.println(BigDecimal.ZERO.compareTo(new BigDecimal("0.0")));

        System.out.println(BigDecimal.TEN.add(new BigDecimal(5)).multiply(new BigDecimal(2)));




    }

    public static void test(){
        BigDecimal bigDecimal=BigDecimal.ONE;
        bigDecimal=bigDecimal.add(BigDecimal.TEN);
        System.out.println(BigDecimal.ZERO.compareTo(null));
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

    public static void freight(){
        //总运费
        BigDecimal totalFreight=new BigDecimal(0.5);
        //商品总价
        BigDecimal totalPrice=new BigDecimal(0.04);
        //商品1价格
        BigDecimal singlePrice=new BigDecimal(0.01);
        //商品2价格
        BigDecimal singlePrice2=new BigDecimal(0.03);
        BigDecimal singleFreight=singlePrice.multiply(totalFreight).divide(totalPrice,2,BigDecimal.ROUND_HALF_UP);
        BigDecimal singleFreight2=singlePrice2.multiply(totalFreight).divide(totalPrice,2,BigDecimal.ROUND_HALF_UP);
        System.out.println(singleFreight.toString());
        System.out.println(singleFreight2.toString());

    }

}
