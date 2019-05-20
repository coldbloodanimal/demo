package com.example.collection;

import lombok.Data;

/**
 * @author: Monster
 * @date: 2019-05-08 13:57
 **/
@Data
public class Fighter implements Comparable<Fighter>{
    private String name;
    private int age;
    private int combatPower;


    @Override
    public int compareTo(Fighter o) {
        if (this.age>o.getAge()){
            return 1;
        }else if(this.age==o.getAge()){
            return 0;
        }else if(this.age<o.getAge()){
            return -1;
        }
        return 0;
    }
}
