package com.exception.example;

public class ExceptionTest2 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		String 	str = null;
		try {
			System.out.println(str.length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("hello");
	}
}
