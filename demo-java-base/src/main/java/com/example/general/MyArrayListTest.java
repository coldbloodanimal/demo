package com.example.general;

/**
 * @author: Monster
 * @date: 2019-07-23 14:41
 **/
public class MyArrayListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list=new MyLinkedList<>();
        list.add("good");
        list.add("better");
        list.add("best");
        System.out.println(list.getSize());
    }

    public static void do1(){
        MyBox<String> list=new MyBox<>();
        list.add("xiaoming");
        System.out.println(list.get());
    }


    public static void do2(){
        MyBox<Integer> list=new MyBox<>();
        list.add(6);
        System.out.println(list.get());
    }


}
