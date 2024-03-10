package com.Arrays;

public class UniqueNumber {
	
	public static void main (String args[]) 

	{
		int arr[]= {5,9,5,4,9,6,4,5,20,30,4,4,4,20,7};
		
		for (int i=0;i<arr.length;i++)
				
		{
			int count=0;
			for (int j=0;j<arr.length;j++)
			{	
				if (arr[i]==arr[j])
				{
					count++;
				}	
			}
			if (count==1)
			{
				System.out.println(arr[i]+" "+"Unique Number");
				
			}
			
		}
	}
}
