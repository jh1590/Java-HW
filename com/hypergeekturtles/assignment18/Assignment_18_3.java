package com.hypergeekturtles.assignment18;

public class Assignment_18_3 {
	public static void main(String[] args) {
		System.out.println(f(3) + ", " + f(4) + ", " + f(5));
	}

	public static int f(int x) {

		if (x >= 4) {
			return x +  f(x - 1);
		} else {
			return 2 * x;
		}
	}
}
