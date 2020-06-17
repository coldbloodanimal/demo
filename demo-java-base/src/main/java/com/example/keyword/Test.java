package com.example.keyword;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println();
        FinalTest t=new FinalTest();


        Class<?> clazz=t.getClass();
        Field[] fields=clazz.getDeclaredFields();
        fields[0].setAccessible(true);
        fields[0].set(t,"aa");

        System.out.println(t.o);

        fields[0].set(t,"bb");

        System.out.println(t.o);
    }
}
