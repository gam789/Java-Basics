package com.practice.javaoops;

class Animal1{
	public void eat() {
		System.out.println("Eating");
	}
}

class Dog1 extends Animal1{
	public void bark() {
		System.out.println("Barking");
	}
}

class Cat1 extends Animal1 {
	public void meow() {
		System.out.println("Meowing");
		
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 a = new Animal1();
		a.eat();
		
		Dog1 d = new Dog1();
		d.eat();
		d.bark();
		
		
		Cat1 c = new Cat1();
		c.eat();
		c.meow();

	}

}
