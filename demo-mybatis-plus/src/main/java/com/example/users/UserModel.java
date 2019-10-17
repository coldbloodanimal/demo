package com.example.users;

import lombok.Data;

import java.util.Date;

@Data
public class UserModel {
    private String id;

    private String username;

    private String password;

    private Date createDate;

    private Date startTime;

    private Date endTime;
}