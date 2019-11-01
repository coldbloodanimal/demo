package com.example.number;

/**
 * @author: Monster
 * @date: 2019-07-12 10:26
 **/
public class IntegerTest {
    public static void main(String[] args) {
        Integer a=2;
        Integer b=null;
        System.out.println(b.intValue());
        if(a==b.intValue()){
            System.out.println(true);
        }


    }

    public static void dd() {
        Integer cc=null;
        int c=cc;
        System.out.println(c);
        int a=2147483647+1;



        System.out.println(a);
        System.out.println(Integer.MIN_VALUE);
    }
}
