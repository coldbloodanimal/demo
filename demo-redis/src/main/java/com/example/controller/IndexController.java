package com.example.controller;



//import com.example.dto.People;
import com.example.model.KeyValueModel;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.Cacheable;
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


//    @Cacheable
//    @RequestMapping(value="/post",method= RequestMethod.POST)
//    public String post(){
//        return RequestMethod.POST.toString();
//    }
//
//    @Cacheable(cacheNames = "redis")
//    @RequestMapping(value="/setValue/{id}",method= RequestMethod.POST)
//    public void setValueEasy(@RequestBody KeyValueModel keyValueModel){
//        stringRedisTemplate.opsForValue().set(keyValueModel.getKey(),keyValueModel.getValue());
//    }
//
//
//    @RequestMapping(value="/setList",method= RequestMethod.POST)
//    public void setList(@RequestBody People people){
//        for (int i = 0; i < people.getPets().size(); i++) {
//            redisTemplate.opsForList().set(people.getName(),i,people.getPets().get(i));
//        }
//    }




//    @RequestMapping(value="/redisEasyKey",method= RequestMethod.GET)
//    public void redisEasyKey(){
//        People people=new People();
//        people.setName("xiaoming");
//        stringRedisTemplate.opsForValue().set("AABBCCtt","adsfasdf");
//        redisTemplate.opsForValue().set("AABBCC",people,604800L, TimeUnit.SECONDS);
//        redisTemplate.opsForValue().set("AABBCCDD",people,604800L, TimeUnit.SECONDS);
//        redisTemplate.opsForValue().set("798745",people,2592000L, TimeUnit.SECONDS);
//
//    }

}
