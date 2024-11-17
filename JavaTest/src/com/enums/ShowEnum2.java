package com.enums;

import com.enums.example.OpConstant;

public class ShowEnum2 {

	public static void main(String[] args) {
		
		for(OpConstant o : OpConstant.values()){
			System.out.printf("%d, %s, %n",o.ordinal(),o);
		}
		
	}

}
