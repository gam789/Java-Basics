package com.practice.javaoops;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		
		int originalNumber = num;
		
		int reversedNumber = 0;
		int temp = num;
		while(temp >0) {
			
			int remainder = temp % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			temp =  temp / 10;
			
		}
		
		
		
		if(originalNumber == reversedNumber) {
			System.out.println("Palindrome");
		}
		
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
