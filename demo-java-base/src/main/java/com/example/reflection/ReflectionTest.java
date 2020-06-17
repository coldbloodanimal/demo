package com.example.reflection;

import java.lang.reflect.Field;

public class ReflectionTest {
    public static void main(String[] args) {
        ReflectionApple ra=new ReflectionApple();
        Class<?> clazz=ra.getClass();

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
