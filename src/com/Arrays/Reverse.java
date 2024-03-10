package com.Arrays;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6,7,8,9,10};
		int  rev []=new int [a.length];
		
		System.out.println("orginal array" +Arrays.toString(a));
		
	for (int i=a.length-1,j=0;i>=0;i--,j++)
	
	{
	//	System.out.print(a [i ]+ " ");
	//	System.out.print(", ");
		rev [j]=a[i];
	}
	
	System.out.println("reverse array" +Arrays.toString(rev));
		
	
	}

		
}