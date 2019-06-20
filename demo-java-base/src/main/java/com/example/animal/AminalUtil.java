package com.example.animal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Monster
 * @date: 2019-06-15 19:15
 **/
public class AminalUtil {

    //动物生成器
    public static <T> List<T> getDogs(Class clazz,int n) throws IllegalAccessException, InstantiationException {

        //T t=clazz.newInstance();
        return null;
    }

    //狗生成器
    public static List<Dog> getDogs(int n) {
        List<Dog> dogs=new ArrayList<>();
        for(int i=0;i<n;i++){
            Dog d=new Dog();
            //d.setName(getName());
        }
        return null;
    }

    public static List<Dog> getDogs(){
        String[] names={"aaa","bbb","ccc","ddd"};
        int[] ages={9,5,2,5};
        List<Dog> dogs=new ArrayList<>();
        for(int i=0;i<4;i++){
            Dog dog=new Dog();
            dog.setName(names[i]);
            dog.setAge(ages[i]);
            dogs.add(dog);
        }
        return dogs;
    }
}
