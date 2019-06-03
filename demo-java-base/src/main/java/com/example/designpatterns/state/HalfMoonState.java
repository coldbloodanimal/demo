package com.example.designpatterns.state;

/**
 * @author: Monster
 * @date: 2019-05-28 15:34
 **/
public class HalfMoonState implements MoonState{
    MoonState moonState;
    @Override
    public MoonState next() {
        System.out.print("half ……");
        moonState=new FullMoonState();
        return moonState;
    }
}
