package com.example.model;

import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.Data;

/**
 * @author: Monster
 * @date: 2019-08-13 14:27
 **/
@Data
public class Man {
    private String name;
    @JsonRawValue
    private String pets;
}
