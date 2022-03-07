package com.example.collection;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		test2();
	}

	public  static void test2(){
		Map<String,Object> aa=new HashMap<>();
		aa.put("a","1");
		aa.put("b","");
		aa.put("c",null);

		System.out.println(aa.get("c"));
		System.out.println(aa.get("d"));


		Map<String,Object> bb=new HashMap<>();
		bb.put("a","1");
		bb.put("b","");
		bb.put("c",null);

		System.out.println(aa.equals(bb));
	}

	public  static void test1(){
		JSONObject aa=new JSONObject();
		aa.put("a","1");
		aa.put("b","");
		aa.put("c",null);

		String data = JSON.toJSONString(aa);
		Map<String, Object> bb = JSONObject.parseObject(data, Map.class);
//
//		int a= Integer.valueOf(Stringbb.get("a"));
//		int b= Integer.valueOf(bb.get("b"));
//		int c= Integer.valueOf(bb.get("c"));
//		int d= Integer.valueOf(bb.get("d"));



		int a= aa.getIntValue("a");
		int b= aa.getIntValue("b");
		int c= aa.getIntValue("c");
		int d= aa.getIntValue("d");
		System.out.println();
	}
}
