package com.set;

import java.util.LinkedList;

public class LinkedList_Test {

	public static void main(String[] args) {
		
		
		LinkedList list = new LinkedList();
		
		//list 数组下标从零开始 
		list.add("F");
		list.add("B");
		list.add("D");
		list.add("E");
		list.add("C");
		
		list.addLast("Z");
		list.addFirst("A");
		
		list.add(1,"A2");
		list.add(2,"A3");
		System.out.println("最初的集合: "+list);
		
		/*移除*/
		list.remove("F");
		list.remove(1);
		
		System.out.println("变化之后的集合：" + list);
	}
}
