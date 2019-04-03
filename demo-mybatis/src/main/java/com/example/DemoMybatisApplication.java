package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value="com.example")
@SpringBootApplication
public class DemoMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMybatisApplication.class, args);
    }

}
