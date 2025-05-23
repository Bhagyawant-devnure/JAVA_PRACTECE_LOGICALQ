package com.deva.constructor_chaining;

/*Case 4 :
---------
this("java") : Must be explicitly written by user in the
           first line of constructor. It is used to call
           parameterized constructor of current class.*/


class base {
	public base() {
		this(50);
		System.out.println("no argument constructor of base class");
	}
	public base (int y) {
		System.out.println	("Parameterized Constructor of Base class :"+y);
	}
}

class derived extends base{
	public derived() {
		System.out.println("no argument constructor of derived class");
	}
}
public class ConstructorChainingDemo4 {

	public static void main(String[] args) {
		new derived();

	}

}
