package com.example.clazz;

import org.springframework.beans.BeanUtils;

import java.util.HashMap;
import java.util.Map;

public class CloneTest2 {
	public static void main(String[] args) {
		Map<String,Object> entityMap=new HashMap<>();
		entityMap.put("sup_id","1");
		entityMap.put("sup_name","asdfa");
		Map<String,Object> paramMap=new HashMap<>();
		BeanUtils.copyProperties(entityMap,paramMap,Map.class);

		System.out.println(paramMap);
	}
}
