package com.Arrays;

public class GreatestAndSmallest {
	
	public static void main(String[] args) {
		int array []= {50,30,40,20,60,100,10,101,11};
		maxNumber(array);
		}
		
	public static void maxNumber(int a[])
		{
		int max=a[0];int min =a[0];
		for (int i=1;i<a.length;i++)
		{
		if(a[i]>max)
		{
		max=a[i]; 
		}
		else 
		{
			min=a[i];
		}
		}
		System.out.println(max +" maximum value ");
		System.out.println(min +" minimum value ");
		System.out.println(max-min+" is the difference");
		
		
		}
	
	
}
	
	


