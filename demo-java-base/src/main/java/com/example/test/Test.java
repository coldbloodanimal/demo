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
        System.out.println(null+"a");
        Object o=new Object();

        System.out.print(Double.doubleToLongBits(Math.random()*Long.MAX_VALUE));

        System.out.println("\033[30;4mHello,Akina!\033[0m");
        System.out.println("\033[31;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[32;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[33;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[34;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[35;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[36;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[37;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[40;31;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[41;32;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[42;33;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[43;34;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[44;35;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[45;36;4m" + "Hello,Akina!" + "\033[0m");
        System.out.println("\033[46;37;4m" + "Hello,Akina!" + "\033[0m");


        String date="";

        String[] ls=date.split("\\.");
        System.out.println(ls);
        System.out.println(ls[0]);

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
