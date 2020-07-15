package com.example.general.inherit;

import lombok.Data;

@Data
public class TwoParam<T> extends OneParam {
    private T t;

    public static void main(String[] args) {
        TwoParam two=new TwoParam<>();
        two.setO(new Dog());
        two.setT(new Pig());
        System.out.println(two);
    }
}
