package com.example.collection.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: Monster
 * @date: 2019-07-03 15:42
 **/
@Data
public class People {
    private String name;

    public People(String name) {
        this.name = name;
    }
}
