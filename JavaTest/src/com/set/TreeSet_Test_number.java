package com.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 
 * @author L.hk
 * 
 * 
 *
 */
public class TreeSet_Test_number {
	public static void main(String[] args) {
         
	   /**
         *   treeSet 在使用时，如果添加自定义对象时，需要明确指定一种排序规则。
         *   如果没有指定则会出现  java.lang.ClassCastException异常
         */
		TreeSet<Object> ts = new TreeSet<Object>(new NumberComparator());
          
          
         
          Person p1 = new Person(10);
          Person p2 = new Person(20);
          Person p3 = new Person(20);
          Person p4 = new Person(40);
          
          ts.add(p1);
          ts.add(p2);
          ts.add(p3);
          ts.add(p4);
          
          System.out.println(ts);
	}
	
}
class Person{
	String name;
	int score;
	
	public Person(int score){
		this.score = score;
	}
	
	public String toString(){
		return String.valueOf(this.score);
	}
}

class NumberComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
         
		Integer in1 = p1.score;
		Integer in2 = p2.score;
		
		
	 /**
       * Integer.compareTo()
       * 如果该 Integer 等于 Integer 参数，则返回 0 值；
       * 如果该 Integer 在数字上小于 Integer 参数，则返回小于 0 的值；
       * 如果 Integer 在数字上大于 Integer 参数，则返回大于 0 的值（有符号的比较）。
       */
	  return in1.compareTo(in2);
	}
	
}
