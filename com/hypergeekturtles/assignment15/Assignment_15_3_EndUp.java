package com.hypergeekturtles.assignment15;

import java.util.*;

public class Assignment_15_3_EndUp {

	public static void main(String[] args) {

		String str1 = "Hello";
		String answer1 = endUp(str1);
		System.out.println(answer1);
		String str2 = "hi there";
		String answer2 = endUp(str2);
		System.out.println(answer2);
		String str3 = "hi";
		String answer3 = endUp(str3);
		System.out.println(answer3);
	}

	public static String endUp(String str) {
		
		int length = str.length();
		String answer = "";
		if (length > 3) {
			String firstletters = str.substring(0, length - 3);
			String lastletters = str.substring(length - 3, length);
			answer = firstletters + lastletters.toUpperCase();
		}
		else {
			answer = str.toUpperCase();
		}
		return answer;
	}
}