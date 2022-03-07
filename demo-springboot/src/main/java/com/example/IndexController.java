package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Monster
 * @date: 2019-05-14 17:02
 **/
@RestController
public class IndexController {

	@Autowired
	private ServletWebServerApplicationContext webServerAppCtxt;

	@Autowired
	private ServerProperties serverProperties;

	@RequestMapping("/hi")
	@ResponseBody
	public String testFreemarker(){
		return "内网ip:port:"+webServerAppCtxt.getWebServer()+webServerAppCtxt.getWebServer().getPort();
	}

}
