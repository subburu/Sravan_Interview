package com.basics;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 20;
		
	//	System.out.println("5 is prime number" + checkPrime(5));
		checkPrime(21);
		//getPrimeNumbers();
	}

	public static boolean checkPrime(int num) {
		boolean status=true;
		if (num <= 1) {
			return status =false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return status= false;
			}
		}
		
		
	
			System.out.println(num +" is a prime number");
			return status;
		
	}

	public static void getPrimeNumbers() {
		for (int i = 2; i <= 20; i++) {
			if (checkPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}