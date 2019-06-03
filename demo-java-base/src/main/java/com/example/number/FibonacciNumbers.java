package com.example.number;

/**
 * @author: Monster
 * @date: 2019-05-20 14:37
 **/
public class FibonacciNumbers {
    public static void main(String[] args) {
        fib(0,1,10);
    }

    public static void fib(int a,int b,int level){
        System.out.print(b+" ");
        if(level>=0){
            fib(b,a+b,level-1);
        }

    }
}
