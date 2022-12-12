package com.example.serviceImpl;

import com.example.service.Animal;
import org.springframework.stereotype.Service;

@Service
public class Pig implements Animal {
    @Override
    public String speak() {
        return "pig language";
    }
}
