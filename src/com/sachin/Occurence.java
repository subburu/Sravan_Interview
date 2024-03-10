package com.sachin;

import java.util.Arrays;

public class Occurence {

	
	public static void main (String args[])
	{
		int [] arr = {2,3,4,5,6,6,7,7,6,2,10,2,7,7};
		boolean [] bl=new boolean [arr.length];
		Arrays.fill(bl, false);
		
		for (int i=0;i<arr.length;i++)
		{
			if(!bl[i])
			{
			int count=0;
			for (int j=0;j<arr.length;j++)
			{
				if (arr[i]==arr[j])
				{
					count++;
					bl[j]=true;
				}
			}
			
			System.out.println("count of occurence "+ arr[i]  +"  is  :"+count);
		}
	
		
		
		}
	}
}
