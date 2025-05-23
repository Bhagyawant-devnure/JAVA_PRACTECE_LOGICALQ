package com.deva.vairable_hiding;


class Father{
	protected double balance = 50000;
	
}
class Son extends Father{
	protected double balance= 18000;
	public void showBalance() {
		System.out.println("son balance is :"+this.balance);
		System.out.println("father balance is :"+super.balance);
		
	}
}
public class VairableHidingdemo01 {

	public static void main(String[] args) {
		
Son s1= new Son();
s1.showBalance();
	}

}
