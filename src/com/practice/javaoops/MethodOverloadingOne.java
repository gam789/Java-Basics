package com.practice.javaoops;

class MathOperation{
	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b, int c) {
		int d = a+b+c;
		System.out.println(d);
	}
	
}

public class MethodOverloadingOne {
	public static void main(String[] args) {
		
		MathOperation m1 = new MathOperation();
		
		m1.add(1, 2);
		m1.add(1, 2, 3);
		
	}

}
