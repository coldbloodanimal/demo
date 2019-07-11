package com.example.collection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * @author: Monster
 * @date: 2019-07-03 15:41
 **/
@Data
public class Family {
    private String name;

    private List<People> peoples;

    public Family(String name) {
        this.name = name;
    }
}
