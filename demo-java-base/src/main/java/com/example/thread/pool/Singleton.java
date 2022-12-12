package com.example.thread.pool;

public class Singleton {

    private static Singleton singleton=null;

    private Singleton(){

    }

    public static Singleton getSingleton(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
    public synchronized void doit() throws InterruptedException {
        long start=System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+"start:"+start);
        Thread.sleep(2000);
        long end=System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+"end:"+end);
        System.out.println(Thread.currentThread().getName()+"sleep "+(end-start));

    }
}
