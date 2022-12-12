package com.example.thread.pool;

public class Worker extends Thread{
    @Override
    public void run() {
        try {
            Singleton.getSingleton().doit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
