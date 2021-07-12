package com.example.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;
import java.util.logging.Logger;

@RestController
public class UsersController {

    @Autowired
    UsersService service;


    @Resource
    UsersMapper usersMapper;

    @RequestMapping(value = "/user/selectById", method = RequestMethod.GET)
    public Users selectByPrimaryKey(@RequestParam(name = "id") String id) {
        return service.selectByPrimaryKey(id);
    }


    /**
     *{
     * 	"status":["ACTIVE","CANCEL"],
     * 	"startTime":"1559456103000",
     * 	"endTime":"1559456283000"
     * }
     *
     * */
    @RequestMapping(value = "/user/selectByCondition", method = RequestMethod.POST)
    public List<Users> selectByCondition(@RequestBody UserCriteriaModel criteria) {
        if("yesterday".equals(criteria.getPeriod())){

        }
        return service.selectByCondition(criteria);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        Logger.getAnonymousLogger().info("hello");
        return "hello";
    }

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public Object select() {
        List<Map<String,String>> result=usersMapper.selectMap();
        Map<String,String> resultMap=new HashMap<>();
        result.stream().forEach(t->resultMap.put(t.get("id"),t.get("username")));
        return  resultMap;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public void add() {
        Map<String,Object> map=new HashMap<>();
        map.put("id",UUID.randomUUID().toString());
        map.put("username","name:"+Math.random());
        usersMapper.insert2(map);
    }

    @RequestMapping(value = "/add3", method = RequestMethod.GET)
    public void add2() {
        Map<String,Object> map=new HashMap<>();
        map.put("id",UUID.randomUUID().toString());
        map.put("username","name:"+Math.random());
        usersMapper.insert3(map);
    }

    @RequestMapping(value = "/add4", method = RequestMethod.GET)
    public void add4() {
        List<Map<String, Object>> entityList=new ArrayList<>();
        Map<String,Object> map=new HashMap<>();
        map.put("id",UUID.randomUUID().toString());
        map.put("username","name:"+Math.random());

        Map<String,Object> map2=new HashMap<>();
        map2.put("id",UUID.randomUUID().toString());
        map2.put("username","name:"+Math.random());

        entityList.add(map);
        entityList.add(map2);
        usersMapper.insert4(entityList);
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public void update() {
        Map<String,Object> map=new HashMap<>();
        map.put("id","1");
        map.put("username","update_user");
        usersMapper.update2(map);
    }
}
