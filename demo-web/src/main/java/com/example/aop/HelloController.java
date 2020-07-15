package com.example.aop;

import com.example.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Monster
 * @date: 2019-05-14 17:02
 **/
@RestController
public class HelloController {


    @Autowired
    ApplicationContext context;
    //@ConditionalOnExpression
    AnimalService animalService;


    @Zila
    @Lala
    @Selele
    @RequestMapping(value="/hi",method= RequestMethod.GET)
    public String hi(){
        System.out.println("_________");
        return RequestMethod.GET.toString();
    }



}
