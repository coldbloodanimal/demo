package com.example;

import com.example.config.BaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeixinController {

    @Autowired
    BaseConfig config;

    @RequestMapping(value="",method= RequestMethod.GET)
    public String hello(){
        return "hello world!";
    }

    @RequestMapping(value="test",method= RequestMethod.GET)
    public String test() throws Exception {
    return config.getVersion();
        //   return config.getName();
    }

}
