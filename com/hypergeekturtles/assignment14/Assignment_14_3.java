package com.hypergeekturtles.assignment14;

import java.util.*;

public class Assignment_14_3 {

	public static void main(String[] args) {

		int[] array1 = { 1, 1, 2, 3, 1 };
		boolean answer1 = array123(array1);
		System.out.println(answer1);
		int[] array2 = { 1, 1, 2, 4, 1 };
		boolean answer2 = array123(array2);
		System.out.println(answer2);
		int[] array3 = { 1, 1, 2, 1, 2, 3 };
		boolean answer3 = array123(array3);
		System.out.println(answer3);
	}

	public static boolean array123(int[] nums) {

		int length = nums.length;
		boolean is123 = false;

		for (int i = 0; i < length - 2; i++) {
			if (nums[i] == 1) {
				if (nums[i + 1] == 2) {
					if (nums[i + 2] == 3) {
						is123 = true;
						break;
					}
				}
			}
		}
		return is123;
	}
}