package com.practice.javaoops;

class Parent{
	int a = 1;
	void m1() {
		System.out.println("Nokia");
	}
}

class Child extends Parent{
	
	void m1() {
		super.m1();
		System.out.println(super.a);
		System.out.println("iPhone");
	}
}

public class MethodOveridingOne {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.m1();
		
	}

}
