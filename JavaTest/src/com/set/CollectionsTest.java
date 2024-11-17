package com.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsTest {

	public static void main(String[] args) {
		LinkedList  list = new LinkedList();
		
		list.add(new Integer(8));
		list.add(new Integer(-8));
		list.add(new Integer(20));
		list.add(new Integer(-20));
		
		
		/**
		 * 自然排序 reverseOrder()
		 */
		Comparator r = Collections.reverseOrder();
		
		Collections.sort(list,r);
		
		for(Iterator iter = list.iterator();iter.hasNext();){
			System.out.println(iter.next()+"");
		}
		
		System.out.println("=======================");
		
		
		/**
		 *  打乱顺序 
		 */
		Collections.shuffle(list);
		
		for(Iterator iter = list.iterator();iter.hasNext();){
			System.out.println(iter.next()+"");
		}
		
		/**
		 * 从集合当中寻找最小值，最大值
		 */
		System.out.println("minimum value: "+ Collections.min(list) );
		System.out.println("maximum value: "+ Collections.max(list) );
	}
}
