package com.for_each;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ForTest {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// 旧式 for循环
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("-------------");

		// 新式for循环
		for (int element : arr) {
			System.out.print(element + " ");
		}

		System.out.println();
		String[] str = { "hello", "world", "welcome" };
		for (String s : str) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("----------关于二维数组遍历------------");
		// 关于二维数组遍历
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int[] row : arr2) {
			for (int element : row) {
				System.out.print(element + " ");
			}
		}
		System.out.println();
		System.out.println("----------三维数组遍历-----------");
		// 关于三维数组遍历
		int[][][] arr3 = { { { 1, 2, 3 } }, { { 4, 5, 6 } }, { { 7, 8, 9 } } };
		for (int[][] rows : arr3) {
			for (int[] row : rows) {
				for (int element : row) {
					System.out.print(element + " ");
				}
			}
		}

		System.out.println();
		System.out.println("-------------------");
		// 遍历集合
		Collection<String> col = new ArrayList<String>();
		col.add("one");
		col.add("two");
		col.add("three");

		for (String s : col) {
			System.out.print(s + " ");
		}

		System.out.println();
		System.out.println("=========================================");

		// 循环遍历的三种方法
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");

		// 方法一
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "");
		}
		
		System.out.println();
		
		// 方法二 迭代
		for (Iterator<String> iter = list.iterator(); iter.hasNext();) {
			System.out.print(iter.next() + "");
		}
		
		System.out.println();
		
		for(String s : list){
			System.out.print(s+" ");
		}
	}
}