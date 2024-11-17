package com.io.recursive;

/**
 * 
 * @author L.hk
 * 
 * 斐波那契数列
 *
 */
public class Fibonacci {

	// 使用递归计算斐波那契数列 
	public int compute(int n) {

		// 递归的出口
		if (1 == n || 2 == n) {
			return 1;
		} else {
//			System.out.println(compute(n - 1)+" : "+compute(n - 2));
//			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			return compute(n - 1) + compute(n - 2);
		}
	}
	
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		System.out.println(fib.compute(9));
	}
}
