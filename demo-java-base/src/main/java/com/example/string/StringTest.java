package com.example.string;

/**
 * @author: Monster
 * @date: 2019-06-14 14:31
 **/
public class StringTest {
    public static void main(String[] args) {



        System.out.println(null+"zz");
        String lala=" adjf aazzz ";
        System.out.println(lala.trim());
        System.out.println("dog".hashCode());
        System.out.println("Aa".hashCode()=="BB".hashCode());


        String url="http://img13.360buyimg.com/n0/jfs/t11767/44/118404686/157109/70a5b79d/59e811b5N376f2f0b.jpg";
        System.out.println(url.substring(url.lastIndexOf("/") + 1));
       // System.out.println(a);
        //do14();
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

    public static void do14(){
        char a='x';
        System.out.println(a+1);
    }
}
