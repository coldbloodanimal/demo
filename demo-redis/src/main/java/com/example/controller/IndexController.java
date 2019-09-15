package com.example.controller;

import com.example.dto.People;
import com.example.dto.Pet;
import com.example.model.KeyValueModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

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


    @RequestMapping(value="/redis",method= RequestMethod.GET)
    public void redis(){
        People people=new People();
        people.setName("xiaoming");
        redisTemplate.opsForValue().set("TOKEN:SESSION_TOKEN:919EBE61-6E80-498C-9F58-761646B263DD",people,604800L, TimeUnit.SECONDS);
        redisTemplate.opsForValue().set("TOKEN:LONGID_TOKEN:OEV5S0TEXD9JXFXS6AN8YADBNYFK",people,604800L, TimeUnit.SECONDS);
        redisTemplate.opsForValue().set("TOKEN:REFRESH_TOKEN:1B0F8583-9D62-4325-ACC5-563152071651",people,2592000L, TimeUnit.SECONDS);
    }

    @RequestMapping(value="/redisEasyKey",method= RequestMethod.GET)
    public void redisEasyKey(){
        People people=new People();
        people.setName("xiaoming");
        stringRedisTemplate.opsForValue().set("AABBCCtt","adsfasdf");
        redisTemplate.opsForValue().set("AABBCC",people,604800L, TimeUnit.SECONDS);
        redisTemplate.opsForValue().set("AABBCCDD",people,604800L, TimeUnit.SECONDS);
        redisTemplate.opsForValue().set("798745",people,2592000L, TimeUnit.SECONDS);

    }

}
