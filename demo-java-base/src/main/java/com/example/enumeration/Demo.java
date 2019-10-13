package com.example.enumeration;

import java.util.concurrent.locks.Condition;

import static com.example.enumeration.PeopleType.BADPEOPLE;

public class Demo {
    public static void main(String[] args) {

       // go1();
        System.out.print(BADPEOPLE.name());
        //String.

    }

    public static void compare(){
        SexEnum sexEnum=SexEnum.getByKey(1);
        if(sexEnum==SexEnum.MAN){
            System.out.print(sexEnum.getValue());
        };
        System.out.print(SexEnum.MAN.equals(SexEnum.WOMAN));

    };


    public static void go1(){
        PeopleType p1=PeopleType.valueOf("GOODPEOPLE");
        System.out.println(p1);
        PeopleType p2=PeopleType.valueOf("GOOD_PEOPLE");
        System.out.println(p2);
        PeopleType p3=PeopleType.valueOf("");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    public static void go(){
        com.example.enumeration.People lili=new com.example.enumeration.People();
        lili.setPeopleType(BADPEOPLE.toString());
        System.out.println(lili);

        lili.setPeopleType(BADPEOPLE.getContext());
        System.out.println(lili);
        System.out.println(BADPEOPLE);




        System.out.println(com.example.enumeration.Inter.BLOOD);

        System.out.println(BADPEOPLE.equals(com.example.enumeration.PeopleType.valueOf("BADPEOPLE")));
        //  System.out.println(PeopleType.valueOf("BAD_PEOPLE"));
    }

}
