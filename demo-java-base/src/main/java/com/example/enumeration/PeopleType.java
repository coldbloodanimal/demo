package com.example.enumeration;

public enum PeopleType {
    GOODPEOPLE("GOOD_PEOPLE"),BADPEOPLE("BAD_PEOPLE");

    private String context;
    PeopleType(String context){
        this.context=context;
    }

    public String getContext(){
        return this.context;
    }


    public static void main(String[] args) {
        for (PeopleType value : PeopleType.values()) {
            System.out.print(value.toString());
            System.out.println(value.getContext());
        }
    }
}
