package com.basics;

public class ReverseInteger {
	
	public static void main (String args[])
	{
	    
		int num=12981;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num %10;  //n 12345%10 =5
			num=num/10; // 12345/10 = 12345
		}
		System.out.println(rev);
		
	}

}
