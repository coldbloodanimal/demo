package com.example.weixin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeixinController {

    @RequestMapping(value="",method= RequestMethod.GET)
    public String selectByPrimaryKey(){
        return "hello world!";
    }
}
