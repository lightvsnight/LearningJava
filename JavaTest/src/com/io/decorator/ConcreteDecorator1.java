package com.io.decorator;

public class ConcreteDecorator1 extends Decorator{

	public ConcreteDecorator1(Component component) {
		super(component);
	}
	
    @Override
	public void dosomething(){
		super.dosomething();
		this.doAnotherThing();
	}

	private void doAnotherThing(){
		System.out.println("¹¦ÄÜB");
	}

}
