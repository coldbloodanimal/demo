package com.example.string;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class JSONObject {
    public static void main(String[] args) {
        Map<String,Object> result=new HashMap<>();
        String ss="{\"code\":\"200\",\"msg\":\"success\",\"data\":{\"records\":[{\"id\":\"660d3692e967b81303ef36de47335c6f\",\"createTime\":\"2022-05-19 18:21:04\",\"updateTime\":\"2022-05-19 18:21:04\",\"current\":0,\"size\":0,\"name\":\"乔峰\",\"gender\":\"女\",\"age\":28,\"email\":\"wx@qq.com\",\"phone\":\"13201122530\",\"orgId\":null,\"description\":\"jingjing\",\"tenantId\":null,\"isDeleted\":null},{\"id\":\"cddcf8d2856c40dd382d72f5e66da848\",\"createTime\":\"2022-03-28 09:41:06\",\"updateTime\":\"2022-06-24 17:43:55\",\"current\":0,\"size\":0,\"name\":\"小红1\",\"gender\":\"女\",\"age\":21,\"email\":\"dush@163.com\",\"phone\":\"18783764752\",\"orgId\":null,\"description\":\"xdbxusb\",\"tenantId\":null,\"isDeleted\":0},{\"id\":\"d5e1137514be473c873bf30e14325e0e\",\"createTime\":\"2022-01-14 14:59:54\",\"updateTime\":\"2022-06-24 18:09:45\",\"current\":0,\"size\":0,\"name\":\"阿紫\",\"gender\":\"男\",\"age\":22,\"email\":\"lisi@qq.com\",\"phone\":\"13712345678\",\"orgId\":\"1\",\"description\":\"开发部李四\",\"tenantId\":\"1\",\"isDeleted\":1},{\"id\":\"e2ab1960cd737111154d46878b5bccbb\",\"createTime\":\"2022-04-27 16:05:01\",\"updateTime\":\"2022-06-24 18:09:48\",\"current\":0,\"size\":0,\"name\":\"东方不败\",\"gender\":\"女\",\"age\":39,\"email\":\"lili@qq.com\",\"phone\":\"13201122222\",\"orgId\":\"22\",\"description\":null,\"tenantId\":\"1111111\",\"isDeleted\":null}],\"total\":4,\"size\":10,\"current\":1,\"orders\":[],\"optimizeCountSql\":true,\"searchCount\":true,\"countId\":null,\"maxLimit\":null,\"pages\":1},\"success\":true}";
        result= JSON.parseObject(ss);
        System.out.println(result);
    }
}
