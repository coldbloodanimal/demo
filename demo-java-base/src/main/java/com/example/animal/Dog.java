package com.example.animal;

import lombok.Data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

/**
 * @author: Monster
 * @date: 2019-06-15 19:14
 **/

@Data
public class Dog implements Animal,Cloneable{
    private String name;
    private int age;
    private int sex;

    @Override
    public Dog clone() throws CloneNotSupportedException {
        Dog dog=(Dog)super.clone();
        return dog;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {


    }


    public static String getName(String[] args) throws InvocationTargetException, IllegalAccessException {
        String zz="lla";
        Object o=new Dog();
        ((Dog) o).setName("heihei");
        Method method= null;
        try {
            method = o.getClass().getDeclaredMethod("getNamezz");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }finally {
            ;
        }
        String name= (String) method.invoke(o);
        System.out.println(name);
        return name;
    }



}
