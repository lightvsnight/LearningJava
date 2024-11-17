package com.strategy;


/**
 * 具体策略类--减法策略
 * @author L.hk
 *
 */
public class SubtractStrategy implements Strategy {

	@Override
	public int calculate(int a, int b) {
		return ( a - b );
	}

}
