package com.example.users;

public class SysException extends RuntimeException{
    public static SysException throwSysException(){
        throw new SysException();
    }
}
