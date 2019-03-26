package com.practice;
import java.util.Scanner;
public class FindPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to prime or not: ");
		int value = scan.nextInt();
		if(value ==2 || value==1|| value%2!=0) {
			System.out.print("number is prime number.");
		}
		else {
			System.out.print("not a prime number");
		}
	}
}
