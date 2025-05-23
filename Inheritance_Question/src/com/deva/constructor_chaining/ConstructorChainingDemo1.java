package com.deva.constructor_chaining;



	class Alpha {
		public Alpha() {
			super();
			System.out.println("no argument constructor of alpha class");
		}
	}
	class beta extends Alpha{
		public beta() {
			super();
			System.out.println("no argument constructor of beta class");
		}
	}
	public class ConstructorChainingDemo1 
	{
	public static void main(String[] args) {
		new beta();
	}

}
