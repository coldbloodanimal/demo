package com.example.initial;

public class StaticPure extends StaticFather{
    public static void main(String[] args) {
        StaticPure staticPure=new StaticPure();
        System.out.println(staticPure.staticFatherVar);
        System.out.println(staticPure.staticVar);
        System.out.println(staticPure.fatherVar);
        System.out.println(staticPure.var);
    }
    static String staticVar="子类静态变量立即赋值";
    String  var="子类实例变量立即赋值";
    static {
        System.out.println("子类静态代码块："+staticVar);
        staticVar="子类实例变量静态代码块赋值";
    }
    {
        System.out.println("子类实例代码块："+var);
        var="子类实例变量实例代码块赋值";
    }
    public StaticPure(){
        System.out.println("子类构造方法："+var);
        var="子类实例变量子类构造方法赋值";
    }
}
class StaticFather{
    static String staticFatherVar="父类静态变量立即赋值";
    String  fatherVar="父类实例变量立即赋值";
    static {
        System.out.println("父类静态代码块："+staticFatherVar);
        staticFatherVar="父类静态变量静态代码块赋值";
    }
    {
        System.out.println("父类实例代码块："+fatherVar);
        fatherVar="父类实例变量实例代码块赋值";
    }
    StaticFather(){
        System.out.println("父类构造方法："+fatherVar);
        fatherVar="父类实例变量父类构造方法赋值";
    }
}
