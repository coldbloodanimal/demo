package com.example.exception;

import java.util.List;

public class ExcepitionTest {
    public static void main(String[] args) {
        System.out.println("asdf"+doit2());;
    }

    public static boolean doit1(){
        try{
        List<String> list = null;

            System.out.println(list.size());
            return true;
        }catch(Exception e){
            System.out.println("error");
            return true;
        }finally {
            System.out.println("zz");
            return false;
        }
    }

    public static boolean doit2(){
        try{
            List<String> list = null;

            System.out.println(list.size());
            return true;
        }catch(Exception e){
            System.out.println("error");
            return true;
        }finally {
            System.out.println("zz");
            //return false;
        }
    }
}
