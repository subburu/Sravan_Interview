package com.sachin;

import java.util.Arrays;

public class ReverseEveryThreeNum {

	public static void main(String[] args) {
		
		int [] input = {2,4,5,6,7,5,10,30,20};
		
		
		System.out.println(Arrays.toString(input)+"Given array");
		for (int i=0;i<input.length;i=i+3)
		{
			int k=i+3;
			/*
			 * if (k>input.length) break;
			 */
			
			
			for (int j=i;j<=k;j++)
			{
				int temp=input[j];
				input[j]=input[k-1];
				input[k-1]=temp;
				k--;
			
			}
			}
			
			

		
		System.out.println(Arrays.toString(input)+"Expected array");

			
			
		}
		

	
}
