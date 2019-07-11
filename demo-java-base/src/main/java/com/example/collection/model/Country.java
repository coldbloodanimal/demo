package com.example.collection.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.beans.ConstructorProperties;
import java.util.List;

/**
 * @author: Monster
 * @date: 2019-07-03 15:41
 **/
@Data
public class Country {
    private String name;

    private List<Family> families;

    public Country(String name) {
        this.name = name;
    }
}
