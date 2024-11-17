package com.enums.example;

import java.util.EnumSet;
import java.util.Iterator;

enum FontConstant {
	Plain, Bold, Italilc, Hello
}

public class EnumSetDemo {

	public static void showEnumSet(EnumSet<FontConstant> enumset) {
		for (Iterator<FontConstant> iter = enumset.iterator(); iter.hasNext();) {
			System.out.println(iter.next());
		}
	}

	public static void main(String[] args) {
		EnumSet<FontConstant> enumset = EnumSet.of(FontConstant.Plain,
				FontConstant.Bold);

		showEnumSet(enumset);//打印出当前枚举集合中的成员
		
		System.out.println("========================");
		
		// 打印： 当前enumSet中的成员外的，其他枚举成员。
		showEnumSet(EnumSet.complementOf(enumset));
	}
}
