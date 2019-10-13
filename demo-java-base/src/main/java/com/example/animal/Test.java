package com.example.animal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Monster
 * @date: 2019-08-07 11:43
 **/
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        People people=new People();
        List<Animal> list=new ArrayList<>();

        List<BadPig> pigList=new ArrayList<>();
        List<Dog> dogList=new ArrayList<>();
        BadPig pig=new BadPig();
        pigList.add(pig);
        people.setList(pigList);

        People p2=people.clone();

        pig.setName("badpig");

        System.out.println(people.equals(p2));


        System.out.println(pig.hashCode());


    }


    public static void aa() {
        Animal a=new Dog();

        a=new Pig();

        System.out.println(a);
    }
}



