package com.example.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author: Monster
 * @date: 2019-05-30 16:49
 **/
@ApiModel("人类")
@Data
public class People {
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("年龄")
    private int age;
    private List<Pet> pets;
}
