package com.innerclass;

import java.util.Date;

public class AnonymousInnerClassTest {
	@SuppressWarnings("deprecation")
	public String get(Date date) {
		return date.toLocaleString();
	}

	public static void main(String[] args) {
		AnonymousInnerClassTest aic = new AnonymousInnerClassTest();
		
		
		String str = aic.get(new Date(){
			@Override
			public String toLocaleString(){
				return "hello world";
			}
		});
		System.out.println(str);
	}
}
