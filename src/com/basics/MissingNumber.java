package com.basics;

public class MissingNumber {

	/*
	 * 1+2+4+5 =12 1+2+3+4+5 =15 15-12=3 is missing number
	 */

	public static void main(String args[]) {
		int a[] = { 1, 2, 3,4, 5,7 };
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

		for (int j = 1; j <= 7; j++) {
			sum1 = sum1 + j;

		}
		System.out.println(sum1);

		System.out.println("Missing number is " + (sum1 - sum));
	}
}
