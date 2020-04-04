package com.hypergeekturtles.assignment19;

import java.util.*;

public class Asignment_19_2 {

	public static void main(String[] args) {

		String[] dictionary = { "apple", "banana", "carrot", "dragonfruit", "eggplant", "lemon", "watermelon" };
		String input2_1 = "apple";
		int answer1 = binarySearchString(dictionary, input2_1);
		System.out.println("Found String at index " + answer1);
		String input2_2 = "lemon";
		int answer2 = binarySearchString(dictionary, input2_2);
		System.out.println("Found String at index " + answer2);
		String input2_3 = "kiwi";
		int answer3 = binarySearchString(dictionary, input2_3);
		System.out.println("Found String at index " + answer3);

	}

	public static int binarySearchString(String[] dictionary, String word) {

		int length = dictionary.length;
		int max = length - 1;
		int min = 0;

		if (max < min) {
			return -1;
		} else {
			int guess = (max + min) / 2;
			if (dictionary[guess].equals(word)) {
				return guess;
			} else if ((dictionary[guess].compareTo(word)) < 0) {
				ArrayList<String> Values = new ArrayList<String>();
				for (int i = guess + 1; i <= max; i++) {
					Values.add(dictionary[i]);
				}

				String[] x = new String[Values.size()];
				for (int i = 0; i < x.length; i++) {
					x[i] = Values.get(i);
				}
				int answer = binarySearchString(x, word);
				if (answer == -1) {
					return -1;
				} else {
					return guess + 1 + answer;
				}
			} else if ((dictionary[guess].compareTo(word)) > 0) {
				ArrayList<String> Values = new ArrayList<String>();
				for (int i = 0; i < guess; i++) {
					Values.add(dictionary[i]);
				}

				String[] x = new String[Values.size()];
				for (int i = 0; i < x.length; i++) {
					x[i] = Values.get(i);
				}
				return binarySearchString(x, word);
			} else {
				return -1;
			}
		}
	}
}
