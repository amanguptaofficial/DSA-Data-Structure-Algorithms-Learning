package com.dsa.basicprograms;

// Write a program to check input year is leap year or not
public class LeapYearOrNot {

	static String checkLeapYear(int year) {
		if (year % 4 == 0) {
			return "This is Leap Year";
		}
		return "Not a Leap Year";
	}

	public static void main(String[] args) {
		int year = 2020;
		String ans = checkLeapYear(year);
		System.out.println(ans);

	}
}
//Time complexity:O(1), space complexity:O(1)
