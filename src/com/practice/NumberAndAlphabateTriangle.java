package com.practice;

public class NumberAndAlphabateTriangle {
       
	public static void main(String[] args) {
		int x=1;
	     char y='a';
	       int z=1;
        for (int i = 4; i>=1; i--) {
			for (int j = 0; j <=i-2; j++) {
				System.out.print(" ");
			}
			if (x%2==0) {
				for (int j = 1; j <=x; j++) {
					System.out.print(y+" ");
					y++;
				}
			}else {
			 for (int j = 1; j <=x; j++) {
				System.out.print(z+" ");
				z++;
			}
			}
			System.out.println();
			x++;
		}

	}

}
