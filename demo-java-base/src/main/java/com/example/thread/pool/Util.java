package com.example.thread.pool;

public class Util {
    public static synchronized void dododod() throws InterruptedException {
        long start=System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+"start:"+start);
        Thread.sleep(2000);
        long end=System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+"end:"+end);
        System.out.println(Thread.currentThread().getName()+"sleep "+(end-start));

    }
}
