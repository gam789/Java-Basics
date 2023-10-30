package com.practice.javaoops;

public class ConstructorTwoParameterized {
	
	int empID;
	int salary;
	String designation;
	
	public ConstructorTwoParameterized(int empID, int salary, String designation) {
		this.empID = empID;
		this.salary = salary;
		this.designation = designation;
	}
	
	/*public ConstructorTwoParameterized(int id, int sal,String design) {
		empID = id;
		salary = sal;
		designation = design;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorTwoParameterized c = new ConstructorTwoParameterized(25, 78000, "AST");
		
		System.out.println(c.empID);
		System.out.println(c.salary);
		System.out.println(c.designation);

	}

}
