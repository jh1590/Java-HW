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
		if (length > 3) {
			char last = str.charAt(length - 1);
			String lastletter = String.valueOf(last);
			str = str.replace(last, lastletter.toUpperCase().charAt(0));
			char seclast = str.charAt(length - 2);
			String seclastletter = String.valueOf(seclast);
			str = str.replace(seclast, seclastletter.toUpperCase().charAt(0));
			char trilast = str.charAt(length - 3);
			String trilastletter = String.valueOf(trilast);
			str = str.replace(trilast, trilastletter.toUpperCase().charAt(0));
		}
		else {
			 str = str.toUpperCase();
		}
		return str;
	}
}