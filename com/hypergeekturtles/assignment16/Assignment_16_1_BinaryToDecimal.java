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
		int counter = 0;
		for (int i = 0; i < length; i++) {
			int value = Character.getNumericValue(binary.charAt(length - i - 1));
			if (value == 1) {
				int z = 2;
				for (int x = 0; x < i; x++) {
					z = z * 2;
				}

				counter = counter + z / 2;
			}
		}
		return String.valueOf(counter);
	}
}