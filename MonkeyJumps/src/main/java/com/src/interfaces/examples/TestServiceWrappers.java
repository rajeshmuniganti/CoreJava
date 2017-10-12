package com.src.interfaces.examples;

public class TestServiceWrappers implements RootService {
	static ServiceImpl child;

	public TestServiceWrappers(ServiceImpl childServ) {
		this.child = childServ;
	}

	@Override
	public String sayHello() {
		String hello = child.sayHello();
		System.out.println("called sayHello from TestServiceWrappers.sayHello()--- " + hello);
		/*
		 * String bye = child.sayGoodbye(); System.out.
		 * println("called sayGoodbye from TestServiceWrappers.sayHello()--- " +
		 * hello);
		 */
		return hello;
	}

	public static void main(String[] args) {
		TestServiceWrappers obj = new TestServiceWrappers(child);
		child.sayHello();
	}

}
