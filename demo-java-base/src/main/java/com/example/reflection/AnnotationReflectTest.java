package com.example.reflection;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationReflectTest {
	public static void main(String[] args) {

		Class<?> clazz=HospitalCodeColumnModel.class;
		Field[] fields=clazz.getDeclaredFields();
		JSONArray ja=new JSONArray();
		for (Field field : fields) {
			PrintModelProperty printModelProperty=field.getAnnotation(PrintModelProperty.class);
			System.out.println(printModelProperty.text());
			ja.add(printModelProperty);
		//	System.out.println(field.getName()+printModelProperty.text()+printModelProperty.hidden());
		}
		System.out.println(ja);
	}
}
