package com.io.decorator;

/**
 * 
 * @author L.hk
 * 描述：装饰角色(Decorator)：持有一个构件(Component) 对象的引用，
 *     并定义一个与
 *
 */

public class Decorator implements Component {

	private Component component;
	
	public Decorator (Component component){
		this.component = component;
	}
	
	@Override
	public void dosomething() {
         component.dosomething();
	}

}
