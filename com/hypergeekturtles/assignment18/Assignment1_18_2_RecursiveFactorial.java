package com.hypergeekturtles.assignment18;

public class Assignment1_18_2_RecursiveFactorial {
	public static void main(String[] args) {
		int n = 7;
		int answer = factorial(n);
		System.out.println(answer);
	}

	public static int factorial(int value) {

		if (value > 0) {
			return value * factorial(value - 1);
		} else {
			return 1;
		}
	}
}
