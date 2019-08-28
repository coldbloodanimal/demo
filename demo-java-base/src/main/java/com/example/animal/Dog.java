package com.example.animal;

import lombok.Data;

import java.util.Optional;

/**
 * @author: Monster
 * @date: 2019-06-15 19:14
 **/

@Data
public class Dog implements Animal{
    private String name;
    private int age;
    private int sex;
}
