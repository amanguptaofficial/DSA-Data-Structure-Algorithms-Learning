package com.dsa.patterns;

public class Pattern9 {
	public static void main(String[] args) {
		char ch = 65;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
