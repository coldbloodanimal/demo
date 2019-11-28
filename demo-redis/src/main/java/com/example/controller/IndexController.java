package com.example.controller;


import com.example.animal.People;
import com.example.model.KeyValueModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/get/{module}", method = RequestMethod.GET)
    public Long get(@PathVariable("module") String module) {
        Object value = redisTemplate.opsForValue().get("doubletwleve"+module);
        if (ObjectUtils.isEmpty(value)) {
            value = 1L;
            redisTemplate.opsForValue().set("doubletwleve"+module, value);
        }
        Long result =(Long) value;
        redisTemplate.opsForValue().set("doubletwleve"+module, result+1);
        return result;
    }

    @RequestMapping(value="/set",method= RequestMethod.POST)
    public void set(@RequestParam("key") String key){
        redisTemplate.opsForValue().set("coupon",1);
    }


    @Cacheable
    @RequestMapping(value="/post",method= RequestMethod.POST)
    public String post(){
        return RequestMethod.POST.toString();
    }

    @Cacheable(cacheNames = "redis")
    @RequestMapping(value="/setValue/{id}",method= RequestMethod.POST)
    public void setValueEasy(@RequestBody KeyValueModel keyValueModel){
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
        stringRedisTemplate.opsForValue().set("TOKEN:SESSION_TOKEN:919EBE61-6E80-498C-9F58-761646B263AA","lala",604800L, TimeUnit.SECONDS);
        redisTemplate.opsForValue().set("TOKEN:SESSION_TOKEN:919EBE61-6E80-498C-9F58-761646B263DD",people,604800L, TimeUnit.SECONDS);
        redisTemplate.opsForValue().set("TOKEN:LONGID_TOKEN:OEV5S0TEXD9JXFXS6AN8YADBNYFK",people,604800L, TimeUnit.SECONDS);
        redisTemplate.opsForValue().set("TOKEN:REFRESH_TOKEN:1B0F8583-9D62-4325-ACC5-563152071651",people,2592000L, TimeUnit.SECONDS);


        System.out.println(redisTemplate.opsForValue().get("TOKEN:SESSION_TOKEN:919EBE61-6E80-498C-9F58-761646B263DD"));
        System.out.println(redisTemplate.opsForValue().get("TOKEN:LONGID_TOKEN:OEV5S0TEXD9JXFXS6AN8YADBNYFK"));
        System.out.println(redisTemplate.opsForValue().get("TOKEN:REFRESH_TOKEN:1B0F8583-9D62-4325-ACC5-563152071651"));

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
