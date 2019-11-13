package com.example.lambda;

import com.example.animal.AnimalUtil;
import com.example.animal.Dog;
import com.example.animal.People;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author: Monster
 * @date: 2019-06-15 19:10
 **/
public class StreamTest {
    public static void main(String[] args) {
        //List<People> peopleList=AnimalUtil.getPeople();
       // System.out.println(getNameOfDogs(peopleList));
        System.out.println(listToMap(AnimalUtil.getDogs()));

        List<Dog> dogs=AnimalUtil.getEmptyDogs().stream().limit(3).collect(Collectors.toList());
        System.out.println(dogs);
        //Map<Long,List<Long>> userCouponIdAndOrderIdList=mallOrderInfoEntityList.stream().collect(Collectors.groupingBy(MallOrderInfoEntity::getUserCouponId, Collectors.mapping(MallOrderInfoEntity::getId,Collectors.toList())));

        //使用名称构成数组
        //List<String> names=dogs.stream().map(Dog::getName).collect(Collectors.toList());

        //List<String> names=dogs.stream().map(Dog::getName).collect(Collectors.toList());
    }

    /**
     * sort bad
     * */
    public static void sortDogByName(List<People> peopleList){
        List<String> nameOfDogs=peopleList.stream().flatMap(t->t.getDogs().stream()).sorted().map(Dog::getName).collect(Collectors.toList());
    }

    public static List<String> getNameOfDogs(List<People> peopleList){
        List<String> nameOfDogs=peopleList.stream().flatMap(t->t.getDogs().stream()).map(Dog::getName).collect(Collectors.toList());
        return nameOfDogs;
    }

    public static void list(List<Dog> dogs){

    }

    public static void listToSet(List<Dog> dogs){

    }

    /**
     * List to map demo
     * */
    public static Map<String,Integer> listToMap(List<Dog> dogs){
        Map<String,Integer> map=dogs.stream().collect(Collectors.toMap(Dog::getName,Dog::getAge,(s,a)->a));
        return map;
    }

    /**
     * 返回非空值
     * */
    public static void notNull(){
        Integer zoro=null;
        System.out.println(Optional.ofNullable(zoro).orElse(1));
    }

    /**
     * 返回非空值
     * */
    public static void filter(List<Dog> dogs){
        dogs.stream().filter(t->t.getAge()==5).forEach(t->{
            t.setSex(1);
            System.out.print(t);
        });
    }
}
