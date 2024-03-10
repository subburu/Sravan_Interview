package com.Strings;


public class RemoveSpecialCharacters {

	
	public static void main (String args[])
	{
		
		String str ="&*%Java*&%;";
		// Approach -01 
		String plaintext= str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plaintext);
		
		
	}
	
}
