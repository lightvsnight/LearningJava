package com.set;

import java.util.HashSet;

/**
 * 
 * @author L.hk
 *  
 *  set 集合 接口类型
 *  
 *  set集合是无序的，元素不允许重复
 *
 */
public class SetTest {

	public static void main(String[] args){
		
		HashSet<Object> set = new HashSet<Object>();
		
		//set.add()方法返回boolean类型，如果添加成功返回true，否则返回false
		System.out.println(set.add("a"));
		set.add("b");
		set.add("c");
		set.add("d");
		
		System.out.println(set.add("a"));//不会出现重复的
		
		System.out.println(set);//证明set是无序的
		
	}
}
