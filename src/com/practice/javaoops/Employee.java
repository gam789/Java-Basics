package com.practice.javaoops;

public class Employee {
	
	int empId;
	String empName;
	
	int salary;
	int depNo;
	
	static String companyName = "Luminar";
	
	public void display() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee salary: " + salary);
		System.out.println("Department no: " + depNo);
	}
	
	public static void main(String[] args) {
		 
		Employee emp = new Employee();
		
		emp.empId = 1;
		emp.empName = "Mathew Tom";
		emp.salary = 25000;
		emp.depNo = 10;
		
		emp.display();
		
		System.out.println(companyName);
		System.out.println(Employee.companyName);
	}

}
