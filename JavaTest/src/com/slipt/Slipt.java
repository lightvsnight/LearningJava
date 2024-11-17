package com.slipt;

public class Slipt {
	
	public static void main(String[] args) {
		
		String fileUrl = "http://192.168.1.249/cd.ppt"; 
		String[] str =  fileUrl.split("/");
        for(String s : str){
        	System.out.println(s);
        }
        System.out.println("--------------------");
        System.out.println(str[str.length-1]);
	}
}
