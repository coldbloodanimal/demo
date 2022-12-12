package com.example.general.method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneralMethodInvoke {
    public <D,R> R route(D data){
        //return (R) eee();
        return (R) asList(new ArrayList<>());
    }

    private String eee() {
        return "sssss";
    }

    private Map<String,Object> asList(List<String> ppp) {
        return new HashMap<>();
    }

    public static void main(String[] args) {
        GeneralMethodInvoke g=new GeneralMethodInvoke();
        Map<String,Object> m=g.route("SS");
    }
}
