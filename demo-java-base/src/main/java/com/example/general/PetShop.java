package com.example.general;

import com.example.animal.AnimalUtil;
import com.example.animal.Dog;
import com.example.animal.Host;
import com.example.animal.People;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Monster
 * @date: 2019-11-19 14:25
 **/
@Data
public class PetShop<T>{
    private Host ownner;
    private List<T> pets;
    private List<Host> hosts;


    public static void main(String[] args) {
        PetShop dogPetShop=new PetShop<>();
        List<Dog> dogs= AnimalUtil.getDogs();
        dogPetShop.setOwnner(new Host());
        for (Object host : dogPetShop.getHosts()) {
            
        }
        //dogPetShop.getPets().stream().map(Dog::getName).collect(Collectors.toList());
    }
}
