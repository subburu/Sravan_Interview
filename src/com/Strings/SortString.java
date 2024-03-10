package com.Strings;


public class SortString {

	public static void main(String args[]) {
		withoutSort("java");
	}

	public static void withoutSort(String s) {
		char[] a = s.toCharArray();
		char temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}
		System.out.println(new String(a));
	}
	
	
	public static void UsingSort(String s)
	{
		String sk ="corejava";
		
		
	}

}
