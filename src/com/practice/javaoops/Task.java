package com.practice.javaoops;

class Monkey{
	
	public void jump() {
		System.out.println("Monkey jumps.");
	}
	
	public void bite() {
		System.out.println("Monkey bites.");
	}
		
}

class Human extends Monkey implements BasicAnimal{
	
	public void speaks() {
		System.out.println("Human speaks");
	}

	@Override
	public void cat() {
		// TODO Auto-generated method stub
		System.out.println("Cat");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Sleep");
		
	}
}

interface BasicAnimal{
	
	void cat();
	void sleep();
}

public class Task {
	public static void main(String[] args) {
		
		Human h = new Human();
		
		h.jump();
		h.bite();
		
		h.speaks();
		
		h.cat();
		h.sleep();
		
	}

}
