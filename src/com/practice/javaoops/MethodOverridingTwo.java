package com.practice.javaoops;

class Car{
	
	public void speedUp() {
		System.out.println("Increase speed");
	}
	
	public void speedDown() {
		System.out.println("Decrease speed");
	}
}

class Bmw extends Car{

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		super.speedUp();
		System.out.println("Bmw speeds up faster");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		super.speedDown();
		System.out.println("Bmw slow downs and brake faster");
	}
	
}

public class MethodOverridingTwo {
	public static void main(String[] args) {
		
		Bmw b1 = new Bmw();
		b1.speedUp();
		b1.speedDown();
		
		
	}

}
