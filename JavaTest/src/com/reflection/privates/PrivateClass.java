package com.reflection.privates;

public class PrivateClass {
	
	private String name ="lisi";

	
	private String sayHello(String name) {
		return "hello : " + name;
	}

	public String getName(){
		return name;
	}
}
