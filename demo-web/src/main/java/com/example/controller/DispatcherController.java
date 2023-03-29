package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller
public class DispatcherController {

	@RequestMapping(value = "/{page}.do", method = RequestMethod.GET)
	public ModelAndView requestView(@PathVariable("page") String page, @RequestParam Map<String, Object> mapVo) {
		page.replace(".do","");
		String url = page.replace(".", "/");
		mapVo.put("isLoad", true);
		return new ModelAndView(url, mapVo);
	}


}
