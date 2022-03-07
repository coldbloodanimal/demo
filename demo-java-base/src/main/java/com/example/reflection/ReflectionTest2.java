package com.example.reflection;

import org.reflections.Reflections;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ReflectionTest2 {
	public static void main(String[] args) {
		Reflections reflections = new Reflections("com.example.reflection");
		Set<Class<? extends Banana>> jobClasses = reflections.getSubTypesOf(Banana.class);
		List<Map<String,Object>> list= jobClasses.stream().map(p->{
			Map<String,Object> map=new HashMap<>();
			map.put("id",p.getName());
			map.put("text",p.getName());
			return map;
		}).collect(Collectors.toList());

		System.out.println(list.toString());
		jobClasses.forEach(p->System.out.println(p.getName()));
	}
}
