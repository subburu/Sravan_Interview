package com.sachin;

import java.util.Arrays;

public class MoveAllZeros {

	public static void main(String[] args) {

		int [] arr= {0,0,1,0,3,0,5,0,6};
	//	int [] arr = {0,1,0,1,1,0,1,1,0,0,1};
		System.out.println(Arrays.toString(arr)+" Given Input");
		 int temp=0;
		 for (int i=0;i<arr.length;i++)
		 {
			for (int j=0;j<arr.length;j++)
			{
				if (arr[j]==0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			 
		 }
		
		 System.out.println(Arrays.toString(arr)+" expected output");
		
		
	}

}
