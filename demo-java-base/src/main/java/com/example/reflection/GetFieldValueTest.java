package com.example.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zw
 * @Date: 2022/2/11 17:42
 */
public class GetFieldValueTest {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		Map<String,Object> map=new HashMap<>();
		map.put("returnCode","1");
		System.out.println(getState(map));

		ResultDTO resultDTO=new ResultDTO();
		System.out.println(getState(resultDTO));

	}

	private static String getState(Object result) throws IllegalAccessException, InvocationTargetException {
		if(result instanceof Map){
			return "1".equals(((Map) result).get("returnCode"))?"1":"0";
		}
		Class clazz=result.getClass();
		try {
			Method method=clazz.getMethod("getReturnCode");
			Object r=method.invoke(result);
			System.out.println(r);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		return "1";
	}
}
