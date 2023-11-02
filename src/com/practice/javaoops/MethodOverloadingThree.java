package com.practice.javaoops;

class MutliplyOperationOne{
	
	public void multiply(int a, double b) {
		double c = a*b;
		System.out.println(c);
	}
	
	public void multiply(double a, int b) {
		double c = a * b;
		System.out.println(c);
	}
	
}

public class MethodOverloadingThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MutliplyOperationOne m = new MutliplyOperationOne();
		m.multiply(2, 2.555);
		m.multiply(2.65, 2);

	}

}
