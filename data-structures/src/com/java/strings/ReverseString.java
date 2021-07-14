package com.java.strings;

public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
	}

	private static String reverseString(String str) {
		
		StringBuilder reversedString = new StringBuilder();
		for(int i = str.length()-1; i >= 0;  i--) {
			reversedString = reversedString.append(str.charAt(i));
		}
		return reversedString.toString();
	}
}
