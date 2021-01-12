package com.example.initial;

public class StaticTest2 {

    static {
        a=2;
    }
    public static int a=3;
    public static void main(String[] args) {
        System.out.println(a);
    }
}
