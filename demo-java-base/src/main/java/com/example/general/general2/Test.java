package com.example.general.general2;

import java.util.*;

public class Test {
    public static void main(String[] args) {

//调用代码及输出
        List<Table> tableList = new ArrayList<Table>();
        Map<Room, Table> maps = new HashMap<Room, Table>();
        House<Room> house = new House<Room>();
        Particle<Long, Double> particle = new Particle<Long, Double>();
        System.out.println(Arrays.toString(tableList.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(maps.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(house.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(particle.getClass().getTypeParameters()));
    }


}

class Table {}
class Room {}
class House<Q> {}
class Particle<POSITION, MOMENTUM> {}
