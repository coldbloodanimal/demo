package com.example.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: Monster
 * @date: 2019-11-01 14:59
 **/
@Component
@Data
//下面注解未生效
//@ConfigurationProperties(
//        prefix = "app",
//        ignoreUnknownFields = true
//)
public class BaseConfig {
    @Value("${app.version}")
    private String version;

    private String name;
}
