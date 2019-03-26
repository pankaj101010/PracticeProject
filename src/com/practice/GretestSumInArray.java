package com.practice;

import java.util.ArrayList;

public class GretestSumInArray {

	public static void main(String[] args) {
		int[] a= {9,1,5,3,2,5,10};
        int sum = 10;
        int count = 0;
        int countn = 0;
        int temp=0;
        int ct =0;
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <a.length; i++) {
			B.add(new ArrayList<Integer>());
		}
		int i = 0;
        for (; i < a.length;) {
        	
       		temp += a[i];
        	    count++;
        	    countn++;
        	    i++;
        	   if (temp==sum) {
				for (int j =count-2 ; j <i; j++) {
					B.get(ct).add(a[j-1]);
				}
				ct++;
				temp=0;
				count =0;
			}
			}
        	   
		
	}

}
