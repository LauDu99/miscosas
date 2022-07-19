package com.laura.java.re;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFileFolder {

	public static void main(String[] args) {
		File directory = new File("C://Users//106721781//Desktop//demo");
		String[] fileNames = directory.list();
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]+[.]txt");
		
		int count=0;
		
		for(String fileName : fileNames) {
			Matcher matcher = pattern.matcher(fileName);
			if(matcher.matches()) {
				count++;
				System.out.println(fileName);
			}
		}
		System.out.println("The count is: "+count);
	}

}
