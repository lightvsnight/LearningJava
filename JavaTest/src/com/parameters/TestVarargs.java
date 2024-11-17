package com.parameters;

public class TestVarargs {

	public static int sum(int... nums) {
		int sum = 0;
		for (int num : nums) {

			sum += num;
		}

		return sum;
	}

	public static void main(String[] args) {
		int result = sum(1, 2);
		
		System.out.println(result);

		result = sum(1, 2, 3, 4);
		
		System.out.println(result);
	}
}
