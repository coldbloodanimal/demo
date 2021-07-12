package com.example.lambda;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 知乎好文章： https://www.zhihu.com/question/20125256
 *
 */
public class LambdaMap {
	public static void main(String[] args) {
		listToString();
		//listMapToMapListString();
	}


	//将list<String> 转成 String,String
	public static void listToString(){
		List<String> as=new ArrayList<>();
		as.add("llili");
		as.add("lucy");
		as.add("andy");
		String aa=as.stream().collect(Collectors.joining(","));
		System.out.println(aa);
	}

	//将一个List<Map<String, Object>>转成Map<String, List<String>>
	public static void listMapToMapListString(){
		List<Map<String, Object>> appList=new ArrayList<>();
		Map<String,Object> map1=new HashMap<>();
		map1.put("logistics_id","1");
		map1.put("app_id","1");

		Map<String,Object> map2=new HashMap<>();
		map2.put("logistics_id","1");
		map2.put("app_id","2");

		Map<String,Object> map3=new HashMap<>();
		map3.put("logistics_id","2");
		map3.put("app_id","3");

		appList.add(map1);
		appList.add(map2);
		appList.add(map3);
		//分组的例子
		Map<String, List<Map<String, Object>>> logisticsMap = appList.stream().collect(Collectors.groupingBy(p->p.get("logistics_id").toString()));

		Map<String, Map<String,Object>> theMap=appList.stream()
				.collect(Collectors.toMap(p->p.get("aa").toString(),p->p));
	}
}
