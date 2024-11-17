package com.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
/**
 * 
 * @author L.hk
 * 
 * 树形集合
 *
 */
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Object> ts = new TreeSet<Object>(); //不允许重复值
		List list = new ArrayList();
		ts.add("B");
		ts.add("C");
		ts.add("D");
		ts.add("A");
		ts.add("E");
		ts.add("F");
		ts.add("A");
		System.out.println(ts);
		
		System.out.println("ts.first()方法:"+ ts.first());
		
		System.out.println("----------------------------");
		for(Iterator iter =ts.iterator();iter.hasNext();){
			list.add(iter.next());
		}
		for(Object o :list.toArray()){
			System.out.print(o + " ");
		}
	}
}
