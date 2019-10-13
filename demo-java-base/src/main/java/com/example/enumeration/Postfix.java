package com.example.enumeration;

/**
 * @author: Strange
 * @date: 2019-09-11 11:53
 **/
public class Postfix {
    public static void main(String[] args) {
        String url="http://penglai-weimall.oss-cn-hangzhou.aliyuncs.com/img/15dHMQTH4-APVckMpO-tnJ-1568169207869.mp4";

        System.out.println(url.endsWith("Mp4".toLowerCase()));
        System.out.println(url.substring(url.lastIndexOf(".")+1));
    }
}
