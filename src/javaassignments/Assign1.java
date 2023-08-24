package javaassignments;

interface BasicAnimal {
	
	void cat();
	
	void sleep();
	
}

class Monkey{
	void jump() {
		System.out.println("Mokey jumps :)");
	}
	
	void bite() {
		System.out.println("Monkey bites :(");
	}
}

class Human extends Monkey implements BasicAnimal{
	void speak() {
		System.out.println("Hai,I am Human.");
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





public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human();
		
		h1.jump();
		h1.bite();
		h1.speak();
		
		System.out.println();
		
		//Human h2 = new Human();
		h1.cat();
		h1.sleep();

	}

}
