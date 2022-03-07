package com.example.string;

/**
 * @author: Monster
 * @date: 2019-10-15 15:14
 **/
public class StringUtils {
    public static void main(String[] args) {
        //getMapperBeanByEntityName("DsdfEntity");
		String a="http://192.144.144.119:9000/ecs/upLoad/sup/0/cert/hos_logistics/118/138249963590656.keystore";
		System.out.println(a.replace("http://192.144.144.119:9000/ecs/",""));
    }

    private static void getMapperBeanByEntityName(String entityClassName) {
        String mapper=entityClassName.substring(0,1).toLowerCase().concat(entityClassName.substring(1)).replaceAll("Entity","Mapper");
        System.out.println(mapper);
    }
}
