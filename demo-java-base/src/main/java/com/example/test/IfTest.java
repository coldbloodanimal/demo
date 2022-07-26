package com.example.test;

import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Monster
 * @date: 2019-11-19 09:29
 **/
public class IfTest {
    public static void main(String[] args) {

        List<String> ll=new ArrayList<>();
        ll.add(null);
        System.out.println(ll.stream().filter(p-> !ObjectUtils.isEmpty(p)).collect(Collectors.joining(",")));
        if(null==null){
            System.out.println("lala:"+true);
        }
        new Thread().start();
        System.out.println();

        int a=10;
        if(a>2){
            System.out.println(">2");
        }else if(a>5){
            System.out.println(">5");
        }
    }

}
