package com.example.swagger;

import com.example.dto.People;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author: Monster
 * @date: 2019-07-01 19:41
 **/
@Api(tags = "测试接口", description = "常用传参方式")
@RestController
public class IndexController {

    @ApiOperation("数组传参")
    @RequestMapping(value="/list",method= RequestMethod.POST)
    public void list(@RequestBody List<String> ids){
        ids.forEach(id -> System.out.println(id));
    }

    @ApiOperation("对象传参")
    @RequestMapping(value="/objectWithList",method= RequestMethod.POST)
    public void objectWithList(@RequestBody People people){
        Logger.getAnonymousLogger().info(people.toString());
    }


    @ApiOperation("get")
    @RequestMapping(value="/get",method= RequestMethod.GET)
    @ApiImplicitParams({ @ApiImplicitParam(dataType = "String", name = "name", value = "名称") })
    public void get(@RequestParam("name")String name){
        Logger.getAnonymousLogger().info(name);
    }

}
