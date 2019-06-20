package com.example.stream;

import com.example.animal.AminalUtil;
import com.example.animal.Dog;

import java.util.List;

/**
 * @author: Monster
 * @date: 2019-06-15 19:10
 **/
public class StreamTest {
    public static void main(String[] args) {
        List<Dog> dogs= AminalUtil.getDogs();
        dogs.stream().filter(t->t.getAge()==5).forEach(t->{
            t.setSex(1);
            System.out.print(t);
        });

    }
}
