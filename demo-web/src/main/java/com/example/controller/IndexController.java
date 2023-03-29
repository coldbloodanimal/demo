package com.example.controller;

import com.example.dto.People;
import com.example.exception.RequestException;
import com.example.model.Man;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.ModelMap;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @author: Monster
 * @date: 2019-05-14 17:02
 **/
@CrossOrigin(origins = "*")
@RestController
public class IndexController {


    @Autowired
    ApplicationContext context;

	@RequestMapping("/freemarker2")
	public String testFreemarker(){
		//modelMap.addAttribute("msg", "Hello dalaoyang , this is freemarker");
		return "freemarker2";
	}

	@RequestMapping("/freemarker3")
	public String freemarker3(){
		//modelMap.addAttribute("msg", "Hello dalaoyang , this is freemarker");
		return "freemarker3";
	}

    @RequestMapping(value="/ajax",method= RequestMethod.GET)
    public String ajax(@RequestParam(value = "value",required = false) String value) throws InterruptedException {
        Thread.sleep(2000);
        String v=ObjectUtils.isEmpty(value)?"":value;
        return "hello"+ v;
    }

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String hello(){
        return "hello world";
    }

//    @RequestMapping(value="/{id}",method= RequestMethod.GET)
//    public String getByid(@PathVariable("id")String id){
//        System.out.println(id);
//        return RequestMethod.GET.toString();
//    }


    @RequestMapping(value="/get",method= RequestMethod.GET)
    public String get(){
        return RequestMethod.GET.toString();
    }

    @RequestMapping(value="/post",method= RequestMethod.POST)
    public String post(){
        return RequestMethod.POST.toString();
    }

    @RequestMapping(value="/list",method= RequestMethod.POST)
    public void list(@RequestBody List<String> ids){
        ids.forEach(id -> System.out.println(id));
    }

    @RequestMapping(value="/objectWithList",method= RequestMethod.POST)
    public void objectWithList(@RequestBody People people){
        Logger.getAnonymousLogger().info(people.toString());
    }

    @RequestMapping(value="/exception",method= RequestMethod.POST)
    public String exception(@RequestBody List<String> ids) throws Exception {
        throw new Exception();
    }
    @RequestMapping(value="/requestException",method= RequestMethod.POST)
    public String requestException() throws RequestException {
        throw new RequestException();
    }

    @RequestMapping(value="/speak",method= RequestMethod.GET)
    public String requestException(@RequestParam String type) throws RequestException {
        throw new RequestException();
    }

    @RequestMapping(value="/listAsString",method= RequestMethod.POST)
    public void requestException(@RequestBody Man man) {
        System.out.println(man);
    }

    @RequestMapping(value="/map",method= RequestMethod.POST)
    public String map(@RequestParam Map<String,Object> map, ServletRequest request){
        System.out.println(map);
        return map.toString();
    }

    @RequestMapping(value="/map2",method= RequestMethod.POST)
    public String map2(@RequestParam Map<String,Object> map){
        System.out.println(map);
        return map.toString();
    }



    @RequestMapping(value="/getBean",method= RequestMethod.GET)
    public String getBean(@RequestParam("name") String name) throws RequestException {
        Object object=context.getBean(name);
        System.out.println(context.getBean(name));
        return object.getClass().getName();
    }

    @RequestMapping(value="/getPeople",method= RequestMethod.GET)
    public People getPeople(){
        People people=new People();
        people.setLive(true);
        return people;
    }
}
