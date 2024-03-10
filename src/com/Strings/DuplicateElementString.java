package com.Strings;


import java.util.HashSet;
import java.util.Set;

public class DuplicateElementString {

	public static void main (String args[])
	{
		
		duplicateUsingSet("SravanKumar");
	 duplicateUsingLoop("SravanKumar");
	   
	}
	
	public static void duplicateUsingSet(String str)
	{
		System.out.println("Using Hashset");
		    char[] arr=	str.toCharArray();
			
			Set<Character> duplicate= new HashSet<Character>();
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
	
	public static void duplicateUsingLoop(String str )
	{
		System.out.println("Using Loop");
		
		char [] arr=str.toCharArray();
		for (int i =0;i<arr.length;i++)
		{   
			int count=0;
			for (int j=i;j<arr.length;j++)
			{
				if (arr[i]==arr[j])
				{
					count++;
				}
				
			}
			if (count==2)
			{
				System.out.println("duplicate elements  "+arr[i]);
			}
			
		}
		
	}
}
