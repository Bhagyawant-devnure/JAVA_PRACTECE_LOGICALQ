package com.nit.string;

public class ReplaceDemo03 {

	public static void main(String[] args) {
		String str ="oaoaoaoa";
		String replace =str.replace('a','A');
		System.out.println("String after replacement "+replace);
		System.out.println("-------------------");
		
		String s1 = "mango";
		replace =s1.replace("man", "dam");
		System.out.println(replace);
	
	}

}
