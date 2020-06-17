package com.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyProxyTest {
    public static void main(String[] args) {
        InvocationHandler invocationHandler=new MyAdvice();
        HelloService helloService= (HelloService) Proxy.newProxyInstance(MyProxyTest.class.getClassLoader(),
                new Class[]{HelloService.class},invocationHandler);
        helloService.sayHelloWorld();
        helloService.sayGoodBye();

    }
}
