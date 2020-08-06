package com.lti;

public class Calculator {
	
	public static void add(int a,int b) {
		System.out.println("Sum= "+(a+b));
	}
	
	public static void diff(int a,int b) {
		System.out.println("Difference= "+(a-b));
	}
	
	public static void prod(int a,int b) {
		System.out.println("Difference= "+(a*b));
	}
	
	public static void div(int a,int b) {
		System.out.println("Quotient= "+(a/b));
	}

	public static void main(String[] args) {
		add(10,30);
		diff(30,10);
		prod(2, 5);
	}

}
