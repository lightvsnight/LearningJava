package com.enums.example;

public class ColorTest {
	
	public static void main(String[] args) {
		
		Color myColor = Color.Red;
		System.out.println(myColor);
		
		System.out.println("----------------");
		for (Color c : Color.values()) {
            System.out.println(c);
         }
		
	}
}
