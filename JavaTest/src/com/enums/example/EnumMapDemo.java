package com.enums.example;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
		
	public static void main(String[] args) {
		Map<Action,String> map = new EnumMap<Action,String>(Action.class);
		
		map.put(Action.TURN_LEFT,"向左转");
		map.put(Action.TURN_RIGHT,"向右转");
		map.put(Action.SHOOT,"射击");
		
		for(Action a : map.keySet()){
			
			String key = a.toString();
			String value  = map.get(a);
			
			System.out.println("key :" +key+"  value : "+value);
		}
		
		System.out.println("-----------------------");
		
		for(Action a :Action.values()){
			System.out.println(map.get(a));
		}
	}
}

enum Action{
	TURN_LEFT,TURN_RIGHT,SHOOT;
}