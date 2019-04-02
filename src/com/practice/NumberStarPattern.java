package com.practice;

public class NumberStarPattern {
	    static int x = 1;
	    static int y =1;
	public static void main(String[] args) {
		for (int i = 4; i>=1; i--) {
			for (int j = 0; j <=i-2; j++) {
				 System.out.print(" ");
			}
			for (int j =1; j <=x; j++) {
				
				System.out.print(y+" ");
				y++;	
			}
			System.out.println();
			x++;
		}

	}

}
