package com.example.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionRemoveAllTest {
	public static void main(String[] args) {
		List<String> aa=new ArrayList<>();
		aa.add("11");
		aa.add("22");

		List<String> bb=new ArrayList<>();
		bb.add("22");
		bb.add("33");

		aa.removeAll(bb);
		System.out.println(aa);
	}
}
