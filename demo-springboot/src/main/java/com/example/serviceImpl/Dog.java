package com.example.serviceImpl;

import com.example.service.Animal;
import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal {
    @Override
    public String speak() {
        return "dog language";
    }
}
