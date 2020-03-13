package com.hypergeekturtles.assignment15;

import java.util.*;

public class Assignment_15_1_ArrayFront9 {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 9, 3, 4 };
		boolean answer1 = arrayFront9(array1);
		System.out.println(answer1);
		int[] array2 = { 1, 2, 3, 4, 9 };
		boolean answer2 = arrayFront9(array2);
		System.out.println(answer2);
		int[] array3 = { 1, 2, 3 };
		boolean answer3 = arrayFront9(array3);
		System.out.println(answer3);
	}

	public static boolean arrayFront9(int[] nums) {

		int length = nums.length;
		boolean is9 = false;

		for (int i = 0; i < length; i++) {
			if (nums[i] == 9) {
				if (i < 4) {
					is9 = true;
					break;
				} else {
					break;
				}
			}
		}
		return is9;
	}
}