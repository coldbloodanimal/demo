package com.example.controller;

import com.example.dto.People;
import com.example.dto.Pet;
import com.example.model.KeyValueModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Monster
 * @date: 2019-07-08 11:35
 **/
@RestController
public class IndexController {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

/*    @RequestMapping(value="/get",method= RequestMethod.GET)
    public String get(@RequestParam("key") String key){
        return redisTemplate.op
    }*/

    @RequestMapping(value="/post",method= RequestMethod.POST)
    public String post(){
        return RequestMethod.POST.toString();
    }

    @RequestMapping(value="/setValue",method= RequestMethod.POST)
    public void setValue(@RequestBody KeyValueModel keyValueModel){
        stringRedisTemplate.opsForValue().set(keyValueModel.getKey(),keyValueModel.getValue());
    }
    @RequestMapping(value="/setList",method= RequestMethod.POST)
    public void setList(@RequestBody People people){
        for (int i = 0; i < people.getPets().size(); i++) {
            redisTemplate.opsForList().set(people.getName(),i,people.getPets().get(i));
        }
    }

}
