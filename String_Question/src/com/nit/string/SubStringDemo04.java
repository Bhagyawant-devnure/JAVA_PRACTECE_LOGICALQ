package com.nit.string;

public class SubStringDemo04 {

	public static void main(String[] args) {
		
		String str ="Hyderabad";
		System.out.println(str.substring(2));
		System.out.println(str.substring(1,9));
		System.out.println(str.substring(7,5));//StringIndexOutOfBoundException
	}

}
