package com.example.number;

import org.springframework.util.ObjectUtils;

import java.math.BigDecimal;

/**
 * @Author: zw
 * @Date: 2021/11/1 16:37
 */
public class BigDecimalCompareTest {
	public static void main(String[] args) {
		BigDecimal b1=new BigDecimal(1.1100);
		BigDecimal b4=new BigDecimal(1.11000);
		BigDecimal b2=new BigDecimal("1.110");
		BigDecimal b3=new BigDecimal("1.110000");

		System.out.println(new BigDecimal(""));
		System.out.println(b1.compareTo(b4));
		System.out.println(b1.compareTo(b2));
		System.out.println(b2.compareTo(b3));
		System.out.println(b1.equals(b4));
		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b3));
		System.out.println(ObjectUtils.nullSafeEquals(b1,b4));
		System.out.println(ObjectUtils.nullSafeEquals(b1,b2));
		System.out.println(ObjectUtils.nullSafeEquals(b2,b3));
	}
}
