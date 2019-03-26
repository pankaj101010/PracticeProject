package com.practice;

import java.util.Arrays;

public class ArrayMinEle {

	public static void main(String[] args) {
		int[] arr = {7,4,0,6,1,9,3,2};
		int min=0;
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					min = arr[j];
				}
				for (int j2 = 0; j2 < arr.length; j2++) {
					   if (min>arr[j2]) {
						 min = arr[j2];
					}
				}
			}
		}
		//Arrays.sort(arr);		
		System.out.println(min);
		
	}

}
