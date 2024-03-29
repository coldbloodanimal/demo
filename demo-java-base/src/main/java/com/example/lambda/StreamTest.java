package com.example.lambda;

import com.example.animal.AnimalUtil;
import com.example.animal.Dog;
import com.example.animal.People;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * @author: Monster
 * @date: 2019-06-15 19:10
 **/
public class StreamTest {
	public static void main(String[] args) {
		List<Dog> dogs = AnimalUtil.getDogs();
		Random r = new Random();
		String e = dogs.get(r.nextInt(dogs.size())).getName();
		System.out.println(e);
		//System.out.println(AnimalUtil.getDogs().stream().map(p->p.getName()).f.get());
		List<People> peopleList=AnimalUtil.getPeople();
//		peopleList.stream()
//				.flatMap(p->p.getDogs().stream().map(d->d.getName()).collect(Collectors.toSet())).collect(Collectors.toSet());
//		// System.out.println(getNameOfDogs(peopleList));
		System.out.println(listToMap(AnimalUtil.getDogs()));

		// List<Dog> dogs=AnimalUtil.getEmptyDogs().stream().limit(3).collect(Collectors.toList());
//        System.out.println(dogs);
		//Map<Long,List<Dog>> userCouponIdAndOrderIdList=dogs.stream().collect(Collectors.groupingBy(Dog::getSex, Collectors.mapping(Dog::getSex,Collectors.toList())));

		//使用名称构成数组
		//List<String> names=dogs.stream().map(Dog::getName).collect(Collectors.toList());

		//List<String> names=dogs.stream().map(Dog::getName).collect(Collectors.toList());



		Map<Integer, List<Integer>> namesByCity
				= dogs.stream().collect(groupingBy(Dog::getSex,
				mapping(Dog::getAge, toList())));

		Map<Integer, List<Integer>> aa
				= dogs.stream().collect(groupingBy(p->p.getSex(),
				mapping(p->p.getAge(), toList())));


		Map<Integer, Map<String,Object>> bb
				= dogs.stream().collect(groupingBy(p->p.getSex(),
				Collectors.toMap(p->p.getName(),p->p)));
	}

	/**
	 * sort bad
	 */
	public static void sortDogByName(List<People> peopleList) {
		List<String> nameOfDogs = peopleList.stream().flatMap(t -> t.getDogs().stream()).sorted().map(Dog::getName).collect(Collectors.toList());
	}

	public static List<String> getNameOfDogs(List<People> peopleList) {
		List<String> nameOfDogs = peopleList.stream().flatMap(t -> t.getDogs().stream()).map(Dog::getName).collect(Collectors.toList());
		return nameOfDogs;
	}

	public static void list(List<Dog> dogs) {

	}

	public static void listToSet(List<Dog> dogs) {

	}

	/**
	 * List to map demo
	 */
	public static Map<String, Integer> listToMap(List<Dog> dogs) {
		Map<String, Integer> map = dogs.stream().collect(Collectors.toMap(Dog::getName, Dog::getAge, (s, a) -> a));
		return map;
	}

	/**
	 * 返回非空值
	 */
	public static void notNull() {
		Integer zoro = null;
		System.out.println(Optional.ofNullable(zoro).orElse(1));
	}

	/**
	 * 返回非空值
	 */
	public static void filter(List<Dog> dogs) {
		dogs.stream().filter(t -> t.getAge() == 5).forEach(t -> {
			t.setSex(1);
			System.out.print(t);
		});
	}
}
