package com.example;

import com.example.config.MyAnnotationBeanNameGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {


	public static void main(String[] args) {
		SpringApplication springApplication=new SpringApplication(SpringbootApplication.class);
		springApplication.setBeanNameGenerator(new MyAnnotationBeanNameGenerator());
		springApplication.run(args);
	}

}
