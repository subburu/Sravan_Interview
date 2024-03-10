package com.basics;

public class StringManiupulation {
	/* String Manipulation Interview Questions
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
  public static void main (String args [])
  {
	  String str ="Subburu Sravan Kumar S";
	  String str1 ="Subburu Sravan Kumar s";
	  System.out.println(str.length());
	  str.charAt(5);
	  System.out.println( str.charAt(5));
	  str.indexOf("S");
	  System.out.println(str.indexOf("S")); // firstoccurence
	  str.indexOf("S", 5);
	  System.out.println("first occurence" + str.indexOf("S", 5));
	  System.out.println( "second "+str.indexOf("S",   str.indexOf("S")+1)); //second occurence
	  System.out.println("third"+ str.indexOf("S",   str.indexOf("S")+1));
	  System.out.println("third"+ str.indexOf("S",   str.indexOf("S")+1));
	  System.out.println(str.indexOf("Kumar")+" kumar");	  
	  // String Comparion 
	  System.out.println(str.equals(str1));
	  System.out.println(str.equalsIgnoreCase(str1));
	  //substring 
	  str.substring(0, 8);
	  System.out.println( str.substring(0, 7));
	  // trim 
	  String str2 =" Hello World ";
	  str2.trim(); //before space and after space will be removed ,between space will remain same
	  String date="01-01-2023";
	  System.out.println(date.replace("-", "/"));
	  
	  String test="Hello world test";
	 String a []= test.split(" ");
	  for (int i=0;i<a.length;i++)
	  {
		  System.out.println(a[i]);
	  }
	  
	  StringBuffer sb=new StringBuffer();
	  
	  String s2="Rahul";
	  System.out.println(s2.concat(test));
	  
	  String x="Hello";
	  String y= "world";
	  int a1=200;
	  int b=300;
	  System.out.println(x+y);
	  System.out.println(a1+b);
	  System.out.println(x+y+a1+b);// output helloworld200+300
	  System.out.println(x+y+(a1+b));
	  
	  
	  
	  
	  
  }
	

}
