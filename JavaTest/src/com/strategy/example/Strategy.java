package com.strategy.example;

import java.util.List;

/**
 * 策略模式：针对人的id，name，age
 * @author L.hk
 *
 */

public interface Strategy {
	
	/*
	 * 正序策略
	 */
	public List<Person> sortAsc(List<Person> list);
	
	/*
	 * 倒序策略
	 */
	public List<Person> sortDesc(List<Person> list);

}
