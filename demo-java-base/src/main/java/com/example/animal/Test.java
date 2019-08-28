package com.example.animal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Monster
 * @date: 2019-08-07 11:43
 **/
public class Test {
    public static void main(String[] args) {
        People people=new People();
        List<Animal> list=new ArrayList<>();

        List<BadPig> pigList=new ArrayList<>();
        List<Dog> dogList=new ArrayList<>();

        pigList.add(new BadPig());
        people.setList(pigList);


    }


    public static void aa() {
        Animal a=new Dog();

        a=new Pig();

        System.out.println(a);
    }
}



