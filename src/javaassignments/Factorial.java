//2.Program to print the factorial of a number
package javaassignments;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 3;
		int factorial = 1;
		
		for(int i=1; i<=number; i++) {
			factorial = factorial * i;
			//System.out.println("Factorial:" + factorial);
		}
		
		System.out.println("Factorial is:" + factorial);

	}

}
