package com.test;

public class Jic {
	public String name;
	 int age;

	public void getInfo() {
		System.out.println("name:" + name + ";" + "age:" + age);
	}
}

 class Student1 extends Jic {
	public String school;

	public void study() {

	}
}

class Student2 {
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.name = "adfadsfa";
		s.age = 10;
		s.getInfo();
	}
}