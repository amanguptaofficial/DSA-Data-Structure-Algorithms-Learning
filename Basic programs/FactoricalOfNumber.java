package com.dsa.basicprograms;

// write a program to find the factorial of the Number
public class FactoricalOfNumber {

	static int factorial(int n) {
		int fac = 1;
		for (int i = n; i > 1; i--) {
			fac = fac * i;
		}
		return fac;
	}

	public static void main(String[] args) {
		int number = 10;
		int ans = factorial(number);
		System.out.println("Factorail is: " + ans);
	}

}
//Time complexity:O(n), space complexity: O(1)
