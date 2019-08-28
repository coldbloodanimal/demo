package com.example.general;

/**
 * @author: Monster
 * @date: 2019-07-23 14:22
 **/
public class MyBox<T> {
    T t;


    public void add(T t){
        this.t=t;
    }

    public T get(){
        return this.t;
    }
}
