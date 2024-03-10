package com.basics;

public class PalindromeNumber {

	//151 454 34543 161 78987
	
	public static void main(String[] args) {
		
		int num=129;
		int temp=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;  //n 12345%10 =5
			num=num/10; // 12345/10 = 12345
		}
		if (rev==temp)
		{
			System.out.println(rev +" given number is palindrome");
		}
		else
		{
			System.out.println(rev+" given num is not a palindrome");
		}
		
		
	}
	
}
