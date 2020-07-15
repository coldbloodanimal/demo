package com.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ZilaAspect {
    @Before("@annotation(Zila)")
    public void doit() {
        System.out.println("zila");
    }
}
