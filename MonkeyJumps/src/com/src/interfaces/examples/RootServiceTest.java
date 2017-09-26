package com.src.interfaces.examples;

public class RootServiceTest extends RootServiceImpl {
	public RootServiceTest(RootService service) {

	}

	public static void main(String[] args) {
		RootService service = null;
		RootServiceTest test = new RootServiceTest(service);
		System.out.println(test.sayHello());
	}
}

