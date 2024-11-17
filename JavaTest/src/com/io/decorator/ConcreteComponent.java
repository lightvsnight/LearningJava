package com.io.decorator;

/**
 * 
 * @author L.hk
 * 描述：定义一个将要接收附加责任的类
 */
public class ConcreteComponent implements Component{

	@Override
	public void dosomething() {
		System.out.println("功能A");
	}

}
