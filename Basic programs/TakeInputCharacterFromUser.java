package com.dsa.basicprograms;
//Write a program to take the input character from the user...

import java.util.Scanner;

public class TakeInputCharacterFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the Character Value");
		char input = sc.next().charAt(0);
		System.out.println("Your Input is: " + input);
	}
	// we have a Scanner Class for taking input from the user and Scanner class have
	// a some method
// next(),nextInt(), nextLong(),nextDouble
// we know that we can find the character by using charAt() it take the index of the character
//and return the character.
}
