package com.Strings;


public class PrintSpecialCharacters {

	public static void main(String[] args) {
		
		 String inputString = "He said, 'The mailman loves you.' I heard it with my own ears.";
	        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
	        int count=0;
	        for (int i=0; i < inputString.length(); i++)
	        {
	        	
	            char ch = inputString.charAt(i);
	            if(specialCharactersString.contains(Character.toString(ch))) {
	                System.out.print(ch+ " ");
	            //	System.out.println(inputString+ " contains special character");
	                count++;
	            }    
	            
	        }
       
	          System.out.println("Total number of punctutions"+count++);  

		
		
	}
}
		

	


