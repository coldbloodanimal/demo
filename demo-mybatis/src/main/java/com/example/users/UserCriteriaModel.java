package com.example.users;

import lombok.Data;

import java.util.Date;

@Data
public class UserCriteriaModel {
    private String id;

    private String username;

    private Date startTime;

    private Date endTime;

    private String[] status;

    private String period;
}