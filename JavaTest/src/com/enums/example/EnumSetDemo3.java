package com.enums.example;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class EnumSetDemo3 {
	public static void showEnumSet(EnumSet<FontConstant> enumset) {
		for (Iterator<FontConstant> iter = enumset.iterator(); iter.hasNext();) {
			System.out.println(iter.next());
		}
	}
	
	public static void main(String[] args) {
		List<FontConstant> list = new ArrayList<FontConstant>();
		
		list.add(FontConstant.Bold);
		list.add(FontConstant.Italilc);
		list.add(FontConstant.Plain);
		
		
		/*
		 * copyOf() 
		 * 将list集合中的枚举类型，copy到EnumSet 集合当中
		 * 
		 * showEnumSet 打印
		 */
		showEnumSet(EnumSet.copyOf(list));
	}
}
