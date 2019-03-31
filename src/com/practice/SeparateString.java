package com.practice;

import java.util.regex.Pattern;

public class SeparateString {

	public static String findString(String value) {
		
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String temp = "";
		for (int i = 0; i < value.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (value.charAt(i) == s.charAt(j)) {
					temp += "  ";
					break;
				}
			}
			temp += Character.toString(value.charAt(i));
		}

		return temp.trim().toLowerCase();
	}

	public static void main(String[] args) {
		String str = "HiPankajMySurnameIsDevgade";
		//System.out.println(findString(str));
		str=str.replaceAll("([A-Z])"," $1");
		System.out.println(str.trim().toLowerCase());
	}

}
