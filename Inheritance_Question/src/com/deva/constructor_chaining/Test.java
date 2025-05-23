package com.deva.constructor_chaining;

class A{
	public A() {
		System.out.println("A");
	}
}
class b extends A {}
class c extends b{
	public c() {
		System.out.println("c");
	}
}
public class Test {

	public static void main(String[] args) {
		new c();

	}

}
