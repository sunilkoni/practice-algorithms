package com.algos.overrideload;

public class Test {

	public static void main(String[] args) {
		//method(null);
		method(new Parent());
		Child c = new Child();
		Parent c1 = new Child();
		
		StaticClass s = new StaticClass();
		
		c.callMeStatic();
		c1.callMeStatic();
	}

	private static void method(Object object) {
		System.out.println("Object");
	}
	private static void method(String object) {
		System.out.println("String");
	}
	/*
	 * private static void method(Parent object) { System.out.println("String"); }
	 */

}
