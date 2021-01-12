package com.example.test;

import java.util.Arrays;
import java.util.List;

public class OrderByTest {
    public static void main(String[] args) {
        Integer[] num={2918956,3074102,2887361,2919143,2870404,3086500,2889436,2889102,1232869,2920910,2889734,2894739,2883687,2896996,3065633,2869333,2907710,2908830,2878032};

        Integer[] num2={2889436,3065633,2919143,2878032,2883687,2907710,2908830,3086500,2870404,2887361,2918956,3074102,2869333,2889102,2894739,2896996,2920910};

        List<Integer> num2list=Arrays.asList(num2);
        for (Integer integer : num) {
            if(!num2list.contains(integer)){
                System.out.println(integer);
            }
        }
        Arrays.sort(num);
        Arrays.sort(num2);
        System.out.println(num);
        System.out.println(num2);
    }
}
