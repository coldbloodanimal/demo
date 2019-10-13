package com.example.thread;

import sun.java2d.loops.GraphicsPrimitive;

/**
 * @author: Monster
 * @date: 2019-08-28 17:36
 **/
public class Slaver {
    public static void main(String[] args) {
        Runnable slave=new Slave();
        for(int i=1000;i>0;i--){
            ((Slave) slave).setNumber(i);
            Thread t=new Thread(slave);
            t.setName("slave"+i);
            t.start();
        }
    }
}
