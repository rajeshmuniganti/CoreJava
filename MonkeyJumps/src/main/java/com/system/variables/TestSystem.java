package com.system.variables;

import java.util.ArrayList;
import java.util.List;

public class TestSystem {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList();
		l1.add(123);
		l1.add(Integer.valueOf("hi"));
		System.out.println(l1);
	}
}
