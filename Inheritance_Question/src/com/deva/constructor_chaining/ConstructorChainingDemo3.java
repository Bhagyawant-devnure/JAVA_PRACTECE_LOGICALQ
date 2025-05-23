/*Case 3 :
--------*/
/*this() : Must be explicitly written by user in the
         first line of constructor. It is used to call
          no argument constructor of current class.*/


package com.deva.constructor_chaining;

class Super{
	public Super() {
		super();
		System.out.println("no argument constructor of super class");
	}
	public Super(int x) {
		System.out.println("parameterrized constructor of super class"+x);
		
	}
}
class sub extends Super{
	public sub(int val) {
		super(val);
			System.out.println("parameterrized constructor of sub class");
		}
	}


public class ConstructorChainingDemo3 {

	public static void main(String[] args) {
		new sub(12);

	}

}
