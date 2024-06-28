package com.dsa.basicprograms;

// Write a Program to print all prime number between 1 to N
public class PrintAllPrimeNumbers {

	static void printPrime(int n) {

		for (int i = 2; i <= n; i++) {
			boolean ans = checkPrime(i);
			if (ans)
				System.out.print(i + " ");
		}

	}

	static boolean checkPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}

			
		}
		if (count == 2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int n = 10;
		printPrime(n);

	}
}
//Time complexity :O(n^2), space complexity:O(1)
