package com.dsa.basicprograms;
//Write a program to find the Character is vowel or not

public class CheckCharacterIsVowelOrNot {
	static String isVowelOrConsonent(char character) {

		if ((character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U')
				|| (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')) {
			return "Given character is vowel";
		}
		return "Given character is consonant";
	}

	public static void main(String[] args) {
		char character = 'e';
		String ans = isVowelOrConsonent(character);
		System.out.println(ans);
	}
}
//Time Complexity: O(1), and space complexity:O(1)
