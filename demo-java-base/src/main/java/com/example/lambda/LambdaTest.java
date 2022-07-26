package com.example.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaTest {
	public static void main(String[] args) {
		//将一个List<Map<String, Object>>转成Map<String, List<String>>

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
			Map<String, List<Map<String, Object>>> logisticsMap = appList.stream().collect(Collectors.groupingBy(p->p.get("logistics_id").toString()));


	}

	public static void do1() {
		MyLambdaInterface mm=
				(s)->System.out.println(s);
		mm.e("adfsdf");
	}
}
