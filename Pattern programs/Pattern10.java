package com.dsa.patterns;

public class Pattern10 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = i; j <= i + 3; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
