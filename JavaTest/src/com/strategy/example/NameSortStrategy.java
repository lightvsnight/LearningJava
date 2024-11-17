package com.strategy.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * 名字排序
 * 
 * @author L.hk
 *
 */
public class NameSortStrategy implements Strategy {
	
	
	/*
	 * NameAscComparator.class
	 * 代表一种策略模式：此种策略，是特定的一种方式 
	 */
	TreeSet<Person> tsAsc = new TreeSet<Person>(new NameAscComparator());
	   
	@Override
	public List sortAsc(List<Person> list) {
		for (Object o : list.toArray()) {
			 Person p = (Person)o;
			 tsAsc.add(p);
		}
		
		list.clear();
		for(Iterator<Person> iter = tsAsc.iterator(); iter.hasNext();){
			list.add(iter.next());
		}
		return list;
	}
	
	
	TreeSet<Person> ts = new TreeSet<Person>(new NameDescComparator());
	@Override
	public List sortDesc(List<Person> list) {
		
		for (Object o : list.toArray()) {
			 Person p = (Person)o;
			 //ts.add() return boolean值
			 System.out.println(ts.add(p));
		}
		
		list.clear();
		for(Iterator<Person> iter = ts.iterator(); iter.hasNext();){
			list.add(iter.next());
		}
		return list;
	}

	public static void main(String[] args) {

		Person p1 = new Person(8, "xiaoli", 20);
		Person p2 = new Person(3, "xiaowang", 19);
		Person p3 = new Person(6, "xiaoli", 23);
		Person p4 = new Person(5, "xiaohuang", 25);

		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		NameSortStrategy nss = new NameSortStrategy();
		System.out.println(nss.sortDesc(list));
	}

}

/**
 * 
 * @author L.hk 自定义 comparator 比较器
 */
class NameAscComparator implements Comparator<Object> {

	// 重写compare方法
	@Override
	public int compare(Object arg0, Object arg1) {

		String s1 = ((Person)arg0).getName();
		String s2 = ((Person)arg1).getName();

		/**
		 * compareTo 按字典顺序比较两个字符串
		 * 
		 * 如果参数字符串等于此字符串，则返回值 0； 如果此字符串按字典顺序小于字符串参数，则返回一个小于 0 的值；
		 * 如果此字符串按字典顺序大于字符串参数，则返回一个大于 0 的值
		 */
		return s1.compareTo(s2);
	}
}

class NameDescComparator implements Comparator<Object> {

	// 重写compare方法
	@Override
	public int compare(Object arg0, Object arg1) {

		String s1 = ((Person)arg0).getName();
		String s2 = ((Person)arg1).getName();

		//当对象名称相同时，根据id排序
		if(s1.equals(s2)){
			Integer i1 = ((Person)arg0).getId();
			Integer i2 = ((Person)arg1).getId();
			
			return -i1.compareTo(i2);
		}
		/**
		 * compareTo 按字典顺序比较两个字符串
		 * 
		 * 如果参数字符串等于此字符串，则返回值 0； 如果此字符串按字典顺序小于字符串参数，则返回一个小于 0 的值；
		 * 如果此字符串按字典顺序大于字符串参数，则返回一个大于 0 的值
		 */
		return -s1.compareTo(s2);
	}
}