package com.dsa.basicprograms;

// Write a program to print multiplication  Table
public class MultificationTable {
	static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
		}
	}

	public static void main(String[] args) {
		int number = 16;
		printTable(number);
	}
}
//Time complexity:O(1),space complexity:O(1)
