package com.practice;

public class PrimeUsingWhile {

	public static void main(String[] args) {
		int n = 2;
		while (n <=50) {
			int m=2;
			while ( m <=n) {				
				if (n==m) {
					System.out.print(n+ " ");
				}
				if (n%m == 0) {
					break;
				}
				m++;
			}
			n++;
		}

	}

}
