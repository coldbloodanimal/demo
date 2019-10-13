package com.example.exception;

/**
 * @author: Monster
 * @date: 2019-09-17 12:07
 **/
public class RuntimeExceptionTest {
    public static void main(String[] args) {
        System.out.println("aa");
        doRuntimeException();
        System.out.println("dd");
    }

    private static void doRuntimeException() {
        throw new RuntimeException("runtimeException");
    }
}
