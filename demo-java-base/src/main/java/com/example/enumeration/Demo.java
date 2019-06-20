package com.example.enumeration;

import static com.example.enumeration.PeopleType.BADPEOPLE;

public class Demo {
    public static void main(String[] args) {
        compare();

    }

    public static void compare(){
        SexEnum sexEnum=SexEnum.getByKey(1);
        if(sexEnum==SexEnum.MAN){
            System.out.print(sexEnum.getValue());
        };
        System.out.print(SexEnum.MAN.equals(SexEnum.WOMAN));

    };


    public static void go1(){
        PeopleType.valueOf("GOODPEOPLE");
        PeopleType.valueOf("");
        System.out.println(1);
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
