package com.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 限制泛型：ListGenericFoo<T>
 *   限制当前泛型的类型，只能使用某个特定的类型
 * @author L.hk
 *
 * @param <T>
 * 
 * 这个继承形式：<T extends List>
 * 当前T只能是List或者List类型的子类型
 */
public class ListGenericFoo<T extends List<?>> {
   
	private T[] fooArray;

	public T[] getFooArray() {
		return fooArray;
	}

	public void setFooArray(T[] fooArray) {
		this.fooArray = fooArray;
	}
    
	public static void main(String[] args) {
		ListGenericFoo<LinkedList<?>> foo1 = new ListGenericFoo<LinkedList<?>>();
		ListGenericFoo<ArrayList<?>> foo2 = new ListGenericFoo<ArrayList<?>>();
		
		LinkedList<?>[]  linkedList = new LinkedList[10];
		foo1.setFooArray(linkedList);
		
		ArrayList<?>[] arrayList = new ArrayList[10];
		foo2.setFooArray(arrayList);
	}
    
}
