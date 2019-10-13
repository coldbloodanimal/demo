package com.example.thread;

/**
 * @author: Monster
 * @date: 2019-08-28 17:33
 **/
public class Slave implements Runnable{
    //奴隶不配拥有姓名，只有编号
    private int number;
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":"+number+"work for me");
    }
}
