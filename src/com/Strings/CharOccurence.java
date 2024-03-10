package com.Strings;


import java.util.HashMap;
import java.util.Map;

public class CharOccurence {
	
	public static void main (String args [])
	{
		
		String str="Sravan";
		str.toLowerCase();
		String str1 =str.replaceAll("\\s", "");

		   char[] a=   str1.toCharArray();
		   
		   Map<Character,Integer> map= new HashMap();
		   
		   for (int i=0;i<a.length;i++)
		   {
			   if (!map.containsKey(a[i]))
			   {
				   map.put(a[i], 1);
			   }
			   else 
			   {
				   int value=map.get(a[i]);
				   map.put(a[i],value+1 );
			   }
		   }
		   System.out.println(map);
		   
		
	}
	

}
