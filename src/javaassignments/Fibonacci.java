package javaassignments;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0,1,1,2,3
		int firstnum = 0;
		int secondnum = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to which series need to printed: ");
		int nthNumber =sc.nextInt();
		
		System.out.println("Fibonacci Series is: ");
		
		for(int i=0; i<nthNumber; i++) {
			int sum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = sum;
			System.out.print(" "+sum);
		}
		sc.close();
	}

}
