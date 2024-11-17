package com.enums.example;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo2 {

	public static void main(String[] args) {

		/*
		 * noneOf()
		 * 定义当前集合只能放入FontConstant类型的枚举
		 */
		EnumSet<FontConstant> enumset = EnumSet.noneOf(FontConstant.class);
		  enumset.add(FontConstant.Plain);
	      enumset.add(FontConstant.Italilc);
	      
	      showEnumSet(enumset);
	}
	

	public static void showEnumSet(EnumSet<FontConstant> enumset) {
		for (Iterator<FontConstant> iter = enumset.iterator(); iter.hasNext();) {
			System.out.println(iter.next());
		}
	}
}
