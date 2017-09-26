package com.src.interfaces.examples;

public class ServiceImpl implements RootService {

	private ChildService child;

	public ServiceImpl(ChildService childService) {
		this.child = childService;
	}

	@Override
	public String sayHello() {
		String hello = child.sayHello();
		System.out.println("called sayHello from ServiceImpl.sayHello()--- "+hello);
		String bye = child.sayGoodbye();
		System.out.println("called sayGoodbye from ServiceImpl.sayHello()--- "+hello);
		return hello;
	}
	
}
