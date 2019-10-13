package com.example.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author: Monster
 * @date: 2019-05-30 16:49
 **/
@Data
public class People implements Serializable {
    private String name;
    private int age;
    private List<Pet> pets;
}
