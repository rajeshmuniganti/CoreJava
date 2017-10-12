package com.system.variables;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two string values");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(isAnagramWay2(str1, str2) ? "Anagrams" : "Not anagrams");
	}

	static boolean isAnagram(String a, String b) {
		char[] str1Array = a.toLowerCase().toCharArray();
		char[] str2Array = b.toLowerCase().toCharArray();
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		boolean ret = Arrays.equals(str1Array, str2Array) ? true : false;
		return ret;

	}

	static boolean isAnagramWay2(String a, String b) {
		if (a.length() != b.length())
			return false;

		a = a.toLowerCase();
		b = b.toLowerCase();

		int[] temp = new int[Character.MAX_VALUE];
		// sry, too lazy to calculate ASCII idx of a-z rel. i :)
		int summ = 0;
		for (int i = 0; i < a.length(); i++) {
			summ += ++temp[a.charAt(i)] <= 0 ? -1 : 1;
			System.out.println("Plus: "+summ);
			summ += --temp[b.charAt(i)] >= 0 ? -1 : 1;
			System.out.println("minus: "+summ);
		}
		return summ == 0;
	}
}
