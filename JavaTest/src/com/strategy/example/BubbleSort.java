package com.strategy.example;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
	
	/**
	 * 一维数组排序--升序(Ascending)
	 * @param array
	 */
	public static void bubbleSort_asc(List<Person> list)
	{
		for(int i = 0; i<list.size()-1;i++)
		{
			for(int j = 0;j<list.size()-i-1;j++)
			{
				int p1Id = ((Person)list.get(j)).getId();
				int p2Id = ((Person)list.get(j+1)).getId();
				if( p1Id > p2Id ){
					Person o = list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1,o);
					
					/*int temp = array[j];
					array[j] = array[j+1];
					array[j+1]= temp;*/
				}
			}
		}
	}
	
	/**
	 * 一维数组排序--降序(Descending)
	 * @param array
	 */
	public static void bubbleSort_desc(List<Person> list)
	{
		for(int i = 0; i<list.size()-1;i++)
		{
			for(int j = 0;j<list.size()-i-1;j++)
			{
				int p1Id = ((Person)list.get(j)).getId();
				int p2Id = ((Person)list.get(j+1)).getId();
				if( p1Id < p2Id ){
					Person o = list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1,o);
					
					/*int temp = array[j];
					array[j] = array[j+1];
					array[j+1]= temp;*/
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Person p1 = new Person(8,"xiaoli",20);
		Person p2 = new Person(3,"xiaowang",19);
		Person p3 = new Person(6,"xiaozhang",23);
		Person p4 = new Person(5,"xiaohuang",25);

		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		BubbleSort.bubbleSort_asc(list);
	}
}
