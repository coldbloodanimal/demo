package com.example.lambda;

/**
 * @author: Monster
 * @date: 2019-07-17 09:58
 **/
public class SimpleLambdaInterfaceTest {
    public static void main(String[] args) {
        SimpleLambdaInterface lambda=(s1,s2)->{
            System.out.println(s1+s2);
        };
        lambda.oba("aa","bb");
        lambda.lala();
    }
}
