package com.nit.string;

public class StringConcatoDemo02 {

	public static void main(String[] args) {
		
		String s1="data";
		String s2="base";
		
		String concat =s1.concat(s2);
		System.out.println("string after concatenation is " + concat);

		System.out.println("-------------------");
		
		String s3="hyderabad is an";
		concat =s3.concat("it city");
		System.out.println("string after concatenation is " + concat);
		
		System.out.println("-------------------");
		
		String s4="java is ";
		String s5= "a great programing language";
		concat=s4+s5;
		System.out.println("string after concatenation " +concat);
	}

}
