package com.Arrays;

public class DuplicateElementUsingForLoop {

	public static void main (String args[])
	{
		int a[]= {2,3,4,4,4,2,2,1,3,5,6,7};
		duplicate(a);
		
	}
	
	public static void duplicate(int a[])
	{
		
		int count=0;
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=i;j<=a.length-1;j++)
			{
				if (a[i]==a[j])
				{
			count++;
				}
			}
			if (count==2)
			{
				System.out.println(a[i]+"duplicates");
			}
		}

	}
	
}
