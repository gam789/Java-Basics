package javaassignments;

class Members {
	String name;
	int age;
	String address;
	int salary;
	
	public void printDetails(){
		System.out.println("Name is: " +name);
		System.out.println("Age is: " +age);
		System.out.println("Address is: " +address);
		System.out.println("Salary is: " +salary);
		
	}
}
class Worker extends Members{
	String specialization;
	
}

class Manager extends Members{
	String department;
}


public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w1 = new Worker();
		w1.name = "Ram";
		w1.age = 50;
		w1.address = "House No. 34, Kochi.";
		w1.salary = 50000;
		w1.printDetails();
		w1.specialization = "Advanced Manufacturing Technology";
		System.out.println("Specialization is: " +w1.specialization);
		
		System.out.println();
		
		Manager m1 = new Manager();
		m1.name = "John";
		m1.age = 45;
		m1.address = "House No. 101, Thiruvanthapuram.";
		m1.salary = 60000;
		m1.printDetails();
		
		m1.department = "Engineering";
		System.out.println("Department is: " +m1.department);
	}

}
