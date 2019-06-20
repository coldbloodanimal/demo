package com.example.collection;

import java.util.Arrays;

/**
 * @author: Monster
 * @date: 2019-06-10 11:28
 **/
public class ArrayOrObjectTest {
    public static void main(String[] args) {
        int[] a=new int[]{5,6,7};

        doit(0);
    }

    public static void doit(int... a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
