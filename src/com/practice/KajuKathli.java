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
         for (int j =1; j <=n; j++) {
			for (int i = j; i <=n/2+1; i++) {
				System.out.print(" ");
			}
				if (j<=n/2+1) {
					for (int k = 1; k<=j; k++) {
						
						System.out.print("$ ");
				}
			}
				else {
					for (int k = 1; k <=j-n/2; k++) {
						System.out.print(" ");
					}
					for (int x =1; x <=n-j+1; x++) {
						System.out.print("$ ");
					}
					
				}
				
				
			System.out.println();
			
			
			
		}
	}

}
