package com.example.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Monster
 * @date: 2019-06-27 15:05
 **/
public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList(10);
        list.add(8);
        list.add(7,6);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
