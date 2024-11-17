package com.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class Randoms {
	//总次数
	private int totalCount;
	//总金额
	private BigDecimal totalPrice;
	//每次金额上限
	private BigDecimal maxPrice;
	//每次金额下限
	private BigDecimal minPrice; 
	

	public static void main(String[] args) {
		Random random = new Random();
		DecimalFormat df = new DecimalFormat("######0.00"); 
		NumberFormat ddf1=NumberFormat.getNumberInstance() ;
		ddf1.setMaximumFractionDigits(2); 
		for(int i = 0; i < 10; i++){
			/**
			 * the range 0.0d (inclusive) to 1.0d (exclusive), 
			 */
			double number = Double.valueOf(df.format(random.nextDouble()))+1;
			System.out.println(	Arith.round(number,2));
		}
	}
	
	/**
	 * 分配金额
	 * @param totalCount
	 * @param totalPrice
	 * @param maxPrice
	 * @param minPrice
	 */
	public static void distribution(int totalCount, String totalPrice, String maxPrice ,String minPrice){
		//循环次数,生成多少个红包
		for(int i = 1; i < totalCount; i++){
			
			//Arith.round(number,2);
		}
	}
	
	/**
	 * 
	 * @param accumulatePrice 累计金额
	 * @param totalPrice 总金额
	 * @return
	 */
	public static boolean isGreaterThanTotalPrice(double accumulatePrice, double totalPrice){
		//累计金额
		double number1 = Double.valueOf(accumulatePrice);
		//总金额
		double number2 = Double.valueOf(totalPrice);
		//相减
		double number = Arith.sub(number2,number1);
		if(number >= 0){
			return true;
		}
		return false;
	}
}