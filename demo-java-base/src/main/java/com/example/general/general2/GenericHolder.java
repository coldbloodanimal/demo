package com.example.general.general2;

public class GenericHolder<T> {
    T obj;
    public T getObj() {
        return obj;
    }
    public void setObj(T obj) {
        this.obj = obj;
    }
    public static void main(String[] args) {
        GenericHolder<String> holder = new GenericHolder<>();
        holder.setObj("Item");
        String s = holder.getObj();
    }
}
