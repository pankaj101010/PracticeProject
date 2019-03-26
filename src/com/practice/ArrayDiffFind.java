package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDiffFind {
	public static int[] findingdiff(int[] a) {
		int[] finres = new int[a.length];
		for (int i = 0; i < finres.length; i++) {
			finres[i] = a[i];
		}
		
		ArrayList<Integer> src1 =  new ArrayList<Integer>();
		ArrayList<Integer> src =  new ArrayList<Integer>();
		int temp =0;
		for (int i = 0; i < a.length; i++) {
			        temp   = a[i];        
			        src.add(temp%10);
			        int middle =temp/10;
			        src.add(middle/10);
			        src.add(middle%10);
			      int max = Collections.max(src);
			      int min = Collections.min(src);
			     int diff = max -min; 
			     finres[diff]=temp;
			      //src1.add(diff, temp);
			      src.clear();
		}
		
		
		
		return finres ;
	}

	public static void main(String[] args) {
		int [] a= {153,123,7,85,67};
		         //4    2  0  3  1
    for (int i : findingdiff(a)) {
		System.out.print(i);
	} 
	}

}
