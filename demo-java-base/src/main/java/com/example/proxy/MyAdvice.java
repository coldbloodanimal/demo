package com.example.proxy;

import java.lang.reflect.Method;

public class MyAdvice implements Advice {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("gigi");
        return null;
    }
}
