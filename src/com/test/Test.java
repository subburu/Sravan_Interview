package com.test;

import java.util.Arrays;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		
	
		int a [ ]= {9,10,8,7,6,4,3,2};
		
		for (int i=0;i<a.length;i++)
		{
			int temp;
			
			for (int j=0;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
	 
		System.out.println(Arrays.toString(a));
	}

}
