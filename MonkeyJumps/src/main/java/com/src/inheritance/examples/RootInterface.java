package com.src.inheritance.examples;

public interface RootInterface {
	
	default public String instanceMethod(){
		return "From RootInterface.instanceMethod()";
	}
}
