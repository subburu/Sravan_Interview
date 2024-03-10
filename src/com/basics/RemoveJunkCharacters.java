package com.basics;

public class RemoveJunkCharacters {
	
	/*
	 * We have to use Regular Expression [^a-zA-Z0-9] 
	 * ^ this is called not
	 * Using replaceAll method
	 */
	
	public static void main (String args[])
	{
		String str="ABCDEFG$%^&#12345";
		 String s=str.replaceAll("[^a-zA-Z0-9]","");
		 System.out.println(s);
		
	    
	}

}
