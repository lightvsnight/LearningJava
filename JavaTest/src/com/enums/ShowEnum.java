package com.enums;

import com.enums.example.*;

public class ShowEnum {
	
	public static void main(String[] args){
		
		/*
		 * 比较OpConstant枚举所定义的成员，谁在前，谁在后
		 */
		enumCompareTo(OpConstant.valueOf(args[0]));
	}
	
	public static void enumCompareTo(OpConstant constant){
		 System.out.println(constant);
		 
		 for(OpConstant c : constant.values()){
			 System.out.println(constant.compareTo(c));
		 }
	}
}
