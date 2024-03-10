package com.sachin;

import java.util.Arrays;

public class SortAnArray {
	
	/* 
    	Using swapping technique 
	 * temp =x;
	 *  x=y; 
	 *  y=temp
	 */
	public static void main (String args [])
	{
		int [] arr = {20,10,30,50,40};
		System.out.println(Arrays.toString(arr)+" Given Array");
	    int temp=0;
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				if (arr[j]>arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
				}
			}
			
		}
		
		System.out.println(Arrays.toString(arr)+" Expected Array");
		
	

}

}