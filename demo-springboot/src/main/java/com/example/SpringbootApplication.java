package com.example;

import com.example.config.MyAnnotationBeanNameGenerator;
import javafx.application.Application;
import javafx.scene.Parent;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SpringBootApplication
public class SpringbootApplication {

	@Bean
	public ExitCodeGenerator exitCodeGenerator() {
		return () -> 42;
	}

	public static void main(String[] args) {
//		System.exit(SpringApplication.exit(SpringApplication.run(SpringbootApplication.class, args)));

		SpringApplication springApplication=new SpringApplication(SpringbootApplication.class);
		springApplication.setBeanNameGenerator(new MyAnnotationBeanNameGenerator());
		springApplication.run(args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

//	public static void main(String[] args) {
//
////		new SpringApplicationBuilder()
////				.sources(Parent.class)
////				.child(Application.class)
////				.bannerMode(Banner.Mode.OFF)
////				.run(args);
//
//
//
//		SpringApplication springApplication=new SpringApplication(SpringbootApplication.class);
//		springApplication.setBeanNameGenerator(new MyAnnotationBeanNameGenerator());
//		springApplication.run(args);
//	}

}
