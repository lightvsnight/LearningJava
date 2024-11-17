package com.strategy;

/**
 * 具体策略类--乘法策略
 * @author L.hk
 *
 */
public class MultiplyStrategy implements Strategy{

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return (a*b);
	}

}
