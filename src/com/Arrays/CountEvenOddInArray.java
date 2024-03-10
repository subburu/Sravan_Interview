package com.Arrays;

public class CountEvenOddInArray {
	
	public static void main (String args [])
	{
		int [] a = {5,7,2,4,9};
		int evencount=0,oddcount=0;
		for (int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			
		}
		System.out.println("Even number count is  "+ evencount);
		System.out.println("Odd number count is "+oddcount);
		System.out.println("Odd number count is "+( a.length-evencount)+" other way");
		
	}

}
