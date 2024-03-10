package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {

		String a[] = { "sravan", "testing", "automation", "test" };
		
		int b[] = { 2, 3, 4, 5, 6, 7, 8 };
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<String> l = new ArrayList<String>(Arrays.asList(a));
		
		System.out.println(l);
		l.add("sravan kumar");
		System.out.println(l);
		for (int i = 0; i < b.length; i++) {
			list2.add(b[i]);
		}
		System.out.println(list2);
	}
}
