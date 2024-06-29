package com.dsa.patterns;

public class Pattern8 {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			int c = 65;
			for (int j = 1; j <= 4; j++) {
				System.out.print((char) c++);
			}
			System.out.println();
		}
	}
}
