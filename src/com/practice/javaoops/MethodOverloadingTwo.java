package com.practice.javaoops;

class MutliplyOperation{
	
	public void multiply(int a, int b) {
		int c = a*b;
		System.out.println(c);
	}
	
	public void multiply(int a, double b) {
		double c = a * b;
		System.out.println(c);
	}
	
}

public class MethodOverloadingTwo {
	public static void main(String[] args) {
		
		MutliplyOperation m = new MutliplyOperation();
		m.multiply(2, 2.555);
		m.multiply(2, 2);
	}

}
