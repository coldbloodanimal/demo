package com.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LalaAspect {


    @Before("@annotation(Lala)")
    public void doit(){
        System.out.println("lala");
    }
}
