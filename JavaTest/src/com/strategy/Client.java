package com.strategy;

/**
 * 客户端调用--策略
 * @author L.hk
 *
 */
public class Client {
    
	public static void main(String[] args) {
		
		/*
		 * 策略模式：已知现有策略 加，减，乘，除 四种策略
		 * 应用场景：当前环境不明确具体那种策略会被客户端用到
		 * 
		 */
		
		//AddStrategy addStrategy = new AddStrategy();
		Strategy strategy = new AddStrategy();
		Environment environment = new Environment(strategy);  //装载加法策略
		System.out.println(environment.calculate(2,3));
		
		//SubtractStrategy subtractStrategy = new SubtractStrategy();
		strategy = new SubtractStrategy();
		environment.setStrategy(strategy);  //装载减法策略
		System.out.println(environment.calculate(2,3));
		
		//MultiplyStrategy multiplyStrategy = new MultiplyStrategy();
		strategy = new MultiplyStrategy();
		environment.setStrategy(strategy);  //装载乘法策略
		System.out.println(environment.calculate(2,3));
		
		//DivideStrategy divideStrategy = new DivideStrategy();
		strategy = new DivideStrategy();
		environment.setStrategy(strategy);  //装载除法策略
		System.out.println(environment.calculate(2,3));
	}
}
