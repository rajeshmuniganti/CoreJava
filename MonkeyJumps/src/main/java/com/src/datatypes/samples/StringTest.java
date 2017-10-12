package com.src.datatypes.samples;

public class StringTest {
	public static void main(String[] args) {
		String reasontxt = "exception: java.lang.IllegalStateException: Could not get part '30.02.02.02.02' from TOS&#13;";
		System.out.println(reasontxt.replaceAll("&#13;", ""));
	}
}
