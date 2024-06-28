package com.dsa.basicprograms;

//Write a program to count the Digits of Given Numbers
public class CountDigitOfGivenNumber {

	static int countDigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	public static void main(String[] args) {
		int number = 5000;
		int digits = countDigit(number);
		System.out.println("Your Given Number Contains: " + digits + " digits");

	}
}
//Time complexity: O(log n) space complexity: O(1)
