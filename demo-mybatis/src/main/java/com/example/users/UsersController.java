package com.example.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class UsersController {

    @Autowired
    UsersService service;

    @RequestMapping(value = "/user/selectById", method = RequestMethod.GET)
    public Users selectByPrimaryKey(@RequestParam(name = "id") String id) {
        return service.selectByPrimaryKey(id);
    }


    @RequestMapping(value = "/user/selectByCondition", method = RequestMethod.POST)
    public List<Users> selectByCondition(@RequestBody UserCriteriaModel criteria) {
        return service.selectByCondition(criteria);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        Logger.getAnonymousLogger().info("hello");
        return "hello";
    }

//    @RequestMapping(value="/user/selectPage",method= RequestMethod.GET)
//    public IPage<Users> selectByPrimaryKey(@RequestParam(value = "username",required = false) String username,
//                                           @RequestParam(value = "current", defaultValue = "1") Integer current,
//                                           @RequestParam(value = "size", defaultValue = "10") Integer size){
//        Page page=new Page(1,10);
//        Users user=new Users();
//        user.setUsername(username);
//        return service.selectPage(page,user);
//    }
}
