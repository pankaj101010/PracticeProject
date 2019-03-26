package com.practice;

public class SeperateToken {
  public static String findString(String value) {
	  String[] split = value.split("(?=[A-Z])");
	  return  String.join(" ", split).toLowerCase();
	  //return split;
  }
	public static void main(String[] args) {
		String str = "HiPankajMySurnameIsDevgade";
		//findString(str);
		System.out.println(findString(str));
		
		
	}

}
