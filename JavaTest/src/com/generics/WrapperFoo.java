package com.generics;

/**
 * ·ºÐÍµÄ·ºÐÍ
 * 
 * @author L.hk
 * @param <T>
 */
public class WrapperFoo<T> {

	private Generic3<T> foo;

	public Generic3<T> getFoo() {
		return foo;
	}

	public void setFoo(Generic3<T> foo) {
		this.foo = foo;
	}

	public static void main(String[] args) {
		Generic3<Integer> foo = new Generic3<Integer>();
		 foo.setFoo(new Integer(-10));
		 
		 WrapperFoo<Integer> wrapper = 	new WrapperFoo<Integer>();
		 wrapper.setFoo(foo);
		 
		 
		 Generic3<Integer>  g =  wrapper.getFoo();
		 System.out.println(g.getFoo());
	}
}

/**
 *  
 * @author L.hk
 *
 * @param <T>
 */
class Generic3<T> {
  private T foo;

public T getFoo() {
	return foo;
}

public void setFoo(T foo) {
	this.foo = foo;
}
}