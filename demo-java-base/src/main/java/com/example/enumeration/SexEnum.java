package com.example.enumeration;

/**
 * @author: Monster
 * @date: 2019-06-17 20:12
 **/
public enum SexEnum {

    MAN(1,"男"),
    WOMAN(2,"女");

    private Integer key;
    private String value;

    SexEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static SexEnum getByKey(Integer key){
        for (SexEnum value : SexEnum.values()) {
            if(value.getKey().equals(key)){
                return value;
            }
        }
        return null;
    }

}
