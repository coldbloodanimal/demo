package com.example.collection.model;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> sets=new HashSet<>();
        sets.add(897);
        sets.add(888);
        sets.add(null);
        sets.add(null);
        System.out.println(sets.size());
    }
}
