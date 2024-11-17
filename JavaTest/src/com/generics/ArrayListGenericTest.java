package com.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListGenericTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		//新式for循环方法
		for (Object o : list.toArray()) {
			String value = (String) o;
			System.out.print(value + " ");
		}
		System.out.println(" ");
		
		//Iterator循环方法
		for (Iterator<String> iter = list.iterator(); iter.hasNext();) {
			String value = iter.next();
			System.out.print(value + " ");
		}
	}
}
