package com.Strings;


public class DuplicateElementInString {

	public static void main(String args[]) {
		String s = "SubburuSravanKumar";
		duplicateelement(s);

	}

	public static void duplicateelement(String s) {

	char [] a = s.toCharArray();
	
		for (int i = 0; i <= a.length-1; i++) {
			int count =0;
			for (int j =i; j < a.length-1; j++) {
				if (a[i] == a[j]) {
				
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(a[i] + " is a duplicate element");
			}
		}

	}

}
