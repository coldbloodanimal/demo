package com.example.designpatterns.state;

/**
 * @author: Monster
 * @date: 2019-05-28 15:33
 **/
public class FullMoonState implements MoonState{
    MoonState moonState;
    @Override
    public MoonState next() {
        System.out.print("full ……");
        moonState=new HalfMoonState();
        return moonState;
    }
}
