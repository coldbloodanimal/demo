package com.example.general;

public class TwoGen<T, V> {
    public TwoGen() {

    }

    public static void main(String[] args) {
        TwoGen<String,Object> two=new TwoGen<>();

        //TwoGen<String> two2=new TwoGen<>();
    }

    private T ob1;
    private V ob2;

    public TwoGen(T o1,V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    public void showTypes() {
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }
    public T getOb1() {
        return ob1;
    }
    public V getOb2() {
        return ob2;
    }
}