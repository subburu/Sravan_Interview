package com.basics;

public class SwapTwoNumbers {

	public static void main (String args [])
	{
		int a =30,b=50;
		
		  a =a+b; 
		  b=a-b;
		  a=a-b; 
		  System.out.println("a is "+a+ " b is"+b);
		 
		  usingVaribale();
	}
	
	public static void usingVaribale()
	{
		int a =30,b=50;
		System.out.println("Using third variable");
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a is "+a+  " b is"+b);
	}
}
