package com.basics;

public class FibonnicSeries {
	
	// fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
	//The first two numbers of fibonacci series are 0 and 1.

	public static void main(String[] args) {
		int count=10;
		int n1=0,n2 =1,n3;
		
		System.out.print(n1+ " "+n2+" ");
		
		for (int i=2;i<count;i++)
		{
			n3 =n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		
			

};

}