package com.example.service;

import org.springframework.stereotype.Service;

/**
 * @author: Monster
 * @date: 2019-07-16 10:20
 **/
@Service
public class DogServiceImpl implements AnimalService{
    @Override
    public String speak() {
        System.out.println("dog speak");
        return "dog";
    }
}
