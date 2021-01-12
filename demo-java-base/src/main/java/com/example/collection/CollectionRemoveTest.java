package com.example.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionRemoveTest {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("xiaoming");
        names.add("xiaowang");
        names.add("xiaohong");
        names.add("a");
        names.add("b");
        names.add("c");

        String lala="xiaohong";

        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals(lala)){
                names.remove(names.get(i));
            }
        }

        System.out.println(names);
    }
}
