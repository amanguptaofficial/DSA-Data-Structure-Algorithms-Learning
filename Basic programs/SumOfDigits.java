package com.dsa.basicprograms;

// Write a java Program to find the sum of the digits 123==>6
public class SumOfDigits {

	static int sumOfDigits(int number) {
		int sum = 0;
		while (number > 0) {
			int rem = number % 10;
			sum = sum + rem;
			number = number / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int number = 45612;
		int ans = sumOfDigits(number);
		System.out.println("Sum of you number digits are:" + ans);
	}
}
