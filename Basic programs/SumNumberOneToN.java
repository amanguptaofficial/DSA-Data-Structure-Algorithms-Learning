package com.dsa.basicprograms;

//write a program to find one to N all sum numbers
public class SumNumberOneToN {

	static void printOddNumber(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		int number = 50;
		printOddNumber(number);
	}
}
//Time complexity:O(n),space complexity:O(1)
