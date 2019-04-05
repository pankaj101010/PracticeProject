package com.practice;

import java.util.Scanner;

public class KajuKathli {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter odd numbers only");
         int n = scan.nextInt();
         while(true) {
        	 if (n%2==0) {
				System.err.println(" Only odd numbers allow");
				System.err.print("Enter odd number again: ");
				 n = scan.nextInt();
			}
        	 else {
        		 break;
        	 }
         }
         for (int line =1; line <=n; line++) {
			for (int space = line; space <=n/2+1; space++) {
				System.out.print(" ");
			}
				if (line<=n/2+1) {
					for (int k = 1; k<=line; k++) {			
						System.out.print("$ ");
				}
			}
				else {
					for (int space = 1; space <=line-n/2; space++) {
						System.out.print(" ");
					}
					for (int x =1; x <=n-line+1; x++) {
						System.out.print("$ ");
					}
					
				}
				
				
			System.out.println();
			
			
			
		}
	}

}
