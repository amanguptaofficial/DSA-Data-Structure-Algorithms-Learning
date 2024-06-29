package com.dsa.patterns;

public class Pattern7 {
	public static void main(String[] args) {
		for (char ch = 'A'; ch <= 'D'; ch++) {
			for (char c = 'A'; c <= 'D'; c++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
