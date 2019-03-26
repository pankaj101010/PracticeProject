package com.practice;

public class Diamond {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i < n; i++) {
			for (int k = 1; k < n - i; k++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int m = 1; m <= i; m++) {
				System.out.print("  ");
			}
			if (i == 0) {
			} else {
				System.out.print("*");

			}

			System.out.println();
		}

		int k = 4;
		for (int i = 1; i < k; i++) {
			for (int j = 0; j <= i - 1; j++) {
				// if(j==1) {System.out.print("T");}
				System.out.print(" ");
			}
			System.out.print("*");
			if (i == 2) {
				for (int m = 3; m >= i; m--) {
					System.out.print(" ");
				}
			} else {
				for (int m = 5; m > i; m--) {
					System.out.print(" ");
				}
			}
			if (i == 3) {
			} else {
				System.out.println("*");
			}
		}
	}

}
