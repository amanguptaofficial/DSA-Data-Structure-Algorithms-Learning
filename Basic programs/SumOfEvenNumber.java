package com.dsa.basicprograms;

//write a program to find the sum to even number 1 to N
public class SumOfEvenNumber {

	static int sumOfEvenNumber(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int number = 5;
		int ans = sumOfEvenNumber(number);
		System.out.println("sum of the  Even number is: " + ans);
	}
}
//time complexity:O(n), space complexity O(1)
