package com.exception.example;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		int d = 0;
		
		
		int c = a*b;
		
		try{
			 d = a/b; //throws java.lang.ArithmeticException: / by zero	
		}
		catch(ArithmeticException e){
			
			// e 之所以能够输出，是因为 d的对象 赋给 e
			e.printStackTrace();
		}finally{//无论 发生异常，还是没有 发生异常 finally永远
			System.out.println("welcome");
		}
		
		
		System.out.println(c);
		System.out.println(d);
	}
}
