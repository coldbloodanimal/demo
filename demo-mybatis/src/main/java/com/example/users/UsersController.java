package com.example.users;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @Autowired
    UsersService service;

    @RequestMapping(value="/user/selectById",method= RequestMethod.GET)
    public Users selectByPrimaryKey(@RequestParam(name="id")String id){
        return service.selectByPrimaryKey(id);
    }

    @RequestMapping(value="/user/selectPage",method= RequestMethod.GET)
    public IPage<Users> selectByPrimaryKey(@RequestParam(value = "username",required = false) String username,
                                           @RequestParam(value = "current", defaultValue = "1") Integer current,
                                           @RequestParam(value = "size", defaultValue = "10") Integer size){
        Page page=new Page(1,10);
        Users user=new Users();
        user.setUsername(username);
        return service.selectPage(page,user);
    }
}
