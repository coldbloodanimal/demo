package com.example.test;

/**
 * @author: Monster
 * @date: 2019-11-19 09:29
 **/
public class IfTest {
    public static void main(String[] args) {

        if(null==null){
            System.out.println("lala:"+true);
        }
        new Thread().start();
        System.out.println();

        int a=10;
        if(a>2){
            System.out.println(">2");
        }else if(a>5){
            System.out.println(">5");
        }
    }

}
