package com.example;


import org.apache.log4j.Logger;

/**
 * @author: Monster
 * @date: 2019-07-12 09:28
 **/
public class LogTest {
    static Logger logger=Logger.getLogger(LogTest.class);
    public static void main(String[] args) {
    	String username="world";
		logger.info("hi");
		logger.error("error");
	//	logger.error("hello,{}!",username);

    }

    public static void do1(){

        System.out.println(Boolean.TRUE.toString());
        System.out.println(Boolean.TRUE.toString().equals("true"));
//        Logger logger = Logger.ROOT_LOGGER_NAME;
//        //Logger logger=new Logger();
//        logger.trace("trace level");
//        logger.debug("debug level");
//        logger.info("info level");
//        logger.warn("warn level");
//        logger.error("error level");
        // logger.fatal("fatal level");
    }

    public static void do2(){

    }
}
