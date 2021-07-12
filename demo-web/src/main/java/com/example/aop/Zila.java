package com.example.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
//这个注解会一直保留到运行时，实可以通过反射访问的
@Retention(RetentionPolicy.RUNTIME)
public @interface Zila {
}
