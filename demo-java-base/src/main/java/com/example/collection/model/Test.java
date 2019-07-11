package com.example.collection.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Monster
 * @date: 2019-07-03 15:42
 **/
public class Test {
    public static void main(String[] args) {
        Country country=initCountry();

        p2(country);
    }


    public static void p2( Country country){
        List<Family> families=country.getFamilies();
        for (int i = 0; i < families.size(); i++) {
            Family family=families.get(i);
            List<People> peoples=family.getPeoples();
            for (int j = 0; j < peoples.size(); j++) {
                People people=peoples.get(j);
                if(i==0&&j==0){
                    System.out.print(country.getName());
                }
                if (j == 0) {
                    System.out.print(": "+family.getName());
                }
                System.out.print(":"+people.getName());
                System.out.println();
            }
        }
    }

    private static Country initCountry() {
        Country country=new Country("china");

        List<Family> families=new ArrayList<>();

        Family family1=new Family("james");
        List<People> family1People=new ArrayList<>();
        family1People.add(new People("james.man"));
        family1People.add(new People("james.woman"));
        family1.setPeoples(family1People);
        families.add(family1);

        Family family2=new Family("wang");
        List<People> family2People=new ArrayList<>();
        family2People.add(new People("wang.man"));
        family2People.add(new People("wang.woman"));
        family2.setPeoples(family2People);
        families.add(family2);


        country.setFamilies(families);
        return country;
    }

    public static void p1( Country country){
        for (Family family : country.getFamilies()) {
            for (People people : family.getPeoples()) {

                System.out.print(country.getName());
                System.out.print(": "+family.getName());
                System.out.print(":"+people.getName());
                System.out.println();
            }
        }
    }



}
