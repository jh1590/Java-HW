package com.hypergeekturtles.assignment14;

import java.util.*;

public class Assignment_14_2 {

	public static void main(String[] args) {

		int[] array1 = {1,2,3};
		int[] answer1 = reverse3(array1);
		System.out.println("[" + answer1[0] + "," + answer1[1] + "," + answer1[2] + "]");
		int[] array2 = {5,11,9};
		int[] answer2 = reverse3(array2);
		System.out.println("[" + answer2[0] + "," + answer2[1] + "," + answer2[2] + "]");
		int[] array3 = {7,0,0};
		int[] answer3 = reverse3(array3);
		System.out.println("[" + answer3[0] + "," + answer3[1] + "," + answer3[2] + "]");
	}

	public static int[] reverse3(int[] nums) {

		int length = nums.length;
		int x = nums [length - 1];
		nums[length - 1] = nums[0];
		nums[0] = x;
		return nums;
	}
}