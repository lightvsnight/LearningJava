package com.io.recursive;


/**
 * 
 * @author L.hk
 * µİ¹éËã·¨
 */
public class RecursiveTest {
	
	public int compute(int number) {
		int result = 1 ;
		for(int i = number; i>0 ;i--){
			result *= i; //result = result * i;
		}
		return result;
	}
	
	/*
	 * µİ¹é·½Ê½¼ÆËã½×³Ë
	 * n! = n*(n-1)*(n-2)...* 2 * 1 
	 * 
	 * n! = n*(n-1)!
	 * 
	 * f(x) = n*f(x-1);
	 * 
	 * (n-1)! = (n-1)*(n-2)!
	 */
	public int compute2(int number){
		if(1 == number){  //µİ¹é³ö¿Ú
			return number;
		}
		else{
		   return number * compute2(number-1);
		}
	}

	public static void main(String[] args) {
		RecursiveTest test = new RecursiveTest();
		 int a = test.compute(5);
		 
		 System.out.println(a);
		 
		 System.out.println(test.compute2(5));
	}
}
