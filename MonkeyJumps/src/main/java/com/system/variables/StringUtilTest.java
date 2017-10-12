package com.system.variables;

public class StringUtilTest {
	private static String address = "308 DIVISION ST APT 1";

	public static void main(String[] args) {
		String addrLine1 = null;
		String addrLine2 = null;
		addrLine1 = address.substring(0, address.indexOf("APT"));
		addrLine2 = address.substring(address.indexOf("APT"));
		System.out.println("Address Line 1:" + addrLine1);
		System.out.println("Address Line 2:" + addrLine2);
	}
}
