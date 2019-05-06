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



}
