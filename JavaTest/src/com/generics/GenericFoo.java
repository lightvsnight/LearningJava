package com.generics;

/**
 * 
 * @author L.hk
 *
 * @param <T>
 * 
 * 这个T不是一个java类，T称之为泛型，是一个广泛的类型，
 * T并不代表一个具体数值本身，
 * T代表的一种类型的信息。String，Integer等类型信息
 */

public class GenericFoo<T> {
     
	private T foo;

	public T getFoo() {
		return foo;
	}

	public void setFoo(T foo) {
		this.foo = foo;
	}
	
	
	public static void main(String[] args) {
		GenericFoo<Boolean> foo1 = new GenericFoo<Boolean>();
		foo1.setFoo(new Boolean(false));
		
		GenericFoo<Integer> foo2 = new GenericFoo<Integer>();
		foo2.setFoo(new Integer(1));
		
		GenericFoo<String> foo3 = new GenericFoo<String>();
		foo3.setFoo(new String("aa"));
		
		
		System.out.println(foo1.getFoo());
		System.out.println(foo2.getFoo());
		System.out.println(foo3.getFoo());
		
		
	}
     
}
