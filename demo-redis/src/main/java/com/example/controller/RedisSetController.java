package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author: Monster
 * @date: 2019-11-06 17:08
 **/
@RestController
public class RedisSetController {
    @Autowired
    RedisTemplate redisTemplate;

    private static  final String KEY="demaxiya";

    @RequestMapping(value="/setAdd",method= RequestMethod.POST)
    public void setAdd(@RequestBody List<String> ids){

        for (String id : ids) {
            redisTemplate.opsForSet().add(KEY,id);
        }
    }

    @RequestMapping(value="/getFirst",method= RequestMethod.GET)
    public void getFirst(){
        redisTemplate.opsForSet().getOperations().boundSetOps(KEY).members();
    }

    @RequestMapping(value="/getAll",method= RequestMethod.GET)
    public Set<String> getAll(){
        Set<String> set=redisTemplate.opsForSet().getOperations().boundSetOps(KEY).members();
        return set;
    }


    @RequestMapping(value="/getAllSet",method= RequestMethod.GET)
    public Set<String> getSetPage(){
        Set<String> set=redisTemplate.opsForSet().getOperations().boundSetOps(KEY).members();
        return set;
    }

    @RequestMapping(value="/listRange",method= RequestMethod.GET)
    public List<String> getSetPage(@RequestParam("start") Integer start,@RequestParam("size") Integer size){
        List<String> list=redisTemplate.opsForSet().getOperations().opsForList().range(KEY,start,size);
        return list;
    }

    @RequestMapping(value="/setRangeFake",method= RequestMethod.GET)
    public List<String> setRangeFake(@RequestParam("start") Integer start,@RequestParam("size") Integer size){
        Set<String> sets=redisTemplate.boundSetOps(KEY).members();
        List<String> list=new ArrayList<>();
        list.addAll(sets);
        list=list.stream().skip(start).limit(size).collect(Collectors.toList());
        return list;
    }
}
