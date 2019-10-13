package com.example.animal;

import lombok.Data;

import java.util.List;

/**
 * @author: Monster
 * @date: 2019-08-07 13:32
 **/
@Data
public class People implements Cloneable{
    private List<? extends Pig> list;
    private List<Dog> dogs;
    @Override
    public People clone() throws CloneNotSupportedException {
        People people=(People)super.clone();
        return people;
    }
}
