package com.example.animal;

import lombok.Data;

import java.util.List;

/**
 * @author: Monster
 * @date: 2019-08-07 13:32
 **/
@Data
public class People {
    private List<? extends Pig> list;
}
