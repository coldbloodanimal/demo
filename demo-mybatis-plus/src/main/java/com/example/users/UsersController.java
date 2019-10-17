package com.example.users;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        Logger.getAnonymousLogger().info("hello");
        return "hello";
    }

    @RequestMapping(value = "/selectCount", method = RequestMethod.GET)
    public Integer select() {
        return service.getCount();
    }

    @RequestMapping(value="/user/selectPage",method= RequestMethod.GET)
    public IPage<Users> selectByPrimaryKey(@RequestParam(value = "username",required = false) String username,
                                           @RequestParam(value = "current", defaultValue = "1") Integer current,
                                           @RequestParam(value = "size", defaultValue = "10") Integer size){



        Page<Users> page=new Page(1,10);
        Users user=new Users();
        user.setUsername(username);
        return service.selectPage(page,user);
    }
}
