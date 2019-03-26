package com.practice;

public class Arrayupdation {
	public static int[] fix(int[] a) {
		int j =4;
		for( int i=0;i<a.length;i++) {
			if(i%2==0) {
				a[i]=j;
				j++;
				}else
				{
					a[i]=7;
							};
		}
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3,4, 5,6,4 };
		int[] b = fix(a);
		System.out.println(a[0] + a[1] + a[2]);
		System.out.println(b[0] + b[1] + b[2]);

	}

}
