package com.example.controller;

import com.example.dto.People;
import com.example.exception.RequestException;
import com.example.model.Man;
import com.example.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @author: Monster
 * @date: 2019-05-14 17:02
 **/
@RestController
public class IndexController {


    @Autowired
    ApplicationContext context;
    //@ConditionalOnExpression
    AnimalService animalService;

    @RequestMapping(value="/get",method= RequestMethod.GET)
    public String get(){
        return RequestMethod.GET.toString();
    }

    @RequestMapping(value="/post",method= RequestMethod.POST)
    public String post(){
        return RequestMethod.POST.toString();
    }

    @RequestMapping(value="/list",method= RequestMethod.POST)
    public void list(@RequestBody List<String> ids){
        ids.forEach(id -> System.out.println(id));
    }

    @RequestMapping(value="/objectWithList",method= RequestMethod.POST)
    public void objectWithList(@RequestBody People people){
        Logger.getAnonymousLogger().info(people.toString());
    }

    @RequestMapping(value="/exception",method= RequestMethod.POST)
    public String exception(@RequestBody List<String> ids) throws Exception {
        throw new Exception();
    }
    @RequestMapping(value="/requestException",method= RequestMethod.POST)
    public String requestException() throws RequestException {
        throw new RequestException();
    }

    @RequestMapping(value="/speak",method= RequestMethod.GET)
    public String requestException(@RequestParam String type) throws RequestException {
        throw new RequestException();
    }

    @RequestMapping(value="/listAsString",method= RequestMethod.POST)
    public void requestException(@RequestBody Man man) {
        System.out.println(man);
    }

    @RequestMapping(value="/map",method= RequestMethod.POST)
    public String map(@RequestParam Map<String,Object> map){
        System.out.println(map);
        return map.toString();
    }


    @RequestMapping(value="/getBean",method= RequestMethod.GET)
    public String getBean(@RequestParam("name") String name) throws RequestException {
        Object object=context.getBean(name);
        System.out.println(context.getBean(name));
        return object.getClass().getName();
    }


}
