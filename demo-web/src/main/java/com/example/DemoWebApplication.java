package com.example;

import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication
public class DemoWebApplication {
    @Autowired
    private ServerProperties serverProperties;
    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class, args);
    }

}
