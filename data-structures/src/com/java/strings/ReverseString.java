package com.java.strings;

public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println(reverseStringUsingCharArray("hello"));
	}
	
	//using StringBuilder
	private static String reverseString(String str) {
		
		StringBuilder reversedString = new StringBuilder();
		for(int i = str.length()-1; i >= 0;  i--) {
			reversedString = reversedString.append(str.charAt(i));
		}
		return reversedString.toString();
	}
	
	//using char array
	private static String reverseStringUsingCharArray(String str) {
		
		char[] charArray = str.toCharArray();
		
		for(int i = 0 ,j = charArray.length-1; i<j; i++, j--) {
			char temp = charArray[i];   
			charArray[i] = charArray[j];
			charArray[j] = temp;
		}
		return String.valueOf(charArray);
	}
}
