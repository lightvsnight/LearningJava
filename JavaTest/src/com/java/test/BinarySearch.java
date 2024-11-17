package com.java.test;


/**
 * 
 * @author L.hk
 * 二分查找   待查找数组元素一定必须是经过排序好的数组
 */
public class BinarySearch 
{
    
	/**
	 * 二分查找：查询当前数组中某一个数的下标
	 * @param array
	 * @param value
	 * @return
	 */
	public static int binarySearch(int[] array, int value)
	{
		int low = 0;
		int higt = array.length - 1;
		int middle ;
		
		while(low <= higt)
		{
			middle = (low+higt)/2;

			for(int i = 0; i < array.length; i++)
			{
				System.out.print("["+i+"]:");
				System.out.print(array[i]);
				if(middle==i)
				 System.out.print("#");
				
				System.out.print(" ");
			}
			System.out.println();
			
			if(array[middle]==value)
			{
				return middle;
			}
			if(value < array[middle])
			{
				higt = middle - 1;
			}
			if(value > array[middle])
			{
				low = middle + 1;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args){
		int[] array = new int[]{17,9,12,7,15,8,6,4,5,3,1,2,10,13,14,19,3};
		BubbleSortTest.bubbleSort_asc(array);//进行冒泡排序
		for(int k = 0; k<array.length; k++){
			System.out.print(array[k]+" ");
		}
		System.out.println();
		int middle = BinarySearch.binarySearch(array, 4);
		
		System.out.println("数组下标:"+middle+";值:"+array[middle]);
	}
	
}
