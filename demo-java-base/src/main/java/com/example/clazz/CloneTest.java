package com.example.clazz;

import com.example.animal.Dog;

/**
 * @author: Monster
 * @date: 2019-09-09 14:03
 **/
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog d=new Dog();
        d.setSex(1);
        d.setAge(1);
        d.setName("habagou");

        Dog dd=d.clone();
        dd.setName("clonehahagou");

        System.out.println(d.getClass().equals(dd.getClass()));

    }
}
