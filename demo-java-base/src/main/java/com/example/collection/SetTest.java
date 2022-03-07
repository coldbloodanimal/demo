package com.example.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: zw
 * @Date: 2021/9/16 9:55
 */
public class SetTest {
	public static void main(String[] args) {
		Set<String> s1=new HashSet<>();
		s1.add("aa");
		s1.add("bb");
		s1.add(null);
		System.out.println(s1);
		Set<String> s2=new HashSet<>();
		s2.add("aa");
		s2.add("bb");
		s2.add("dd");
		s1.removeAll(s2);
		System.out.println(s1);
	}
}
