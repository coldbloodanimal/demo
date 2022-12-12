package com.example.jvm;

import javax.security.auth.login.Configuration;

public class Controller {
    Service service=new Service();

    public static void main(String[] args) {
        Controller controller=new Controller();
        controller.hi("nihao");
    }

    public String hi(String hi){
        Thread thread=Thread.currentThread();
        StackTraceElement stack[] = thread.getStackTrace();
        Thread.UncaughtExceptionHandler handler=thread.getUncaughtExceptionHandler();
        for(int i=0;i<stack.length;i++){
            System.out.print(stack[i].getClassName()+" 。"+stack[i].getMethodName()+""+"-----");
        }
        String result=service.say(hi);
        System.out.println(result);
        return result;
    }
}
