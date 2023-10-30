package com.practice.javaoops;

public class ConstructorOneDefault {
	
	int empID;
	int salary;
	String designation;
	
	
	public ConstructorOneDefault() {
		empID = 1;
		salary = 25000;
		designation = "AST";
	}

	
	public static void main(String[] args) {
		
		ConstructorOneDefault c = new ConstructorOneDefault();
		System.out.println(c.empID);
		System.out.println(c.salary);
		System.out.println(c.designation);
		
	}

}
