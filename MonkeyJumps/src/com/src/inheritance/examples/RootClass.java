package com.src.inheritance.examples;

public class RootClass {

	private RootClass(){
	}
	public static String sayHello() {
		return "Inside RootClass.sayHello()";
	}

	public String instanceMethod() {
		return "Inside RootClass.instanceMethod()";
	}
}
