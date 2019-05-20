package com.example.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Monster
 * @date: 2019-05-14 17:02
 **/
@RestController
public class IndexController {
    @RequestMapping(value="/list",method= RequestMethod.POST)
    public void list(@RequestBody List<String> ids){
        ids.forEach(id -> System.out.println(id));
    }
}
