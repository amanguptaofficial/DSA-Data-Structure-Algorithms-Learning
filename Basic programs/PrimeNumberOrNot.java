package com.dsa.basicprograms;

// Write a program to check the number is prime or not 
public class PrimeNumberOrNot {

	static String checkPrimeNumber(int n) {
		int count = 0;
		if (n < 2) {
			return "-1";
		}
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return "Prime Number";
		}
		return "Not a Prime Number";
	}

	public static void main(String[] args) {
		int number = -5;
		String isPrime = checkPrimeNumber(number);
		System.out.println(isPrime);

	}
}
// Time Complexity: O(n), space Complexity: O(1)
