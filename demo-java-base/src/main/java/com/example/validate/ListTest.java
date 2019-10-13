package com.example.validate;

import com.example.animal.Dog;
import com.example.animal.People;

/**
 * @author: Monster
 * @date: 2019-09-18 10:56
 **/
public class ListTest {
    public static void main(String[] args) {
        People people=new People();
        for (Dog dog : people.getDogs()) {
            System.out.println(dog.getName());
        }
    }
}
