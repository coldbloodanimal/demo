package com.example.innerclass;

import lombok.Data;
import lombok.Setter;

/**
 * @author: Monster
 * @date: 2019-08-12 16:02
 **/
public class MyInnerClass {
    @Setter
    private String name;
    public void doit(){
        new TheInnerClass().printName();
    }
    private class TheInnerClass{
        private void printName(){
            System.out.println(MyInnerClass.this.name);
        }
    };

    public static void main(String[] args) {
        MyInnerClass myInnerClass=new MyInnerClass();
        myInnerClass.setName("lala");
        myInnerClass.doit();
    }


}
