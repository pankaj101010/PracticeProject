package com.practice;
import java.util.Scanner;
public class ArmStrongno {
/*
 * 2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97
 */
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 while(scan.hasNext()) { 
		int num = scan.nextInt();
			if(num%2!=0 || num==2) {
				System.out.println(num+" a prime number");
			} else { System.out.println("not  prime number");}
	 }
		
	}

}

