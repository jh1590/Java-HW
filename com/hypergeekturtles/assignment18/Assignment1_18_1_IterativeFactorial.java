package com.hypergeekturtles.assignment18;

public class Assignment1_18_1_IterativeFactorial {

	public static void main(String[] args) {
		int n = 7;
		int answer = factorial(n);
		System.out.println(answer);
	}

	public static int factorial(int value) {
		int product = 1;
		for (int i = 1; i <= value; i++) {
			product = product * i;
		}
		return product;
	}
}
