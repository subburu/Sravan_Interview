package com.sachin;

import java.util.Arrays;

public class ReverseArray {
	
	
	/*
	 * Using swapping logic int x,y,temp; 
	 * temp=x;
	 *  x=y;
	 *  y=temp;
	 */
	
	
	public static void main (String args[])
	{
		
		int [] arr= {2,3,5,6,4,7};
		int k=arr.length-1;
		System.out.println(Arrays.toString(arr)+"Acutal array");
		for (int x=0;x<arr.length/2;x++)
		{
			
			int temp=arr[x]; 
			arr[x]=arr[k];    
			arr[k]=temp;     
			k--;
		
		}
		System.out.println(Arrays.toString(arr)+"Revese Array");
		
		
		
	}

}
