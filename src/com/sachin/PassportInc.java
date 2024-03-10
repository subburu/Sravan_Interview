package com.sachin;

public class PassportInc {
	
	public static void main (String args[])
	{
		/*
		 * checkNum(25); checkNum(9);
		 */
		checkNum(9);
	}

	
	public static void checkNum(int num)
	{
		
		if (num %3==0)
		{
			System.out.println("Blizz");
		}
		else if (num%5==0)
		{
			System.out.println("Bizz");
		}
		
		else if (num%5==0 && num %3==0)
		{
			System.out.println("Bizz and Blizz");
		}
		else
		{
			System.out.println("Not Bizz and Blizz");
			
		}
	}
}
