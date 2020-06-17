package com.example.proxy;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHelloWorld() {
        System.out.println("hello world!");
    }

    @Override
    public void sayGoodBye() {
        System.out.println("good bye!");
    }
}