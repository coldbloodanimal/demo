package com.example.enumeration;

import lombok.Getter;

import java.util.Map;

/**
 * 与阳光集采系统基础表一一对应
 * 每一个枚举类型中的包实现了一个对应的集采系统功能
 * 如果bag中的区域字段使用区域的国标码，这个枚举类型可以省略
 */
@Getter
public enum ProcurementPlatformEnum {
    /**
     * 四川省耗材集采平台
     */
    SICHUAN_MATERIAL("510000","M","com.procurement.sichuan.meterial"),
    /**
     * 四川省试剂集采平台
     */
    SICHUAN_REAGENT("510000","R","com.procurement.sichuan.reagent"),
    /**
     * 江苏省阳光集采耗材系统
     */
    JIANG_SU_MATERIAL("320000","M",""),
    /**
     * 港大深圳
     */
    SHEN_ZHEN("440300","M","");
    /**
     * 国标码：阳光采购平台是省级的，则存储省标码；市级，则存储市标码
     */
    private String code;
    /**
     * 产品类型：
     * G	药品
     * M	耗材
     * R	试剂
     * E	设备
     */
    private String type;
    /**
     * 通过集采系统表中的信息可以获得name和code,找到存放处理相应逻辑的包,package是java关键字，所以用bag
     * 示例：com.procurement.sichuan.meterial,后2~3个字段对应的是区域和产品分类
     * 另外一种设计，不用这个字段也可以,将省份城市的编码转化为区域拼音，拼接就可找到包，再议
     */
    private String bag;

    /**
     * @param code 区域的国标码
     * @param type 产品类型
     * @param bag 处理问题请求的类方法所在包
     */
    private static Map<String,ProcurementPlatformEnum> procurementPlatformEnumMap;
    static {
        ProcurementPlatformEnum[] procurementPlatformEnumList=ProcurementPlatformEnum.values();
        for (ProcurementPlatformEnum procurementPlatformEnum : procurementPlatformEnumList) {
            String key=procurementPlatformEnum.getCode()+"."+procurementPlatformEnum.getType();
            procurementPlatformEnumMap.put(key,procurementPlatformEnum);
        }
    }
    public static ProcurementPlatformEnum get(String code,String type){
        String key=code+"."+type;
        return procurementPlatformEnumMap.get(key);
    }

    public static void main(String[] args) {
        ProcurementPlatformEnum.get("510000","M");
    }

    ProcurementPlatformEnum(String code, String type, String bag) {
        this.code = code;
        this.type = type;
        this.bag = bag;
    }
}
