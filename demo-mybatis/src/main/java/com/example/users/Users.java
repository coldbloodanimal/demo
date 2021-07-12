package com.example.users;

import lombok.Data;

import java.util.Date;
@Data
public class Users {
    private String id;

    private String username;

    private String password;

    private Date createDate;

    private String createUser;

    private String updateUser;
}