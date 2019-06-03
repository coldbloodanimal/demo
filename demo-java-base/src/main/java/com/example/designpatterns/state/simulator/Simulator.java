package com.example.designpatterns.state.simulator;

import com.example.designpatterns.state.HalfMoonState;
import com.example.designpatterns.state.MoonState;

/**
 * @author: Monster
 * @date: 2019-05-28 15:34
 **/
public class Simulator {


    public static void main(String[] args) {
        MoonState state=new HalfMoonState();
        for (int i = 0; i < 10; i++) {
            state= state.next();
        }


    }
}
