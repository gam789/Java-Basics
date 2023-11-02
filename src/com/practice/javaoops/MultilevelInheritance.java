package com.practice.javaoops;

class Animal{
	
	public void eating() {
		System.out.println("Eating");
	}
}

class Dognew extends Animal{
	public void barking() {
		System.out.println("Barking");
	}
}

class Babydog extends Dognew{
	public void weeping() {
		System.out.println("Weeping");
	}
}



public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		a.eating();
		
		Dognew d = new Dognew();
		d.eating();
		d.barking();
		
		Babydog b = new Babydog();
		b.eating();
		b.barking();
		b.weeping();
				

	}

}
