//package com.example;
//
//import org.apache.catalina.core.ApplicationContext;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.redis.core.RedisTemplate;
//
//import java.util.Arrays;
//
////@EnableCaching
//@SpringBootApplication
//public class DemoRedisApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(DemoRedisApplication.class, args);
//    }
//
////    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//            RedisTemplate redisTemplate=new RedisTemplate();
//           // redisTemplate.getHashValueSerializer().deserialize();
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
////            String[] beanNames = ctx.getBeanDefinitionNames();
////            Arrays.sort(beanNames);
////            for (String beanName : beanNames) {
////                System.out.println(beanName);
////            }
//        };
//    }
//
//}
