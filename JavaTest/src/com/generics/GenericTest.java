package com.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 泛型--类型通配声明
 * @author L.hk
 */
public class GenericTest<T> {
	
	private T foo;
	
	public T getFoo() {
		return foo;
	}
	public void setFoo(T foo) {
		this.foo = foo;
	}
	
	public static void main(String[] args) {
		GenericTest<? extends List> ge = null;

		ge = new GenericTest<ArrayList>();
		ge = new GenericTest<LinkedList>();
		
		
		/*
		 * super 指的是 List之上的类型(父类型)
		 * 
		 */
		GenericTest<? super List>  ge2 = null;
		ge2 = new GenericTest();//GenericTest() 等价于GenericTest<Object>()
		ge2 = new GenericTest<Object>();
		
		
		//ge2 = new GenericTest<ArrayList>(); ArrayList是list之下的类型(子类型)
		
		/*
		 * String类型
		 */
		GenericTest<String>  ge3 = new GenericTest<String>();
		ge3.setFoo("hello world");
		
		GenericTest<? extends Object> ge4 = ge3;
		
		System.out.println(ge4.getFoo());
		ge4.setFoo(null);
		System.out.println(ge4.getFoo());
	}
	
}