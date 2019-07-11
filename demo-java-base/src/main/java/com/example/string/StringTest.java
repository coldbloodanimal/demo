package com.example.string;

/**
 * @author: Monster
 * @date: 2019-06-14 14:31
 **/
public class StringTest {
    public static void main(String[] args) {
        do13();
    }


    public static void do1(){
        ;        StringBuilder sb=new StringBuilder();
        sb.append("hid");
        System.out.print(null+"");
    }

    public static void do12(){
                Long a=1146751043405778945L;
        Long b=null;
        String c=String.join("asdf","aaaaaaaaaa");
        System.out.println(c);
    }

    public static void do13(){
        String a="1146751043405778945";
        String  b=null;
        String c=null;
        String aa =(a.equals(null)?"":a);
        String bb=(b==null?"":b);
        System.out.println((a==null?"":a)+(b==null?"":b));
    }
}
