package com.dsa.basicprograms;

//Write a program to check Given Number is ArmStrong number or not
public class FindArmstrongNumber {
	public static String checkArmStrongNumber(int number) {
		int originalnum = number;
		int num = number;
		int countDigit = 0;
		int calculateSum = 0;
		while (originalnum > 0) {
			int rem = originalnum % 10;
			countDigit++;
			originalnum = originalnum / 10;
		}
		while (num > 0) {
			int rem = num % 10;
			calculateSum = calculateSum + (int) Math.pow(rem, countDigit);
			num = num / 10;
		}
		if (calculateSum == number) {
			return "ArmStrong Number";
		}

		return "Not a ArmStrong Number";

	}

	public static void main(String[] args) {
		int number = 1634;
		String ans = checkArmStrongNumber(number);
		System.out.println(ans);

	}
}
//Time complexity O(log^2n),space complexity O(1);
