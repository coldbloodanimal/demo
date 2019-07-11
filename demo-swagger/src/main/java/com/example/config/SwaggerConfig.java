package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * @author: Monster
 * @date: 2019-07-01 19:40
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        Contact concat=new Contact("name", "名字想好没", "gancy.programmer@gmail.com");
        ApiInfo apiInfo = new ApiInfo(
                "Spring Boot 项目集成 Swagger 实例文档",
                "测试" +
                        "",
                "API V1.0",
                "Terms of service",
                new Contact("monster", "monster.red", "dang7758@126.com"),
                "Apache", "http://www.apache.org/", Collections.emptyList());
        return apiInfo;
    }
}