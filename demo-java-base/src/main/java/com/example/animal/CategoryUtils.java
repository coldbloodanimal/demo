package com.example.animal;

import java.util.List;

/**
 * @author: Monster
 * @date: 2019-09-29 11:31
 **/
public class CategoryUtils {

    private static List<Category> categories;
    static {

    }


    public static Category getRandom(){
        return categories.stream().findAny().get();
    }
}
