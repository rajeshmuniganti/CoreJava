package com.src.interfaces.examples;

public class RootServiceTest2 extends RootServiceTest {
	public RootServiceTest2(RootService service) {
		super(service);
	}

	public static void main(String[] args) {
		RootService service = null;
		RootServiceTest2 test2 = new RootServiceTest2(service);
		System.out.println(test2.sayHello());
		
	}
}
