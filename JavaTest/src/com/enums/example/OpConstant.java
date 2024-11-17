package com.enums.example;

public enum OpConstant {
	
	TURN_LEFT("turn_left"),
	
    TURN_RIGHT("turn_right"), 
    
    SHOOT("shoot");
	
    private String value;
    
    public String value(){
    	return value;
    }
    
    OpConstant(String value){
    	this.value = value;
    }
}
