package com.example.util;

public class ThreadUtil {
    public static void printThreadInfo(){
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup());
    }
}
