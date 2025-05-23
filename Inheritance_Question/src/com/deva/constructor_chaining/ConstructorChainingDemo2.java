/*super("NIT") : It must be written by user. It is used to call 
               parameterized constructor of super class.*/

package com.deva.constructor_chaining;

class animal{
	protected String name;
	public animal(String name) {
		super();
		this.name=name;
	}
}
class dog extends animal{

	public dog(String dogname) {
		super(dogname);
		
	}
	public String getdogname() {
		return this.name;
	}
	
}

class tiger extends animal{
	public tiger(String tigername) {
		super(tigername);
	}
	public String gettigername() {
		return this.name;
	}
}

public class ConstructorChainingDemo2 {

	public static void main(String[] args) {
		dog tommy = new dog("tommy");
		System.out.println("dog name is :"+tommy.getdogname());
		
		tiger tiger = new tiger("tiger");
		System.out.println("tiger name is :"+tiger.gettigername());

	}

}
