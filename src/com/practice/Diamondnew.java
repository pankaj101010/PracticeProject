package com.practice;

public class Diamondnew {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n - i; k++) {
				System.out.print(" ");
			}
			if (i == 0) {
				System.out.print("*");
			} else {
				System.out.print("*");
				for (int k = 0; k < 2 * i; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int k = 0; k < i + 2; k++) {
				System.out.print(" ");
			}
			if (i != n - 2) {
				System.out.print("*");
				for (int k = 0; k < 2 * (n - i) - 4; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			} else {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
