package com.sachin;

public class CountNumbers_InaGivenDigit {
	public static void main(String[] args) {
		countnumbersindigit(123456);
		countnumbersindigit(123);
		countnumbersindigit(1);
	}

	public static void countnumbersindigit(int num) {
		int count = 0;

		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count + " number of digits in a given number ");
	}
}
