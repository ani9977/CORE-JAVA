package com.rays.basicProgram;

public class FunctionalIntfLembdaTest {

	public static void main(String[] args) {

		FunctionalIntf f = (a, b) -> {
			return (a + b);
		};

		int a = 20;
		int b = 15;

		System.out.println(f.sum(a, b));
		f.sub(a, b);
		FunctionalIntf.multi(a, b);

	}
}
