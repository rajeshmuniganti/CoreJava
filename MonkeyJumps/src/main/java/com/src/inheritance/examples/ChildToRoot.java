package com.src.inheritance.examples;

public class ChildToRoot implements RootInterface {

	private ChildToRoot(){
		
	}
	public static String sayHello() {
		return "Inside ChildToRoot.sayHello()";
	}
	/*public String instanceMethod() {
		return "Inside ChildToRoot.instanceMethod()";
	}*/

	public static void main(String[] args) {
		//RootClass root = new RootClass();
		ChildToRoot root = new ChildToRoot();
		System.out.println(root.sayHello());
		System.out.println(root.instanceMethod());

	}
}
