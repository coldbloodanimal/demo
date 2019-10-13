package com.example.string;

import org.springframework.util.StringUtils;

/**
 * @author: Monster
 * @date: 2019-09-17 18:01
 **/
public class StringAndLongCompareTest {
    public static void main(String[] args) {
        String ss="16";
        Long ll=16L;
        System.out.println(StringAndLongCompareTest.compareAsString(ss,ll));

    }
    public static boolean compareAsString(Object left,Object right){

        if(left==null){
            left="";
        }
        if(right==null){
            right="";
        }
        System.out.println(left.getClass().getSimpleName());
        System.out.println(right.getClass().getSimpleName());
        return String.valueOf(left).equals(String.valueOf(right));
    }
}
