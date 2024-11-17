package com.io.decorator;

/**
 * 
 * @author L.hk
 * 描述：具体装饰角色 (Concrete Decorator):负责给构建对象“贴上”附加的责任。
 *
 */
public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Component component) {
		super(component);
	}

	public void dosomething() {
		super.dosomething();
		this.doAnytherThing();
	}

	private void doAnytherThing() {
		System.out.println("功能C");
	}
}
