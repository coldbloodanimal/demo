package com.example;

import com.example.service.Animal;
import com.example.serviceImpl.Dog;
import com.example.serviceImpl.Pig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Monster
 * @date: 2019-05-14 17:02
 **/
@RestController
public class IndexController {

	@Autowired
	private ServletWebServerApplicationContext webServerAppCtxt;

	@Resource(type = Dog.class)
	Animal animal;

	@RequestMapping("/speak")
	@ResponseBody
	public String dogSpeak(){
		return animal.speak();
	}

	@RequestMapping("/hi")
	@ResponseBody
	public String testFreemarker(){
		return "内网ip:port:"+webServerAppCtxt.getWebServer()+webServerAppCtxt.getWebServer().getPort();
	}

}
