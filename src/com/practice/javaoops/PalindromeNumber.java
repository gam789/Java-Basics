package com.practice.javaoops;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		
		int originalNumber = num;
		
		int rev = 0;
		
		while(num>0) {
			rev = rev * 10 + num%10;
			num = num / 10;
		}
		
		
		
		if(originalNumber == rev) {
			System.out.println("Palindrome");
		}
		
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
