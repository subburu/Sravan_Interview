package com.test;

import java.util.Arrays;

public class Practise {

	public static void main(String[] args) {
		
	//	int arr[]= {1,0,2,0,3,0,0,2,0,1};
		int arr [] = {1,2,3,4,5};
		int rev[] =new int [arr.length];
		
		System.out.println(Arrays.toString(arr)+" Actual value");
		
		
	
			for (int j=arr.length-1,i=0;j>=0;j--,i++)
			{
				rev[i]=arr[j];
			}
		
			System.out.println(Arrays.toString(rev)+" rev value");
		
	}
	 }
	 
	


