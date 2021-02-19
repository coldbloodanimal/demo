package com.example.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelNamed {

	public static void main(String[] args) throws Exception {
		String s="CSUP_ID\tCERT_ID\tFAC_ID\tCERT_TYPE_CODE\tCERT_CODE\tCERT_NAME\tSTART_DATE\tEND_DATE\tIS_LONG\tCERT_DATE\tCERT_BUSI\tCHECK_STATE\tCHECK_DATE\tOPER_USER\tOPER_DATE\tIS_STOP\tNEW_CERT_ID\tCHECK_NOTE\tNOTE\tNOTE1\tNOTE2\tNOTE3\tNOTE4\tNOTE5";
		//alias(s,"\t","");
		sqlCamelGood(s,"\t","c");

		//pcamel(s);
	}

	/**
	 * @param s传入的字符串
	 * @param split分隔符
	 * @Param alias表别名
	 * */
	public static String sql(String s,String split,String alias){
		String[] elements=s.split("	");
		StringBuilder sb=new StringBuilder();
		for(String e:elements){
			sb.append(alias+"."+e+" as "+camel(e)+",");
		}
		return sb.toString();
	}

	/**
	 * @param s传入的字符串
	 * @param split分隔符
	 * @Param alias表别名
	 * */
	public static String allCamelsql(String s,String split,String alias){
		String[] elements=s.split("	");
		StringBuilder sb=new StringBuilder();
		for(String e:elements){
			sb.append(alias+"."+camel(e)+" as "+camel(e)+",");
		}
		return sb.toString();
	}

	/**
	 * 下划线命名改为骆驼命名
	 * */
	public static String camel(String s){
		s=s.toLowerCase();
		Pattern pattern=Pattern.compile("_([a-zA-Z])");
		Matcher m=pattern.matcher(s);
		StringBuffer sb=new StringBuffer();
		while(m.find()){
			m.appendReplacement(sb, m.group(1).toUpperCase());
		}
		m.appendTail(sb);
		return sb.toString();
	}
	/**
	 * 字符串数组改为骆驼命名
	 * */
	public static void pcamel(String s){
		String[] ss=s.split("	");
		for(String p:ss){
			System.out.print(","+camel(p));
		}

	}

	/**
	 * 字符串数组改为骆驼命名,for mybatis
	 *
	 * ID,USER_ID,USER_NAME
	 * p.ID as id，p.USER_ID as userId ,p.USER_NAME as userName
	 * */
	public static void sqlCamelGood(String s,String split,String alias){
		String[] ss=s.split(split);
		for(String p:ss){
			p=p.trim();
			System.out.print(alias+"."+p+" as "+camel(p)+" ,");
		}

	}

	/**
	 * 加别名
	 * */
	public static void alias(String s ,String split,String alias){
		String[] ss=s.split(split);
		for(String p:ss){
			p=p.trim();
			System.out.print(alias+"."+p+" ,");
		}
	}

}
