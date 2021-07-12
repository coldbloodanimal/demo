package com.example.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
		Map<String,Object> map=new HashMap<>();
		Method[] methods=map.getClass().getMethods();
		Method putMethod=Arrays.asList(methods).stream().filter(p->"put".equals(p.getName())).findFirst().get();
		putMethod.invoke(map,"name","xiaoming");
		System.out.println(map);
	}
}
