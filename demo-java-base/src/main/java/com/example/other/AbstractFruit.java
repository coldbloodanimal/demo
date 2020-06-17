package com.example.other;

public class AbstractFruit {
    public  String name;

    public static void main(String[] args) {
        AbstractFruit fruit=new AbstractFruit();
        fruit.name="lili";
        fruit.hha();
        System.out.println(fruit.name);
    }

    public final void  hha(){
        System.out.println("haha");
    }

    public void  hha(String aa) throws RuntimeException{
        System.out.println("haha");
    }
}
