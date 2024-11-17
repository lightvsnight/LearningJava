package com.java.test;

/**
 * 
 * @author L.hk
 * 冒泡排序  @L.hk
 */

public class BubbleSortTest 
{
	/**
	 * 一维数组排序--升序(Ascending)
	 * @param array
	 */
	public static void bubbleSort_asc(int[] array)
	{
		for(int i = 0; i<array.length-1;i++)
		{
			for(int j = 0;j<array.length-i-1;j++)
			{
				if(array[j]>array[j+1])//判断当前下标所指向的值 与当前下标+1所指向的值进行大小判断
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1]= temp;	
				}
				
				System.out.println("i:"+i +"   j:"+j);
				System.out.println("array[j]"+array[j]+"  array[j+1]"+array[j+1]);
				for(int k = 0; k<array.length; k++){
					System.out.print(array[k]+" ");
				}
				System.out.println("");
			}
		}
	}
	
	
	/**
	 * 一维数组排序--降序(Descending)
	 * @param array
	 */
	public static void bubbleSort_desc(int[] array)
	{
		//array[]={4,1,3,9,6,8,2};
		for(int i = 0; i<array.length-1;i++)
		{
			for(int j = 0;j<array.length-i-1;j++)
			{
				//第一次  array[0] ; array[0+1]
				if(array[j]<array[j+1])//判断当前下标所指向的值 与当前下标+1所指向的值进行大小判断
				{
					
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1]= temp;	
					
					
					System.out.println("i:"+i +"   j:"+j);
					System.out.println("array[j]"+array[j]+"  array[j+1]"+array[j+1]);
					for(int k = 0; k<array.length; k++){
						System.out.print(array[k]+" ");
					}
				}
			}
		}
	}
	
	
    public static void main(String[] args)
    {
    	int[] a = new int[]{10,7,4,1,3,9,6,8,2,5,0};
    	BubbleSortTest.bubbleSort_asc(a);
    	
    	for(int k = 0; k<a.length; k++){
			System.out.print(a[k]+" ");
		}
    }
}
