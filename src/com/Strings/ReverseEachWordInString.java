package com.Strings;


public class ReverseEachWordInString {
	
	
	public static void main (String args [])
	{


		String input ="java code";
		System.out.println("Original string "+input);
      // expected output = avaj edoc		
		String revword= "";
		String output="";
		
		String words []=input.split(input);
		
		for (String word :words)
		{
		for (int i=word.length()-1;i>=0;i--)
		{
			revword=revword+word.charAt(i);
			
		}
		}
		
		output=output+revword+" ";

		System.out.println("reverse string "+output);

	}

}
