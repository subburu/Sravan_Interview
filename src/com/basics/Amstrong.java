package com.basics;

public class Amstrong {
	
	/*
	 * 153 
	 * 1*1*1 =1 
	 * 5*5*5 =125;
	 * 3*3*3 =27
	 * 1+125+27 =153
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		Amstrongnum(153);
		Amstrongnum(121);
		Amstrongnum(1);
		Amstrongnum(0);
	}
	
	public static void Amstrongnum(int num)
	{
		int cube=0;
		int rem;
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			cube=cube+(rem*rem*rem);
		}
		
		if (temp==cube)
		{
			System.out.println(temp +"  number is Amstrong");
		}
		else
		{
			System.out.println(temp+ " is not a Amstrong");
		}
		
	}
	
}
