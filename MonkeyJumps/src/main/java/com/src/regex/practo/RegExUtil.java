package com.src.regex.practo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExUtil {
	private static final String SANITIZE_RULE = "[\\p{L}0-9,]";
	private static String pattern;
	private static String line;

	public static void main(String[] args) {
		System.out.println("Enter rule here");
		Scanner sc = new Scanner(System.in);
		pattern = sc.nextLine();
		Pattern r = Pattern.compile(pattern);
		System.out.println("Enter input string here");
		line = sc.nextLine();
		Matcher m = r.matcher(line);
		String result = m.replaceAll("");
		System.out.println("Result: " + result);

	}
}
