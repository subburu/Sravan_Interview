package com.Strings;


public class PalindromeString {
	public static void main(String[] args) {
		checkPalindromeString("Sravan");
		checkPalindromeString("Madam");
	}

	public static void checkPalindromeString(String str) {
		String rev = "";
		String orignialstr = str;
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (orignialstr.equalsIgnoreCase(rev)) {
			System.out.println(orignialstr + " " + " is a palindrome");
		} else {
			System.out.println(orignialstr + " " + " is not a palindrome");
		}
	}
}
