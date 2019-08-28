package com.example.test;

import lombok.val;
import org.springframework.util.StringUtils;

import static java.sql.JDBCType.NULL;

/**
 * @author: Monster
 * @date: 2019-07-22 10:29
 **/
public class Test {
    public static void main(String[] args) {
       lala();
    }

    public static void lala(){
        String zz="";
        if(!StringUtils.isEmpty(zz)){
            System.out.println("zz");
            return;
        }else{
            System.out.println("lili");
        }
        System.out.println("jj");
    }
}
