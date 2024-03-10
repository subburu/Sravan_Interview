package com.Strings;

import java.util.Arrays;

public class Anagarm {

	
	
	public static void main (String args[])	

	{
		String s1 ="Rat";
		String s2 = "cat";
		
		char a1 [] =s1.toCharArray();
		char a2 []= s2.toCharArray();
		
		if (s1.length()!=s2.length())
		{
			System.out.println(s1+" "+s2+" are not agagarms");
			
		}
		else 
		{
			Arrays.sort(a1);
			Arrays.sort(a2);
			if (Arrays.equals(a1, a2))
			{
				System.out.print(s1+" "+s2+ " are anagarams");
			}
			else 
			{
				System.out.print(s1+" "+s2+ " are not anagarams");
			}
		}
	}
	

	}
