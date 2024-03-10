package com.basics;

public class SmallestAndLargestNum {
	
	public static void main (String args [])
	{
		int a [] = {10,30,40,50,100,-90,0,90};
		int max =a[0];
		int min =a[0];
		 for (int i=1;i<=a.length-1;i++)
		 {
			 if (a[i]>max)
			 {
				 max=a[i];
				 
			 }
		 }
		
		System.out.println("Largest number is "+ max);
		
		for (int i=1;i<a.length-1;i++)
		{
			if (a[i]<min)
			{
				min=a[i];
			}
		}
	System.out.println("smallest number is "+min);
	
}
	
}
