package com.hypergeekturtles.assignment15;

import java.util.*;

public class Assignment_15_2_StringBits {

	public static void main(String[] args) {

		String str1 = "Hello";
		String answer1 = stringBits(str1);
		System.out.println(answer1);
		String str2 = "Hi";
		String answer2 = stringBits(str2);
		System.out.println(answer2);
		String str3 = "Heeololeo";
		String answer3 = stringBits(str3);
		System.out.println(answer3);
	}

	public static String stringBits(String str) {
		
		int length = str.length();
		String ans = "";
		
		for (int i = 0; i < length; i++) {
			if (i % 2 == 0) {
				char answer = str.charAt(i);
				ans = ans + answer;
			}
		}
		return ans;
	}
}