package com.example.collection;

import com.example.DemoJavaBaseApplication;
import org.springframework.boot.SpringApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: Monster
 * @date: 2019-05-08 15:23
 **/
public class CollectionTest {
    public static void main(String[] args) {
        List<Fighter> fighterList=new ArrayList<>();
        Fighter f1=new Fighter();
        f1.setName("xiaoming");
        f1.setAge(5);
        f1.setCombatPower(5);

        Fighter f2=new Fighter();
        f2.setName("xiaohong");
        f2.setAge(6);
        f2.setCombatPower(4);

        fighterList.add(f1);
        fighterList.add(f2);

        Collections.sort(fighterList);
        System.out.println(fighterList);



    }

}
