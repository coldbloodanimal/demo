package com.example.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Monster
 * @date: 2019-07-08 15:41
 **/
@Data
public class KeyValueModel implements Serializable {
    private String id;
    private String key;

    private String value;
}
