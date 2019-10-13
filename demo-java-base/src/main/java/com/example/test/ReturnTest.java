package com.example.test;

/**
 * @author: Monster
 * @date: 2019-09-24 16:40
 **/
public class ReturnTest {
    public static void main(String[] args) {
        Boolean flag=returnTest(true);
    }

    private static Boolean returnTest(boolean b) {
        if(b){
             return true;
        }
        return false;
    }


}
