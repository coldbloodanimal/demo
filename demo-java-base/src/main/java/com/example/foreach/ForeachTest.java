package com.example.foreach;

/**
 * @author: Monster
 * @date: 2019-08-06 15:58
 **/
public class ForeachTest {
    public static void main(String[] args) {
        String a=new String("bibiu");
        change(a);
        System.out.println(a);


        Integer c=5;
        change(c);
        System.out.println(c);
    }

    public static void change(String a){
        a=new String("lala");
    }

    public static void change(Integer a){
        a=12;
    }

    public static void do1(){
        for(int i=0;i<10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void do2(){
        for(int i=0;i<10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
    }
}
