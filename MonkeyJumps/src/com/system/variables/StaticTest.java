package com.system.variables;

public class StaticTest {
	static int staticVariable = 1;
	private int nonStaticVariable = 0;

	public static void main(String[] args) {
		staticVariable = staticVariable + 1;
		System.out.println(staticVariable);
		StaticTest t1 = new StaticTest();
		System.out.println(t1.staticVariable);
	}

	static {
		System.out.println("Inside Static Block");
		staticVariable = staticVariable + 1;
	}

	static void method() {
		System.out.println("Inside static method");
		staticVariable = staticVariable + 1;
	}

	private class NestedClass {
		int v = StaticTest.this.nonStaticVariable;
	}
}
