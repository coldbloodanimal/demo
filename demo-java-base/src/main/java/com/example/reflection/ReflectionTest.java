package com.example.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) {
        ReflectionApple ra=new ReflectionApple();
        Class<?> clazz=ra.getClass();

        Method[] methods=clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        Field[] fields=clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                field.set(ra,"aa");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println(ra.getColor());
        System.out.println(ra.getName());
    }
}
