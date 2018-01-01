package com.src.functional.interfaces;

public class FunctionalInterfaceImpl {
	public static void main(String[] args) {
		carryOutWork(new SampleFunctionalInterface() {
			@Override
			public void doWork() {
				System.out.println("Inside FunctionalInterfaceImpl.carryOutWork");

			}
		});
	}

	private static void carryOutWork(SampleFunctionalInterface sampleFunctionalInterface) {
		sampleFunctionalInterface.doWork();
	}
}
