package com.strategy;

/**
 * »·¾³½ÇÉ«
 * @author L.hk
 *
 */
public class Environment {
	
	private Strategy strategy;
	
	public Environment(Strategy strategy){
		this.strategy = strategy;
	}

	public int calculate(int a, int b){
		return strategy.calculate(a,b);
	}
	
	public Strategy getStrategy() {
		return strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}
