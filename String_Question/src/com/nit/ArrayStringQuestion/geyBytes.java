package com.nit.ArrayStringQuestion;

public class geyBytes {

	public static void main(String[] args) {
		String s = "ABCDEF";
		byte [] b =s.getBytes();
		
		for(byte a : b) {
			System.out.println(a);
		}
	}

}
