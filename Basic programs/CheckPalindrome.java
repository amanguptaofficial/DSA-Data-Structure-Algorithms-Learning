package com.dsa.basicprograms;

// Write a Java Program to check number is palindrome or not;
public class CheckPalindrome {
	static String checkPalindrome(int number) {
		int n = number;
		int reverseNum = 0;
		while (n > 0) {
			int rem = n % 10;
			reverseNum = reverseNum * 10 + rem;
			n = n / 10;
		}
		if (reverseNum == number) {
			return "Palindrome Number";
		}
		return "Not a Plaindrome Number";
	}

	public static void main(String[] args) {
		int number = 1224;
		String ans = checkPalindrome(number);
		System.out.println(ans);
	}
}
