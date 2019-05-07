package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Monster
 * @date: 2019-05-07 13:41
 **/
@RestController
public class HelloController {

    @Autowired
    HelloSender sender;

    @RequestMapping(value="send",method= RequestMethod.GET)
    public void send(@RequestParam(name="message")String message){
         sender.send(message);
    }
}
