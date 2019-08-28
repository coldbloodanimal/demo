package com.example.lambda;

/**
 * @author: Monster
 * @date: 2019-07-17 09:56
 **/
@FunctionalInterface
public interface SimpleLambdaInterface {
    void oba(String s1,String s2);

    default void lala(){
        System.out.println("lala");
    }
}
