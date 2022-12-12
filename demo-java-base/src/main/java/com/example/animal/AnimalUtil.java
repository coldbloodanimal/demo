package com.example.animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author: Monster
 * @date: 2019-06-15 19:15
 **/
public class AnimalUtil {

    public static void main(String[] args) {
        List<Dog> dogs= AnimalUtil.getDogs();
        List<Dog> myDogs=dogs.subList(1,3);
        System.out.println(myDogs);
    }

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
//        String[] names={"aaa","bbb","ccc","ccc","ddd"};
//        int[] ages={9,5,2,4,5};
//        List<Dog> dogs=new ArrayList<>();
//        for(int i=0;i< names.length;i++){
//            Dog dog=new Dog();
//            dog.setName(names[i]);
//            dog.setAge(ages[i]);
//            dogs.add(dog);
//        }
//        return dogs;
        return null;
    }


    public static List<Dog> getEmptyDogs(){
        return new ArrayList<>();
    }

//    public static String getDogName(Dog dog){
//        return Optional.ofNullable(dog).map(t->t.getName()).orElse("lala");
//    }


    //人生成器
    public static List<People> getPeople() {
        List<People> peopleList=new ArrayList<>();
        People people1=new People();
        people1.setDogs(getDogs());
        peopleList.add(people1);
        People people2=new People();
        people2.setDogs(getDogs());
        peopleList.add(people2);
        return peopleList;
    }
}
