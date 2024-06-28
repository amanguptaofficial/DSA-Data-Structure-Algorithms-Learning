package com.dsa.basicprograms;

// Write a program to reverse a Number(123-321);
public class ReverseNumber {
	static int reverse(int n) {
		int reverseNum = 0;
		while (n > 0) {
			int rem = n % 10;
			reverseNum = reverseNum * 10 + rem;
			n = n / 10;
		}
		return reverseNum;
	}

	public static void main(String[] args) {
		int number = 123567;
		int ans = reverse(number);
		System.out.println("reverse Number is: " + ans);
	}
}
//Time complexity O(d) and space complexity: O(1)
