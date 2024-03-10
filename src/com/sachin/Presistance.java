package com.sachin;
import java.util.Arrays;

public class Presistance {
	public static void main(String[] args) {
		String[] str = { "1", "3", "4" };
// str =new String temp[str.length];
		String[] temp = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			if (i == str.length - 1) {
				temp[0] = str[i];
			} else {
				temp[i + 1] = str[i];
			}
		}
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.asList(temp) + " test");
	}
}