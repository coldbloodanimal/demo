package com.example.collection;

import com.example.animal.Animal;
import com.example.animal.Dog;
import com.example.animal.Ghost;
import com.example.animal.Pig;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Monster
 * @date: 2019-06-27 15:05
 **/
public class ArrayListTest {
    public static void main(String[] args) {
      //  baddelete2();

        //goodDelete();
        List<String> list=new ArrayList();

        System.out.println(list.stream().collect(Collectors.joining()));

    }


    public static void lala() {
        List<Integer> list=new ArrayList(10);
        list.add(8);
        list.add(7,6);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void goodDelete(){

        List<Ghost> list=new ArrayList<>();
        list.add(new Ghost("xiaoming"));
        list.add(new Ghost("xiaohong"));
        list.add(new Ghost("xiaowang"));
        list.add(new Ghost("zz"));
        Iterator<Ghost> iterator=list.iterator();
        while(iterator.hasNext()){
            Ghost ghost=iterator.next();
            if(ghost.getName().equals("xiaohong")||ghost.getName().equals("xiaowang")){
                iterator.remove();
            }
        }

    }

    public static void baddelete(){

        List<Ghost> list=new ArrayList<>();
        list.add(new Ghost("xiaoming"));
        list.add(new Ghost("xiaohong"));
        list.add(new Ghost("xiaowang"));
        list.add(new Ghost("zz"));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals("xiaohong")||list.get(i).getName().equals("xiaowang")){
                list.remove(i);
            }
        }
    }

    public static void baddelete2(){

        List<Ghost> list=new ArrayList<>();
        list.add(new Ghost("xiaoming"));
        list.add(new Ghost("xiaohong"));
        list.add(new Ghost("xiaowang"));
        list.add(new Ghost("zz"));
        for (Ghost ghost : list) {
            if(ghost.getName().equals("xiaohong")||ghost.getName().equals("xiaowang")){
                list.remove(ghost);
            }
        }


        System.out.println(list);

    }
    public static void zz() {
        List<Animal> list=new ArrayList<>();
        List<Dog> doglist=new ArrayList<>();
        List<Dog> piglist=new ArrayList<>();
        list.addAll(doglist);
        list.addAll(piglist);
    }

}
