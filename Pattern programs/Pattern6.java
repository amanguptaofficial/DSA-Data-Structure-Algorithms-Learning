package com.dsa.patterns;

public class Pattern6 {

	public static void main(String[] args) {
		int count = 1;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(count++);
			}
			System.out.println();
		}
	}
}
