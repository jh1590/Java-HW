package com.hypergeekturtles.assignment17;

import java.util.*;

public class Assignment_17 {

	public static void main(String[] args) {

		String str1 = "A";
		String str2 = "3B";
		String str3 = "3A5E";
		int answer1 = HexToDecimal(str1);
		int answer2 = HexToDecimal(str2);
		int answer3 = HexToDecimal(str3);
		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);	
	}
	
	public static int HexToDecimal(String binary) {
		HashMap<String, String> values = new HashMap<String, String>();
		values.put("F", "15");
		values.put("E", "14");
		values.put("D", "13");
		values.put("C", "12");
		values.put("B", "11");
		values.put("A", "10");
		values.put("9", "9");
		values.put("8", "8");
		values.put("7", "7");
		values.put("6", "6");
		values.put("5", "5");
		values.put("4", "4");
		values.put("3", "3");
		values.put("2", "2");
		values.put("1", "1");
		int length = binary.length();
		int sum = 0;
		for (int i = 0; i < length; i++) {
			String location = String.valueOf(binary.charAt(length - 1 - i));
			int value = Integer.valueOf(values.get(location));
			sum = sum + value * (exponent(i, 16));
		}
		return sum;
	}
	
	public static int exponent(int power, int base) {

		int z = 1;
		for (int x = 0; x < power; x++) {
			z = z * base;
		}
		return z;
	}
}