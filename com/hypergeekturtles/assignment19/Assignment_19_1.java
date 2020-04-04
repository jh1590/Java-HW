package com.hypergeekturtles.assignment19;

import java.util.*;

public class Assignment_19_1 {

	public static void main(String[] args) {

		int[] input1 = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97 };
		int input2 = 73;
		int answer = binarySearchInt(input1, input2);
		System.out.println("Found prime at index " + answer);

	}

	public static int binarySearchInt(int[] numbers, int targetValue) {

		int length = numbers.length;
		int max = length - 1;
		int min = 0;
		if (max < min) {
			return -1;
		} else {
			int guess = (max + min) / 2;
			if (numbers[guess] == targetValue) {
				return guess;
			} else if (targetValue > numbers[guess]) {
				ArrayList<Integer> Values = new ArrayList<Integer>();
				for (int i = guess + 1; i <= max; i++) {
					Values.add(numbers[i]);
				}

				int[] x = new int[Values.size()];
				for (int i = 0; i < x.length; i++) {
					x[i] = Values.get(i);
				}
				return guess + 1 + binarySearchInt(x, targetValue);
			} else {
				ArrayList<Integer> Values = new ArrayList<Integer>();
				for (int i = 0; i <= guess; i++) {
					Values.add(numbers[i]);
				}

				int[] x = new int[Values.size()];
				for (int i = 0; i < x.length; i++) {
					x[i] = Values.get(i);
				}
				return binarySearchInt(x, targetValue);
			}
		}
	}
}
