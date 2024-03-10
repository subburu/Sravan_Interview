package com.sachin;

public class ForEachExample {

	public static void main(String args[]) {

		CharOccurrence("I love Tea testing", 'T');
		CharOccurrence("Sravan Kumar", 'k');

	}

	public static void CharOccurrence(String S, char val) {
		int count = 0;
		char arr[] = S.toCharArray();
		for (char ch : S.toCharArray()) {
			if (ch == 'i') {
				count++;
			}
		}

		System.out.println("Occurence of  " + val + " " + count);
	}
}
