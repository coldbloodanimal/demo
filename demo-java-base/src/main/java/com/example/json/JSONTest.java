package com.example.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.animal.Dog;

import javax.swing.text.StyledEditorKit;

public class JSONTest {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setName(Boolean.TRUE.toString());
        dog.setSex(1);
        dog.setReal(true);
        System.out.println(JSON.toJSONString(dog));
        SerializeConfig config=new SerializeConfig();
        config.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;
        String json=JSON.toJSONString(dog,config, SerializerFeature.WriteNullStringAsEmpty);
        //String json=JSON.toJSONString(dog);
        System.out.println(json);

    }
}
