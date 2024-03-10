package com.Strings;


public class RemoveSpaces {
	
	
	public static void main (String args[])
	{
		
		String str =" ja va s ta r s ";
		String trimmedstr =str.trim(); // first and last spaces will be removed
		str.replaceAll(str, trimmedstr);
		String str1 =str.replaceAll("\\s", "");
		System.out.println(str1);
		
		
	}

}
