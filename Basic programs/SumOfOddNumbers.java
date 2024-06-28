package com.dsa.basicprograms;

//Write a program to find the sum of the odd number
public class SumOfOddNumbers {

	static int sumOfOddNumber(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
   public static void main(String[] args) {
		int number = 5;
		int ans = sumOfOddNumber(number);
		System.out.println("Sum of Odd Number is: " + ans);
	}

}
//Time complexity: O(n), space Complexity:O(1)
