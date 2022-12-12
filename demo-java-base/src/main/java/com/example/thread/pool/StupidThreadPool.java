package com.example.thread.pool;

public class StupidThreadPool {
    public static void main(String[] args) {
        Worker worker1=new Worker();
        Worker worker2=new Worker();
        Worker worker3=new Worker();
        long start=System.currentTimeMillis();
        System.out.println("main:start"+start);
        worker1.start();
        worker2.start();
        worker3.start();
        long end=System.currentTimeMillis();
        System.out.println("main:end"+end);
        System.out.println(end-start);

    }
}
