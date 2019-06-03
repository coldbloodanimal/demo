package com.example.topic;

import com.example.routing.RoutingSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Monster
 * @date: 2019-05-07 13:41
 **/
@Profile("topic")
@RestController
public class TopicController {

    @Autowired
    TopicSender sender;

    @RequestMapping(value="topic/send",method= RequestMethod.GET)
    public void send(@RequestParam(name="message")String message){
         sender.send(message);
    }
}
