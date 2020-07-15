package com.example.general.method;

public interface DTOConverter {
    public abstract  <A,B> B toB(A a,Class<B> clazz);
    public abstract  <A,B> B toB(A a);
}
