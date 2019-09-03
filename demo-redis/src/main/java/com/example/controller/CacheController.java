package com.example.controller;

import com.example.model.KeyValueModel;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Monster
 * @date: 2019-09-03 17:20
 **/
@RestController
public class CacheController {
    /**
     * 新增或者修改缓存
     * */
    @CachePut(cacheNames = "redis",key="#kv.id")
    @RequestMapping(value="/cache/{id}",method= RequestMethod.PUT)
    public KeyValueModel setValue(@RequestBody KeyValueModel kv){
        return kv;
    }

    /**
     * 查询缓存，如果没有缓存，则进入方法体内
     * */
    @Cacheable(cacheNames = "redis",key ="#id")
    @RequestMapping(value="/cache/{id}",method= RequestMethod.GET)
    public KeyValueModel getValue(@PathVariable("id") String id){
        KeyValueModel kv=new KeyValueModel();
        kv.setId(id);
        return kv;
    }

    /**
     * 清除缓存
     * */
    @CacheEvict(cacheNames = "redis" ,key="#id")
    @RequestMapping(value="/cache/{id}",method= RequestMethod.DELETE)
    public String cacheDelete(@PathVariable("id") String id){
        return "deleted";
    }
}
