package com.src.functional.interfaces;

@FunctionalInterface
public interface ComplexFunctionalInterface extends SampleFunctionalInterface {
	default public void doSomeWork() {
		System.out.println("Inside ComplexFunctionalInterface.doSomeWork()");
	}
}
