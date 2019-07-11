package com.example.controller;

import com.example.dto.People;
import com.example.exception.RequestException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author: Monster
 * @date: 2019-05-14 17:02
 **/
@RestController
public class IndexController {
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
}
