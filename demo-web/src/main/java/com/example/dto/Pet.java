package com.example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Pet {
    // 姓名
    private String name;
    private int age;
    @JsonFormat
    private Date birthDay;
    private Boolean live;
}
