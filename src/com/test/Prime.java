package com.test;

public class Prime {

	public static void main(String[] args) {
		//int a [] = {2,3,4,5,6,7,8,9,10,17,20};
		int number=50;
	//	int num =17;
		
		 for (int j =2 ;j<=number;j++) {
		
		int count=0;
		for (int i=2;i<=number;i++)
		{
			
			if (j%i==0)
			{
				count++;
				if(count==2) {
					System.out.println(j + " its not a prime number");
					break;
				}
			}
			
		}
		 
		if(count==1) {
			System.out.println(j +" its a prime number");
		}
		 }
	}

}
