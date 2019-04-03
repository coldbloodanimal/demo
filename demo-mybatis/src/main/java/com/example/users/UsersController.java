package com.example.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @Autowired
    UsersService service;

    @RequestMapping(value="/user/selectById",method= RequestMethod.GET)
    public Users selectByPrimaryKey(@RequestParam(name="id")String id){
        return service.selectByPrimaryKey(id);
    }
}
