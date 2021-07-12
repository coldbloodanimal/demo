package com.example.general.general2;

/* 即：class DataHolder implements Generator<T>{
 * 如果不声明泛型，如：class DataHolder implements Generator<T>，编译器会报错："Unknown class"
 */
class FruitGenerator<T> implements Generator<T>{

    @Override
    public T next() {
        return null;
    }
}