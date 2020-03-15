package com.hypergeekturtles.assignment16;

import java.util.*;

public class Assignment_16_1_BinaryToDecimal {

	public static void main(String[] args) {

		String str1 = "111";
		String answer1 = binaryToDecimal(str1);
		System.out.println(answer1);
		String str2 = "1010";
		String answer2 = binaryToDecimal(str2);
		System.out.println(answer2);
		String str3 = "100001";
		String answer3 = binaryToDecimal(str3);
		System.out.println(answer3);
	}

	public static String binaryToDecimal(String binary) {

		int length = binary.length();
		int sum = 0;
		int base2 = 2;
		
		for (int i = 0; i < length; i++) {
			int value = Character.getNumericValue(binary.charAt(length - i - 1));
			if (value == 1) {
				int answer = exponent(i, base2);
				sum = sum + answer;
			}
		}
		return String.valueOf(sum);
	}
	
	public static int exponent(int power, int base) {
		
		int z = 1;
		for (int x = 0; x < power; x++) {
			z = z * base;
		}
		return z;
	}
	
}