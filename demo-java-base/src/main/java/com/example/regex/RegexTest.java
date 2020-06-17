package com.example.regex;

import java.util.regex.Pattern;

/**
 * @author: Monster
 * @date: 2019-05-14 11:31
 **/
public class RegexTest {
    public static void main(String[] args) throws Exception {
        String s="asf.";
        String s2="abcdef";
        System.out.println(s.getBytes().length);
        System.out.println(s2.getBytes().length);
        //String regex="\\.(gif|jpg|jpeg|png|GIF|JPG|PNG)$";
        String regex=".+.(gif|jpg|jpeg|png|GIF|JPG|PNG)$";
        boolean isMatch = Pattern.matches(regex, s);
        System.out.println(isMatch);
        if(isMatch){
            System.out.println("is img");
        }
    }

    public static void go() throws Exception {
        String s="aaaa.png";
        String s2="abcdef";
        System.out.println(s.getBytes().length);
        System.out.println(s2.getBytes().length);
        String regex="/\\.(gif|jpg|jpeg|png|GIF|JPG|PNG)$/";
        boolean isMatch = Pattern.matches(regex, s);
        if(isMatch){
            System.out.println("is img");
        }
    }

    public static void go1() throws Exception {
        String s="请输入正确的";
        String s2="abcdef";
        System.out.println(s.getBytes().length);
        System.out.println(s2.getBytes().length);
        String regex="\\S{1,12}";
        boolean isMatch = Pattern.matches(regex, s);
        if(!isMatch){
            throw new Exception("请输入正确的联系方式");
        }
    }
}
