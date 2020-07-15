package com.example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author: Monster
 * @date: 2019-05-30 16:49
 **/
@Data
public class People {
    // 姓名
    private String name;
    private int age;
    private List<Pet> pets;
    @JsonFormat
    private Date birthDay;
}
