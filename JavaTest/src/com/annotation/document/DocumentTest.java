package com.annotation.document;


public class DocumentTest {
	
	@DocumentedAnnotation(hello="welcome")
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}
	
	
	public static void main(String[] args) {
		DocumentTest dt = new DocumentTest();
		dt.method();
	}
}
