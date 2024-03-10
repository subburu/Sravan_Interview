package com.Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementHashSet {

	public static void main (String args[])
	
	{
		
	//	System.out.println("**** +Brute force +*****");
		int arr [] = {0,2,3,4,2,3,4,5,4,4,2,5,2,1};
		
		Set<Integer> duplicate= new HashSet<Integer>();
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==arr[j])
				{
					duplicate.add(arr[i]);
				}
				
			}
		}
		System.out.println(duplicate+" duplicate elements");
		
	}
	
}
