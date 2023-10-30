package com.practice.javaoops;

public class MathOperationsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathOperationsTwo m = new MathOperationsTwo();
		System.out.println("Sum of two numbers: " + (m.add(10, 20)));

	}
	
	//WITH Parameter and WITH Return Type
	public int add(int a, int b) {
		return a + b;
	}

}
