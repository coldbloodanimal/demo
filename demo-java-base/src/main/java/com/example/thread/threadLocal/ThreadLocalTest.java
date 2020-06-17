package com.example.thread.threadLocal;

/**
 * @author: Monster
 * @date: 2019-08-28 10:30
 **/
public class ThreadLocalTest {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();
        ThreadLocal threadLocal=new ThreadLocal();
        Object o=new Object();
        threadLocal.set(o);
        Object z=threadLocal.get();
        System.out.println(z);

    }
}
