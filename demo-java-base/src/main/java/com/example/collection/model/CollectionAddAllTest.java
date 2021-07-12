package com.example.collection.model;

import java.util.ArrayList;

public class CollectionAddAllTest {
	public static void main(String[] args) {
		ArrayList<String> resultList=new ArrayList<>();
		//ArrayList的实现里使用了copy，应该没有问题
		for(int i=0;i<10;i++){
			ArrayList<String> temp=new ArrayList<>();
			temp.add(new String(new Double(Math.random()).toString()));
			temp.add(new String(new Double(Math.random()).toString()));
			resultList.addAll(temp);
		}
		System.out.println(resultList.toString());
	}
}
