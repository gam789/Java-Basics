package com.practice.javaoops;

public class EmployeeMethod {
	
	int empID;
	int salary;
	String designation;
	
	
	public void setValues(int empID, int salary, String designation) {
		this.empID = empID;
		this.salary = salary;
		this.designation = designation;
	}

	/*public void setValues(int id, int sal, String design) {
		empID = id;
		salary = sal;
		designation = design;
	}*/
	
	public void display() {
		System.out.println("Employee ID: " +empID);
		System.out.println("Employee salary: " + salary);
		System.out.println("Employee desination: " + designation);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeMethod e = new EmployeeMethod();
		e.setValues(1990564, 25000, "AST");
		e.display();
	}

}
