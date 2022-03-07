package com.example.reflection;

import lombok.Data;

@Data
/**
 *
 * */
public class ResultDTO {
    //状态码
    private String returnCode;

    //业务执行说明
    private String returnMsg;

    //当天剩余访问次数
    private String todayRemainVisitCount;
}
