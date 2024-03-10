package com.Strings;


public class UniqueCharacter {
	
	public static void main (String args [])
	{
	  
		String input ="SravanKumarSubburu";
	char [] a = input.toCharArray();
		
	for (int i=0;i<a.length;i++)
	{
		int count =0;
		for (int j=i;j<a.length;j++)
		{
			if (a[i]==a[j])
			{
				count++;
			}
		
		}
		if (count==1)
		{
			System.out.println(a[i]+" is a non repeated");
			break;
		
			
		}
		
	}
	
	
	}
	
   }
	
	