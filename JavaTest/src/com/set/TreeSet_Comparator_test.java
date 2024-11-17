package com.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 
 * @author L.hk
 * 
 *  comparator 应用
 */
public class TreeSet_Comparator_test {
	public static void main(String[] args) {
		TreeSet<Object> ts = new TreeSet<Object>(new MyComparator());
		
		ts.add("Bubble");
		ts.add("Can");
		ts.add("Do");
		ts.add("Abstract");
		ts.add("Do");
		ts.add("Else");
		ts.add("Foot");
		
		System.out.println(ts);
	}
}

/**
 * 
 * @author L.hk
 * 自定义 comparator 比较器
 */
class MyComparator implements Comparator<Object>{

	//重写compare方法
	@Override
	public int compare(Object arg0, Object arg1) {
		
		String s1 = (String)arg0;
		String s2 = (String)arg1;
		
		
		/**
		 * compareTo   按字典顺序比较两个字符串
		 *  
		 *  如果参数字符串等于此字符串，则返回值 0；
		 *  如果此字符串按字典顺序小于字符串参数，则返回一个小于 0 的值；
		 *  如果此字符串按字典顺序大于字符串参数，则返回一个大于 0 的值
		 */
		return s1.compareTo(s2);
	}
	
}
