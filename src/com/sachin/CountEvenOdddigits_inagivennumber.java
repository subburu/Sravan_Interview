package com.sachin;

public class CountEvenOdddigits_inagivennumber {
	public static void main(String[] args) {
		oddeven(8881);
		oddeven(1118);
	}

	public static void oddeven(int num) {
		int counteven = 0;
		int countodd = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem / 2 == 0) {
				counteven++;
			} else {
				countodd++;
			}
			num = num / 10;
		}
	}
}