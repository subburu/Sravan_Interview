package com.sachin;

public class Leaders {
	/*
	 * Note: An element is leader if it is greater than 
	 * all the elements to its right side.
	 * 
	 */

	public static void main(String[] args) {
		
		int a[]= {10,9,14,23,15,0,9};
		int leader=0; int temp=0;
		for (int i=0;i<a.length;i++)
		{
			for (int j=i;j<a.length;j++)
			{
				if (a[i]<a[j])
				{
					break;
				}
				else
				{
					leader=a[i];
				}
			}
			System.out.println(" Leader is "+ leader);
		}
		
		
	}

}
