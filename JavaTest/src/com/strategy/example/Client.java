package com.strategy.example;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Person p1 = new Person(8,"xiaoli",20);
		Person p2 = new Person(3,"xiaowang",19);
		Person p3 = new Person(6,"xiaozhang",23);
		Person p4 = new Person(5,"xiaohuang",25);
		
        List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);  
		
		//IdSortsStrategy idSortsStrategy = new IdSortsStrategy();
		Strategy strategy = new IdSortsStrategy();
		House house = new House(strategy);
		System.out.println(house.sortAsc(list));
		System.out.println(house.sortDesc(list));
	}
	
	
	
}
