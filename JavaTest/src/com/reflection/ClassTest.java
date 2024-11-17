package com.reflection;

public class ClassTest {

	public static void main(String[] args) {
		Class<? extends Object> classType = Child.class;

		// 打印Child的Class Object
		System.out.println(classType);// class com.reflection.Child

		// 打印 Child的 父类的 Class Object
		classType = classType.getSuperclass();
		System.out.println(classType);// class com.reflection.Parent

		// 打印Parent的父类的 Class Object
		classType = classType.getSuperclass();
		System.out.println(classType); // class java.lang.Object

		// 打印Parent的父类的 Class Object
		classType = classType.getSuperclass();
		System.out.println(classType); //Null Object没有父类，so print null
	}
}

class Parent {

}

class Child extends Parent {

}