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
				int[] x = new int[max - guess];
				for (int i = 0; i < x.length; i++) {
					x[i] = numbers[guess + 1 + i];
				}
				int answer = binarySearchInt(x, targetValue);
				if (answer == -1) {
					return -1;
				} else {
					return guess + 1 + answer;
				}
			} else if (targetValue < numbers[guess]) {

				int[] x = new int[guess - min];
				for (int i = 0; i < x.length; i++) {
					x[i] = numbers[i];
				}
				int answer2 = binarySearchInt(x, targetValue);
				if (answer2 == -1) {
					return -1;
				} else {
					return answer2;
				}
			} else {
				return -1;
			}
		}
	}
}
