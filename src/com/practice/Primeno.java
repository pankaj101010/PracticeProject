package com.practice;

public class Primeno {

	public static void main(String[] args) {
		for(int i=2;i<=10;i++){
			for(int j=2;j<=i;j++){
				if(j==i)
				{
				System.out.print(i+" ");	
				}
				if(i%j==0){
					break;
				}
			}
		}

	}

}
