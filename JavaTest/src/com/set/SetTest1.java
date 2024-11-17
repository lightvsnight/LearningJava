package com.set;

import java.util.HashSet;
/**
 * HashSet
 * @author L.hk
 *
 */
public class SetTest1 {

	public static void main(String[] args) {
	
		
		/**
		 * 三个问题   
		 *   
		 *   知识点：当使用HashSet类时，java内部会隐性的调用hashCode方法，
		 *   判断已经存储在集合中的对象的hashcode值是否与增加的对象的hashcode值一致；
		 *   如果不一致，直接加进去；如果一致，在进行equals方法的比较，
		 *   equals方法如果返回true，表示集合当中该对象已经加进去了，就不会再增加，否则加进去。
		 */
		HashSet<Object> set = new HashSet<Object>();
	
		
		/**
		 * 介绍：set.add()
		 *    如果此 set 中尚未包含指定元素，则添加指定元素。更确切地讲，
		 *    如果此 set 没有包含满足 (e==null ? e2==null : e.equals(e2)) 的元素 e2，
		 *    则向此 set 添加指定的元素 e。如果此 set 已包含该元素，则该调用不更改 set 并返回 false。 
		 */
		
		System.out.println("-----------一问------------");
		//一问：set会打印什么？
		set.add(new People("zhangsan"));
		set.add(new People("lisi"));
        set.add(new People("zhangsan"));
        
		System.out.println(set);
		
		set.clear();
		System.out.println("-----------二问------------");
		//二问：set会打印出什么？
		People p1 = new People("zhangsan");
		set.add(p1);
		set.add(p1);
		
		System.out.println(set);
		
		
		//三问：s1 和 s2 是否相等，s2是否可以添加到set集合当中
		set.clear();
		System.out.println("-----------三问------------");
		String s1 = new String("a");
		String s2 = new String("a");
		set.add(s1);
		set.add(s2);
		
		System.out.println(set);
		
	}

}

class People {

	String name;

	public People(String name) {
		this.name = name;
	}
}