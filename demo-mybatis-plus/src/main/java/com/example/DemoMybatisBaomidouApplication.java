package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example")
@SpringBootApplication
public class DemoMybatisBaomidouApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMybatisBaomidouApplication.class, args);
    }


}
