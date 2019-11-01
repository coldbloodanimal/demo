package com.example.general;

import java.math.BigDecimal;

/**
 * @author: Monster
 * @date: 2019-10-17 21:49
 **/
public class MethodGeneric<T> {
    public static void main(String[] args) {
        MethodGeneric<BigDecimal> a=new MethodGeneric<>();
        a.setT(BigDecimal.ONE);
        System.out.println(a.getT());
    }
    private T t;

    public void setT(T t) {
        this.t=t;
    }

    public T getT(){
        return this.t;
    }
}
