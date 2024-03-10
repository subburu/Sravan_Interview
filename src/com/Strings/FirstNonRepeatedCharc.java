package com.Strings;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharc {
	
	public static void main (String args [])
	{
		String input ="AABBCFDECDE";
		nonrepated(input);
		nonrepeatUsingMap(input);
		
	}

	
	public static void nonrepated(String input)
	{
		
		char [] a = input.toCharArray();
			
		for (int i=0;i<a.length;i++)
		{
			int count =0;
			for (int j=0;j<a.length;j++)
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
		 
		public static void nonrepeatUsingMap(String input)
		{
			
			Map<Character,Integer> map=new HashMap();
			for (int i=0;i<input.length();i++)
			{
				char ch=input.charAt(i);
				if(map.containsKey(input.charAt(i)))
				{ 			
					map.put(ch, map.get(ch)+1);
		
				}
				else 
				{
					map.put(ch, 1);
				}
			}
		 System.out.println(map);			
			
		
		for (Entry<Character,Integer> entryset: map.entrySet())
		{
			if (entryset.getValue()==1)
			{
				System.out.println(entryset.getKey());
			}
		}
		
		}
	
	
}
