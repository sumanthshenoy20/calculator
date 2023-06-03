package com.ty;

public class Calculator {
	 void add() {
		System.out.println("add method");
	}
	 void sub() {
		System.out.println("sub method");
	}
	 void div() {
		System.out.println("div method");
	}
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.div();
	}

}
