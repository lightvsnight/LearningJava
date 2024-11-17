package com.test;

enum Aa{

	a(1);

	private int value;

	public int value() {
		return this.value;
	}
	
	private Aa(Integer value) {
		this.value = value;
	}
}

public class TestEquals {

	public static void main(String[] args) {
          if(!Integer.valueOf(Aa.a.value()).equals(new Integer(1))){
        	  System.out.println(Integer.valueOf(Aa.a.value()).equals(new Integer(1)));
          }else{
        	  System.out.println(!Integer.valueOf(Aa.a.value()).equals(new Integer(1)));
          }
	}

}
