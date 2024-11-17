package com.annotation.retention;

@MyAnnotation(hello = "beijing", world = "shanghai")
public class MyTest {

	@MyAnnotation(hello = "tianjin", world = "shangdi")
	@Deprecated
	@SuppressWarnings("unchecked")
	private void output() {
		// TODO Auto-generated method stub
		System.out.println("output something");
	}

	public static void main(String[] args) {
		System.out.println("");
	}
}
