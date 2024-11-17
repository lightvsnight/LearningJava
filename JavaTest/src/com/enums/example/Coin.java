package com.enums.example;

public enum Coin {
	
	one,two,three,penny("hello"),nikel("world"),dime("welcome"),quarter("hello world");

	
	private String value;
	
    Coin(){
		
	}
	
	Coin(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
	public void setValue(String value){
		this.value = value;
	}
	
	public static void main(String[] args) {
		Coin coin = Coin.quarter;
		System.out.println(coin.getValue());
	}
}
