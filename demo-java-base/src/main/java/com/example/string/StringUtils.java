package com.example.string;

/**
 * @author: Monster
 * @date: 2019-10-15 15:14
 **/
public class StringUtils {
    public static void main(String[] args) {
        //getMapperBeanByEntityName("DsdfEntity");
		String a="aaa,bb,cc";
		System.out.println(a.replace(",",":"));
    }

    private static void getMapperBeanByEntityName(String entityClassName) {
        String mapper=entityClassName.substring(0,1).toLowerCase().concat(entityClassName.substring(1)).replaceAll("Entity","Mapper");
        System.out.println(mapper);
    }
}
