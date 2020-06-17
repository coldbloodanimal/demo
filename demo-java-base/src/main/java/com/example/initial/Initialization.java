package com.example.initial;

public class Initialization {
    private int age;
    private int sex=1;
    private String name;
    private Object innerObject;

    public Initialization() {
        this.name="xiaoming";
    }

    public static void main(String[] args) {
        Initialization initialization=new Initialization();
        System.out.println(initialization);
    }
    public void print(){
        System.out.println(age);
        System.out.println(innerObject);
    }
    private void hi(){
        int i=0;
        i++;
        System.out.println(i);
    }

    @Override
    public String toString() {
        return "Initialization{" +
                "age=" + age +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                ", innerObject=" + innerObject +
                '}';
    }
}
