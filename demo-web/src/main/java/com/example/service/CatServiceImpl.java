package com.example.service;

import org.springframework.stereotype.Service;

/**
 * @author: Monster
 * @date: 2019-07-16 10:20
 **/
@Service
public class CatServiceImpl implements AnimalService {
    @Override
    public String speak() {
        System.out.println("cat speak");
        return "cat";
    }
}
