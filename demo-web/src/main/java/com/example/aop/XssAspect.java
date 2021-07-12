package com.example.aop;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Component
@Aspect
public class XssAspect {

	@Around("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
	public Object xss(ProceedingJoinPoint pjp) throws Throwable {

		Object[] args=pjp.getArgs();
		for (int i = 0; i < args.length; i++) {
			if(args[i] instanceof Map){
				JSONObject jo =new JSONObject((Map<String, Object>) args[i]);
				String ss=cleanXSS(jo.toJSONString());
				JSONObject rjo=JSONObject.parseObject(ss);
				args[i]=rjo;
			}
		}
		return pjp.proceed(args);
	}

	private String cleanXSS(String valueP) {
		String value = valueP.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
		value = value.replaceAll("<", "& lt;").replaceAll(">", "& gt;");
		value = value.replaceAll("\\(", "& #40;").replaceAll("\\)", "& #41;");
		value = value.replaceAll("'", "& #39;");
		value = value.replaceAll("eval\\((.*)\\)", "");
		value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
		value = value.replaceAll("script", "");
		return value;
	}
}
