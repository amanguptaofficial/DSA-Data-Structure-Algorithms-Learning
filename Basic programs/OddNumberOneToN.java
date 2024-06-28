package com.dsa.basicprograms;

//Write  a program to find Odd Number 1 to N

public class OddNumberOneToN {

	static void findOddNumber(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		int number = 100;
		findOddNumber(number);
	}
}

/**
 * Time Complexity:O(n) Space Complexity: O(1)
 */
