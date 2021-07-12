package com.example.collection;

import java.util.*;

public class ListMapTest {
	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		for (int i = list.size(); i >0; i=i-2) {
			list.add(i,1111);
		}
		System.out.println(list);
	}
}
