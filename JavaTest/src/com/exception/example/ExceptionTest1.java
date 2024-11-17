package com.exception.example;

public class ExceptionTest1 {

	public void method() throws Exception {
		System.out.println("hello world");
		throw new Exception();
	}
	
	public static void main(String[] args) {
		ExceptionTest1 exception  = new ExceptionTest1();
		try {
			exception.method();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("aaa");
		}
	}
}
