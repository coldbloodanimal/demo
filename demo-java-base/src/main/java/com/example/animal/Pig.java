package com.example.animal;

import lombok.Data;

/**
 * @author: Monster
 * @date: 2019-06-15 19:14
 **/

@Data
public class Pig implements Animal{
    private String name;
    private int age;
    private int sex;
}
