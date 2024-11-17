package com.strategy.example;

import java.util.List;

/**
 * »·¾³½ÇÉ«
 * @author L.hk
 *
 */
public class House {
	
	private Strategy strategy;
	
	public House(Strategy strategy){
		this.strategy = strategy;
	}
	
	public List<Person> sortAsc(List<Person> list){
		return strategy.sortAsc(list);
	}
	
	public List<Person> sortDesc(List<Person> list){
		return strategy.sortDesc(list);
	}
	
	public Strategy getStrategy() {
		return strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
}
