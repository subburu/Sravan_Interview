package com.sachin;

public class SwapTwoNumbers {
	/**
	 * Swapping of two numbers
	 *
	 */
	public static void main(String[] args) {

		SwapTwoNumbers.swapNumbers(10, 20);

		SwapTwoNumbers.temp(40, 50);
	}

	public static void swapNumbers(int x, int y) {

		System.out.println("Before swapping x value=" + x + " y value = " + y + "");

		x = x + y;

		y = x - y; // second variable should be used first

		x = x - y;

		System.out.println("After swapping x value=" + x + " y value = " + y + "");
	}

	public static void temp(int x, int y) {

		System.out.println("Before swapping x value=" + x + " y value = " + y + "");

		int temp = 0;

		temp = x;

		x = y;

		y = temp;

		System.out.println("After swapping x value=" + x + " y value = " + y + "");
	}
}