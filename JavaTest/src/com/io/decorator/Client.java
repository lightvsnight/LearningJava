package com.io.decorator;

/**
 * 
 * @author L.hk 测试装饰者模式
 *
 */
public class Client {

	public static void main(String[] args) {

		/*// 节点流
		Component component = new ConcreteComponent();

		// 过滤流
		Component component2 = new ConcreteDecorator1(component);
		// 过滤流
		Component component3 = new ConcreteDecorator2(component);

		component.dosomething();
		System.out.println("------------------------------------------");
		
		component2.dosomething();
		System.out.println("------------------------------------------");

		component3.dosomething();
		System.out.println("------------------------------------------");*/

		Component component3 = new ConcreteDecorator1(new ConcreteDecorator2(
				new ConcreteComponent()));
		component3.dosomething();
		System.out.println("------------------------");
		// 这就是装饰模式 原理
		Component component4 = new ConcreteDecorator2(new ConcreteDecorator1(
				new ConcreteComponent()));
		component4.dosomething();
       
		
	}

}
