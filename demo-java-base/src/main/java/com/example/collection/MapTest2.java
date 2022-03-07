package com.example.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: zw
 * @Date: 2021/9/26 16:36
 */
public class MapTest2 {
	public static void main(String[] args) {
		test();
	}
	public  static void test2(){
		String key="";
		Map<String,Object> aa=new HashMap<>();
		for(Integer i=0;i<3;i++){
			key=i.toString();
			aa.put(key,true);
		}

		System.out.println(aa);

	}

	public  static void test(){
		String key="";
		List<String> aa=new ArrayList<>();
		for(Integer i=0;i<3;i++){
			key=i.toString();
			aa.add(key);
		}

		System.out.println(aa);

	}
}
