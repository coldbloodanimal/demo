package com.example.lambda;

import com.example.animal.Dog;
import com.example.animal.Pig;
import org.springframework.util.StringUtils;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setName("hashiqi");
        Pig pig=new Pig();
        pig.setName("peppa");
        Pig pig2=null;

        System.out.println(Optional.of(dog).orElse(new Dog()).getName());
        String name=Optional.ofNullable(pig2).orElse(new Pig()).getName();

        System.out.println(StringUtils.isEmpty(name)?"":name);
    }
}
