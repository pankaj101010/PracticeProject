package com.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReading {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\PANKAJ\\Desktop\\java program.txt");
      BufferedReader bf = new  BufferedReader(fr); 
      String st; 
      while ((st = bf.readLine()) != null) 
        System.out.println(st);
   
      String s = "123";
      int i = Integer.parseInt(s);
      System.out.println(i);
      String k ="pankaj";
             k="suraj";  
      System.out.println(k);
	}

}
