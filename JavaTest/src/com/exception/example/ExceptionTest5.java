package com.exception.example;

public class ExceptionTest5 {
	
	
	public void method() {

		try{
			System.out.println("进去的try块");
			return;
		}catch(Exception e){
			System.out.println("异常发生了...");
		}finally{
			System.out.println("进入到 finally块...");
		}
	}
	
	public static void main(String[] args) {
		ExceptionTest5 test = new ExceptionTest5();
		test.method();
	}
}
 