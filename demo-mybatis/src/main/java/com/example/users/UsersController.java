package com.example.users;

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
