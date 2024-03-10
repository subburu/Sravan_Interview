package com.Arrays;


import java.util.Arrays;

public class CharacterOccurance {

	public static void main (String args[])
	{
		int arr[]= {2,4,4,5,3,2,2,4};
		boolean [] rem= new boolean[arr.length];
		Arrays.fill(rem, false);
		for (int i=0;i<arr.length;i++)
		{
	        if (!rem[i])
	     {
		int count=0;
		for (int j=0;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				rem[j]=true;
				count++;
			}
		}
		System.out.println(arr[i]+" "+count);
	}
		
		}
		
	}
}
