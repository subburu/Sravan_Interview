package com.test;

public class primenumbersinArray {

	public static void main(String[] args) {
	
		int a [] = {2,3,4,5,6,7,8,9,10,1};
		
		for (int i =0;i<a.length-1;i++)
		{
			int count =0;
			for (int j=2;j<=a[i];j++)
			
			if (a[i]%a[j]==0)
			{
				count++;
			}
		
			if (count==1)
			{
				System.out.println(a[i]+ " is a prime numer");
				
			}
			else
			{
				System.out.println(a[i]+ " is not a prime number");
			}
		}
		
		

	}

}
