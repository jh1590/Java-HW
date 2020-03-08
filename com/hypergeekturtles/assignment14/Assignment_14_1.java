package com.hypergeekturtles.assignment14;

import java.util.*;

public class Assignment_14_1 {

	public static void main(String[] args) {

		HashMap<String, String> mappy = new HashMap<String, String>();
		mappy.put("a", "aaa");
		mappy.put("b", "aaa");
		mappy.put("c", "cake");
		Map<String,String> m1 = mapAB2(mappy);
		System.out.println("1." + m1);
		mappy.clear();
		mappy.put("a","aaa");
		mappy.put("b","bbb");
		Map<String,String> m2 = mapAB2(mappy);
		System.out.println("2." + m2);
		mappy.clear();
		mappy.put("a","aaa");
		mappy.put("b","bbb");
		mappy.put("c","aaa");
		Map<String,String> m3 = mapAB2(mappy);
		System.out.println("3." + m3);
	}

	public static Map<String, String> mapAB2(Map<String, String> map) {

		String a = map.get("a");
		String b = map.get("b");

		if (a == b) {
			map.remove("a");
			map.remove("b");
		}
		return map;
	}
}