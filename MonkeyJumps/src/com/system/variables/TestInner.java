package com.system.variables;

public class TestInner {

	private String sayHello() {
		return "Say Hello from TestInner";
	}

	public class TestInnerClass {
		private String sayHello() {
			return "say Hello from TestInner1";
		}
	}

	/*public static void main(String[] args) {
		TestInner t1 = new TestInner();
		System.out.println(t1.sayHello());
		TestInnerClass t2 = t1.new TestInnerClass();
		System.out.println(t2.sayHello());
	}*/
}
