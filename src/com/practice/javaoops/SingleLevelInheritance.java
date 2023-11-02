package com.practice.javaoops;

//SINGLE LEVEL INHERITANCE
class Dog{
	public void eating(){
		System.out.println("Animals eats.");
	}
	
	
	public void barking() {
		System.out.println("Dog barks");
	}
	
}

class Cat extends Dog{
	
	public void meow() {
		System.out.println("Cat makes meow sounds");
	}
}



public class SingleLevelInheritance {
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eating();
		d.barking();
		
		Cat c = new Cat();
		c.eating();
		c.barking();
		c.meow();
		
	}

}
