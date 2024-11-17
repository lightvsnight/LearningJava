package com.generics;

/**
 * ·ºÐÍ¼¯ºÏ
 * 
 * @author L.hk
 *
 * @param <T>
 */
public class SimpleCollection<T> {
	T[] objArr;

	int index = 0;

	@SuppressWarnings("unchecked")
	public SimpleCollection() {
		objArr = (T[]) new Object[10];
	}
	
	@SuppressWarnings("unchecked")
	public SimpleCollection(int capacity){
		objArr = (T[]) new Object[capacity];
	}
	
	public void add(T t){
		objArr[index++] = t ;
	}

	public int getLength(){
		return this.index;
	}
	
	public T get(int i){
		return objArr[i];
	}
	
	public static void main(String[] args) {
		SimpleCollection<Integer> sc = new SimpleCollection<Integer>();
		
		for(int i = 0; i < 10; i++){
			sc.add(i);
		}
		
		for(int i = 0; i < 10; i++){
			Integer in = sc.get(i);
			System.out.print(in+" ");
		}
	}
}
