package com.java.test;

import java.util.Random;

/**
 * 
 * @author 生成随机数
 *
 */
public class RandomExample {

	public static void main(String[] args) {

		/*
		 * 随机生成一个介于1-20之间的数字
		 */
		Random random = new Random();
		int result = random.nextInt(20) + 1;
		System.out.println(result);

		/*
		 * 随机生成一个介于1-20之间的数字
		 */
		double result1 = Math.random();  //返回带正号的 double 值，该值大于等于 0.0 且小于 1.0
		result1 *= 20;     //*=  先乘以21，再赋值。
		int result2 = (int) result1;
		result2 += 1;
		System.out.println(result2);
	}

}
