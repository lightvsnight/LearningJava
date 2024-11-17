package com.strategy;

/**
 * 具体策略类--加法策略
 * @author L.hk
 *
 */
public class AddStrategy implements Strategy{

	@Override
	public int calculate(int a, int b) {
		return (a+b);
	}

}
