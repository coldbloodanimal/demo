package com.example.users;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author: Monster
 * @date: 2019-11-13 20:57
 **/
public class ConstantUtil {
    public static void main(String[] args) {
        String[] ss=Constant.new_data.split("\\|\\|");
        for (String s : ss) {
            for (String s1 : s.split(" ")) {
                System.out.print(s1);
            }
                System.out.println();
        }
    }

    static List<WeixinNow>  getWinxinNewList(){
        List<WeixinNow> list=new ArrayList<>();
        String[] ss=Constant.new_data.split("\\|\\|");
        for (String s : ss) {
            WeixinNow now=new WeixinNow();
            String[] os=s.split(" ");

                now.setMallName(os[0].trim());
                now.setMchId(os[1].trim());
                now.setStatus(os[3].trim());
                now.setId(UUID.randomUUID().toString());
                list.add(now);


            System.out.println();
        }
        return list;
    }


    static List<WeixinOld>  getWinxinOldList(){
        List<WeixinOld> list=new ArrayList<>();
        String[] ss=Constant.old_data.split(",");
        for (String s : ss) {
            WeixinOld old=new WeixinOld();
            old.setMchId(s.trim());
            old.setId(UUID.randomUUID().toString());
            list.add(old);
            System.out.println();
        }
        return list;
    }

    static List<WeixinStatus>  getWinxinStatusList(){
        List<WeixinStatus> list=new ArrayList<>();
        String[] ss=Constant.mall_status_data.split("\\|\\|");
        for (String s : ss) {
            WeixinStatus now=new WeixinStatus();
            String[] os=s.split("-");
            now.setCompanyName(os[0].trim());
            now.setMchId(os[1].trim());
            now.setStatus(os[2].trim());
            now.setId(UUID.randomUUID().toString());
            list.add(now);


            System.out.println();
        }
        return list;
    }

}
