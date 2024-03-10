package com.Strings;


public class ReverseString {

	public static void main(String args[]) {
		String s = " Sravan Kumar subburu";
		UsingCharArray(s);
		charAt(s);
		StringBuilder(s);

	}

	public static void UsingCharArray(String s)

	{
		String rev = "";
		char[] a = s.toCharArray();
		for (int i = a.length - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println(rev);
	}

	public static void charAt(String s)

	{
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
	
	public static void StringBuilder(String s)
	{
		StringBuilder sb =new StringBuilder (s);
		System.out.println(sb.reverse());
		StringBuffer sb1=new StringBuffer(s);
		System.out.println(sb1.reverse());
	}

}
