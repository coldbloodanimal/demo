package com.example.json;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.animal.Dog;

import java.util.HashMap;
import java.util.Map;

public class JSONObjectTest {
	public static void main(String[] args) {

		Map<String,Object> dog11=JSONObject.parseObject("{\"name\":null}");
		System.out.println("testdog:"+dog11);
		testEntity();

		testMap();
	}


	public static void testEntity(){
		Map<String,Object> dog1=new HashMap<>();
		dog1.put("name","");
		String s1=JSONObject.toJSONString(dog1);
		System.out.println("s1:"+s1);
		Map<String,Object> dog11=JSONObject.parseObject(s1);
		System.out.println(dog11.get("name"));

		Map<String,Object> dog2=new HashMap<>();
		dog1.put("name",null);
		String s2=JSONObject.toJSONString(dog2);
		System.out.println("s2:"+s2);
		Map<String,Object> dog22=JSONObject.parseObject(s2);
		System.out.println(dog22.get("name"));
	}

	public static void testMap(){
		Map<String,Object> dog1=new HashMap<>();
		dog1.put("name","");
		String s1=JSONObject.toJSONString(dog1);
		System.out.println("s1:"+s1);
		Map<String,Object> dog11=JSONObject.parseObject(s1);
		System.out.println(dog11.get("name"));

		Map<String,Object> dog2=new HashMap<>();
		dog1.put("name",null);
		String s2=JSONObject.toJSONString(dog2);
		System.out.println("s2:"+s2);
		Map<String,Object> dog22=JSONObject.parseObject(s2);
		System.out.println(dog22.get("name"));
	}

	public static void testMap2(){
		Map<String,Object> dog1=new HashMap<>();
		dog1.put("name","");
		String s1=JSONObject.toJSONString(dog1,SerializerFeature.WriteNullStringAsEmpty);
		System.out.println("s1:"+s1);
		Map<String,Object> dog11=JSONObject.parseObject(s1);
		System.out.println(dog11.get("name"));

		Map<String,Object> dog2=new HashMap<>();
		dog1.put("name",null);
		String s2=JSONObject.toJSONString(dog2);
		System.out.println("s2:"+s2);
		Map<String,Object> dog22=JSONObject.parseObject(s2);
		System.out.println(dog22.get("name"));
	}
}
