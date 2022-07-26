package com.example.lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: zw
 * @Date: 2022/3/31 13:58
 */
public class StreamReduceTest {
	public static void main(String[] args) {


		Set<BigDecimal> sets=new HashSet<>();
		sets.add(BigDecimal.ONE);
		sets.add(BigDecimal.TEN);
		//sets.add(null);
		System.out.println(sets.stream().findFirst().orElse(BigDecimal.ZERO));
		System.out.println(sets.stream().min(BigDecimal::compareTo).orElse(null));
		List<BigDecimal> list=new ArrayList<>();
		list.add(BigDecimal.ONE);
		list.add(BigDecimal.TEN);
		list.add(null);
	//	System.out.println(list.stream().reduce(BigDecimal.ZERO,BigDecimal::add));
		//Integer f=list.stream().reduce(2,(a,b)->a+b);



	}
}
