package com.example.foreach;

/**
 * @author: Monster
 * @date: 2019-08-06 15:58
 **/
public class ForeachTest {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
