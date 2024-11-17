package com.strategy.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * 策略：根据id排序
 * @author L.hk
 * @param <T>
 *
 */
public class IdSortsStrategy implements Strategy,Comparator<Person> {

	/*
	 * (non-Javadoc)
	 * @see com.strategy.example.Strategy#Sort_asc(java.util.List)
	 * 
	 * 根据id 正序
	 */
	@Override
	public List<Person> sortAsc(List<Person> list) {
		BubbleSort.bubbleSort_asc(list);//冒泡排序  方法一 , 没有用到策略
		
		//TreeSet<Person> ts = new TreeSet<Person>(new IdSortsStrategy());
		
		return list;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.strategy.example.Strategy#Sort_desc(java.util.List)
	 * 
	 * 根据id 倒序
	 */
	@Override
	public List<Person> sortDesc(List<Person> list) {
		
		//BubbleSort.bubbleSort_desc(list);//冒泡排序  方法一
		
		//方法二  treeSet 排序
		TreeSet<Person> ts = new TreeSet<Person>(new IdSortsStrategy());
		 for(Person o : list){
			 ts.add(o);
		 }
		 list.clear();
		 
		 for(Iterator<Person> iter = (Iterator<Person>) ts.iterator(); iter.hasNext(); ){
			 list.add(iter.next());
		 }
		return list;
	}
	
	@Override
	public int compare(Person o1, Person o2) {
		
		Integer in1 = o1.getId();
		Integer in2 = o2.getId();
		 
		 /**
	       * Integer.compareTo()
	       * 如果该 Integer 等于 Integer 参数，则返回 0 值；
	       * 如果该 Integer 在数字上小于 Integer 参数，则返回小于 0 的值；
	       * 如果 Integer 在数字上大于 Integer 参数，则返回大于 0 的值（有符号的比较）。
	       */
		  return -in1.compareTo(in2);
	}

	public static void main(String[] args) {
		
		Person p1 = new Person(8,"xiaoli",20);
		Person p2 = new Person(3,"xiaowang",19);
		Person p3 = new Person(6,"xiaozhang",23);
		Person p4 = new Person(5,"xiaohuang",25);
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		IdSortsStrategy iss = new IdSortsStrategy();
		System.out.println(iss.sortAsc(list));
		System.out.println(iss.sortDesc(list));
	}
}

