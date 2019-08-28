package com.example.general;

import lombok.Data;

/**
 * @author: Monster
 * @date: 2019-07-23 15:02
 **/
@Data
public class Element<T> {
    T value;
    Element<T> tail;
}
