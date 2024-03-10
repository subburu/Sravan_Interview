package com.test;

import java.util.Arrays;

public class MoveZeroandOnes {
	
	public static void main (String args[])
	{
		int arr[]= {1,0,2,0,3,0,0};
		System.out.println(Arrays.toString(arr)+" Actual Input");

		int temp=0;
		
		for (int i=0,j=0;i<arr.length;i++)

		{
			
			
				if (arr[j]==0)
				{
				
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					j++;
					
				}
			
		}
		System.out.println(Arrays.toString(arr)+" Expected Input");

		
		
		
	}

}
